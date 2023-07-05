package assignmentonejava;

// Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//  "I live in Bangladesh"

public class CountWordsCharVowCons {

    public static void main(String[] args) {

        String str = "I live in Bangladesh";

        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        int sum =0;
        int whitespace =0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

           char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                vowels++;

            } else if (ch >= 'a' && ch <= 'z') {

                consonants++;

            } else if (ch >= '0' && ch <= '9') {

                digits++;

            } else if (ch == ' ') {

                spaces++;

            }

        }

        sum = vowels+consonants;

        whitespace= spaces+1;

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
        System.out.println("Total word: " + whitespace);
        System.out.println(sum);

    }
}
