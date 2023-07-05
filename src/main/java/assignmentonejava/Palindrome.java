package assignmentonejava;

// Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
// Input: Civic
// Output: true
// Input: One
// Output: false

public class Palindrome {

    public static void main(String[] args) {

        //String str = "one", reverseStr = "";
        String str = "civic", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {

            reverseStr = reverseStr + str.charAt(i);

        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {

            System.out.println("True");

        } else {

            System.out.println("False");

        }

    }
}