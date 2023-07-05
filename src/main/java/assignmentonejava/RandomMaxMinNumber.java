package assignmentonejava;

import java.util.Arrays;
import java.util.Random;

// Generate random 10 integer numbers in an array and print out all the numbers from array and also print the max
// and min number from the array

public class RandomMaxMinNumber {

    public static void main(String[] args) {

        int numbers[] = generateRandomNumbers(10);
        System.out.println("Generated Numbers: " + Arrays.toString(numbers));

        int maxNumber = findMaxNumber(numbers);
        System.out.println("Maximum Number: " + maxNumber);

        int minNumber = findMinNumber(numbers);
        System.out.println("Minimum Number: " + minNumber);

    }

    public static int[] generateRandomNumbers(int count) {
        int numbers[] = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt();
        }

        return numbers;
    }

    public static int findMaxNumber(int numbers[]) {
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {

            if (number > max) {
                max = number;
            }

        }

        return max;

    }

    public static int findMinNumber(int numbers[]) {
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }
}



