package assignmentonejava;

// Print the prime numbers of 2 to 100

public class PrimeNumberTwoToHundred {

    public static void main(String[] args) {

        int i, j;

        for (i=2; i<=200; i++){

            for (j=2; j<i; j++){

                if (i % j == 0)

                    break;

            }

            if (i == j){

                System.out.println(i);
            }
        }
    }
}
