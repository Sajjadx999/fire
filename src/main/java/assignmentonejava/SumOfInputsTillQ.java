package assignmentonejava;

import java.util.Scanner;

// Write a program that will take integer numbers as user input continuously and print the sum of numbers until
// user input q from the keyboard. When user input q, program will be quit. If user inputs another character,
// then the program will ask to input the number again.

public class SumOfInputsTillQ {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int sum = 0;
        char ch;

        while (true){

            int numbers = input.nextInt();
            sum = sum+numbers;
            System.out.println(sum);
            System.out.println("Do you want to continue?");
            ch = input.next().charAt(0);

            if (ch == 'q'){

                break;

            }

        }

    }
}
