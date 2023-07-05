package assignmentonejava;

// Take any number as input and print the reverse of the number
// input: 12345

public class ReverseNumber {

    public static void main(String[] args) {

        int numbers = 12345;
        int reverse = 0;

        while(numbers!=0){

            int remaining = numbers%10;
            numbers = numbers/10;
            reverse = reverse*10+remaining;

        }

        System.out.println(reverse);

    }
}
