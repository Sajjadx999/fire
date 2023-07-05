package assignmentonejava;

// Encrypt word: ROADTOSDET [when A=F]

public class EncryptWord {

    public static void main(String[] args) {

        String name = "ROADTOSDET";
        String encryptedtext = encrypt(name);
        System.out.println("Encryptedtext: " + encryptedtext);

    }


    public static String encrypt(String plaintext) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char currentChar = plaintext.charAt(i);

            if (Character.isLetter(currentChar)) {
                char encryptedChar = (char) (currentChar + 5); // Adding 5 to each character
                if (encryptedChar > 'Z') {
                    encryptedChar = (char) (encryptedChar - 26); // Wrap around to 'A' if it exceeds 'Z'
                }
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(currentChar); // Append non-alphabetic characters as is
            }
        }

        return encryptedText.toString();
    }
}
