package assignmentonejava;

import java.util.Arrays;
import static java.util.Arrays.binarySearch;

//  Write a program that will find your key is found in the given array using binary search method
//  numbers=[1,6,9,3,5,4,7], Key=5


public class BinarySearchMethod {

         public static void binarySearch(int arr[], int first, int last, int key){

            int mid = (first + last)/2;

            while( first <= last ){

                if ( arr[mid] < key ){

                    first = mid + 1;

                }else if ( arr[mid] == key ){

                    System.out.println("Element is found at index: " + mid);
                    break;

                } else {

                    last = mid - 1;

                }

                mid = (first + last)/2;

            }

            if ( first > last ){

                System.out.println("Element is not found!");

            }

        }

        public static void main(String args[]){

            int arr[] = {1,6,9,3,5,4,7};
            int key = 5;
            int last=arr.length-1;
            binarySearch(arr,0,last,key);

        }

    }

