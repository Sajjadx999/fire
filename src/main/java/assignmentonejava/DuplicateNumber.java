package assignmentonejava;

//  Find out the duplicate numbers in the given array and in which position they are found.
//  numbers= [1,2,3,1,2,4,5,6,4]

public class DuplicateNumber {

    public static void main(String[] args) {

        int numbers[] ={1,2,3,1,2,4,5,6,4};

        System.out.println("Duplicate elements are: ");

        for (int i=0; i< numbers.length; i++){

            for (int j=i+1; j< numbers.length; j++){

                if (numbers[i] == numbers[j]){

                    System.out.println(numbers[j]);

                }
            }
        }



    }
}
