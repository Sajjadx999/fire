package assignmentonejava;

import java.util.Scanner;

// A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse,
// what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate
// the price]

public class TotalCostAfterDiscount {

    public static void main(String[] args) {

        //int x, y, sum, tot, fin;
        Scanner input = new Scanner(System.in);
        System.out.print("core i 7 laptop price is: ");
        int x = input.nextInt();
        System.out.print("gaming mouse price is: ");
        int y = input.nextInt();

        //int sum = sum(x, y);
        int sum = x+y;
        System.out.println("Total cost without discount: " + sum);

        int total = sum / 100 * 15;
        System.out.println(" the amount after 15% discount:  " + total);

        int overall = sum - total;
        System.out.println("Final amount tk:  " + overall);


    }

    //method that calculates the sum
    public static int sum(int x, int y) {

        int sum = x + y;
        return sum;

    }
}
