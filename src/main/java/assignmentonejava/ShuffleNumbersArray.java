package assignmentonejava;

import java.util.ArrayList;
import java.util.Collections;

// Write a program that will shuffle (values will randomly change their position) from the given array
// numbers=[1,2,3,4,5,6,7,8,9,0]

public class ShuffleNumbersArray {

    public static void main(String[] args) {


        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("1");
        mylist.add("2");
        mylist.add("3");
        mylist.add("4");
        mylist.add("5");
        mylist.add("6");
        mylist.add("7");
        mylist.add("8");
        mylist.add("9");
        mylist.add("0");

        System.out.println("Original List : \n" + mylist);
        //System.out.println("\n: "+mylist);

        Collections.shuffle(mylist);

        //System.out.println("\nShuffled List : \n" + mylist);
        System.out.println("shuffle list: " + mylist);

    }

}


