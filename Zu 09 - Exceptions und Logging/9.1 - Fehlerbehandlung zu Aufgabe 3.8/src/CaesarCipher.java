public class CaesarCipher {

    public static String encryptAlternative1(String text, int key) throws IllegalCapitalLetterException, InvalidCharacterException {
        String output = "";

        // Algorithmus: (P + K) mod 26, wobei P hier der zu verschlüsselnde Buchstabe und K der Key ist
        for (char c : text.toCharArray()) {
            if (c >= 'A' && c <= 'Z')
                throw new IllegalCapitalLetterException(Character.toString(c) + " in " + text );
            if (c <= 'a' ||c >= 'z')
                throw new InvalidCharacterException(Character.toString(c) + " in " + text );

            int encryptedC = (((c - 'a') + key) % 26) + 'a';
            output += (char)encryptedC;
        }

        return output;
    }

    public static String decryptAlternative1(String text, int key) throws IllegalCapitalLetterException, InvalidCharacterException {
        String output = "";

        for (char c : text.toCharArray()) {
            if (c >= 'A' && c <= 'Z')
                throw new IllegalCapitalLetterException(Character.toString(c) + " in " + text );
            if (c <= 'a' ||c >= 'z')
                throw new InvalidCharacterException(Character.toString(c) + " in " + text );

            int encryptedC = (((c - 'a') - key) % 26) + 'a';
            if (encryptedC < 'a') {
                encryptedC += 'z' - 'a' + 1;
            }
            output += (char)encryptedC;
        }

        return output;
    }
}
