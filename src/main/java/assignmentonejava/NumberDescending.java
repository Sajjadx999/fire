package assignmentonejava;

// Write a program that will give following output:
// 12345
// 2345
// 345
// 45
// 5

public class NumberDescending {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            for (int j = i + 1; j <= rows; j++) {

                System.out.print(j);

            }

            System.out.println();

        }


    }
}
