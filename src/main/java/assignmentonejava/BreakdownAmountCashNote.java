package assignmentonejava;

import java.util.Scanner;

// Write a program that will breakdown the amount and count notes for any given amount. Here is the notes in the
// given array: notes=[1000,500,200,100,50,20,10,5,2,1]

public class BreakdownAmountCashNote {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount: ");

        int number = input.nextInt();

        int nt1000, nt500, nt200, nt100, nt50, nt20, nt10, nt5, nt2, nt1;
        nt1000 = nt500 = nt100 = nt200 = nt50 = nt20 = nt10 = nt5 = nt2 = nt1 = 0;


        if (number >= 1000)
            nt1000 = number / 1000;
        number -= nt1000 * 1000;

        if (number >= 500)
            nt500 = number / 500;
        number -= nt500 * 500;

        if (number >= 200)
            nt200 = number / 200;
        number -= nt200 * 200;

        if (number >= 100)
            nt100 = number / 100;
        number -= nt100 * 100;

        if (number >= 50)
            nt50 = number / 50;
        number -= nt50 * 50;

        if (number >= 20)
            nt20 = number / 20;
        number -= nt20 * 20;

        if (number >= 10)
            nt10 = number / 10;
        number -= nt10 * 10;

        if (number >= 5)
            nt5 = number / 5;
        number -= nt5 * 5;

        if (number >= 2)
            nt2 = number / 2;
        number -= nt2 * 2;

        if (number >= 1)
            nt1 = number;

        System.out.println("Total Number of Notes");
        System.out.println("1000 = " + nt1000);
        System.out.println("500 = " + nt500);
        System.out.println("200 = " + nt200);
        System.out.println("100 = " + nt100);
        System.out.println("50 = " + nt50);
        System.out.println("20 = " + nt20);
        System.out.println("10 = " + nt10);
        System.out.println("5 = " + nt5);
        System.out.println("2 = " + nt2);
        System.out.println("1 = " + nt1);

    }
}