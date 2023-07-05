package assignmentonejava;

// Write a program that will find your key is found in the given array using linear search method
// numbers=[1,6,9,3,5,4,7], Key = 5


public class LinearSearchMethod {

    public static void main(String[] args) {

        int i, key = 5;
        int numbers[]={1,6,9,3,5,4,7};

        for (i= 0; i < numbers.length; i++){

            if (numbers[i] == key) {

                System.out.println(key+" is present at location "+(i));
                break;

            }

        }

        if (i == numbers.length)

            System.out.println(key + " doesn't exist in array.");


    }
}
