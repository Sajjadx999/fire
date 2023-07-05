package assignmentonejava;

// Find out the second largest element of the given array
// numbers=[5,3,9,7,4,1,8]

public class SecondLargestNumber {

    public static void main(String[] args) {

        int largest = 0;
        int secondLargest = 0;

        int numbers[] = {5,3,9,7,4,1,8};

        for (int i=0; i<numbers.length; i++){

            if (numbers[i]>largest){

                //secondLargest = largest;

                largest = numbers[i];

            } else if (numbers[i]>secondLargest) {

                secondLargest = numbers[i];

            }

        }

        System.out.println("The second largest Number is: "+ secondLargest);

    }
}
