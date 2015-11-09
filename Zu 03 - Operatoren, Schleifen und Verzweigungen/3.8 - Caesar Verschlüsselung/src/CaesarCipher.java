public class CaesarCipher {

    public static void main(String[] args) {
        // Nachricht die verschlüsselt und im Anschluss wieder entschlüsselt werden soll:
        String startMessage = "abcdefghijklmnopqrstuvwxyz";
        String encryptedMessage;
        String decryptedMessage;

        // Mit diesem Schlüssel wird die Nachricht ver- und wieder entschlüsselt
        int encryptionKey = 3;

        System.out.println("Unverschlüsselte Nachricht : " + startMessage);
        System.out.println("Key zur Verschlüsselung    : " + encryptionKey);

        System.out.println("---------------");

        // Verschlüssle die Nachricht und gibt sie auf der Konsole aus
        encryptedMessage = encryptAlternative1(startMessage, encryptionKey);
        System.out.println("Verschlüsselte Nachricht #1: " + encryptedMessage);

        encryptedMessage = encryptAlternative2(startMessage, encryptionKey);
        System.out.println("Verschlüsselte Nachricht #2: " + encryptedMessage);

        System.out.println("---------------");

        // Entschlüssle die vorher verschlüsselte Nachricht wieder zurück und gibt das Erbnis auf der Konsole aus
        // Der ausgegebene Text sollte der "startMessage" entsprechen
        decryptedMessage = decryptAlternative1(encryptedMessage, encryptionKey);
        System.out.println("Entschlüsselte Nachricht #1: " + decryptedMessage);

        decryptedMessage = decryptAlternative2(encryptedMessage, encryptionKey);
        System.out.println("Entschlüsselte Nachricht #2: " + decryptedMessage);
    }

    public static String encryptAlternative1(String text, int key) {
        String output = "";

        // Algorithmus: (P + K) mod 26, wobei P hier der zu verschlüsselnde Buchstabe und K der Key ist
        for (char c : text.toCharArray()) {
            int encryptedC = (((c - 'a') + key) % 26) + 'a';
            output += (char)encryptedC;
        }

        return output;
    }

    public static String encryptAlternative2(String text, int key) {
        String output = "";

        for (char c : text.toCharArray()) {
            // Umwandlung des derzeitigen Buchstabens der "startMessage" zu int
            int cInt = (int) c;
            for (int i = 1; i <= key; i++) {
                // Zyklische Verschiebung nach rechts
                cInt++;
                if (cInt == ('z' + 1)) {
                    cInt = 'z' + 1 - 26;
                }
            }
            output += (char)(cInt);
        }

        return output;
    }

    public static String decryptAlternative1(String text, int key) {
        String output = "";

        for (char c : text.toCharArray()) {
            int encryptedC = (((c - 'a') - key) % 26) + 'a';
            if (encryptedC < 'a') {
                encryptedC += 'z' - 'a' + 1;
            }
            output += (char)encryptedC;
        }

        return output;
    }

    public static String decryptAlternative2(String text, int key) {
        String output = "";

        for (char c : text.toCharArray()) {
            // Umwandlung des derzeitigen Buchstabens der "startMessage" zu int
            int cInt = (int) c;
            for (int i = 1; i <= key; i++) {
                // Zyklische Verschiebung nach links
                cInt--;
                if (cInt == ('a' - 1)) {
                    cInt = 'a' - 1 + 26;
                }
            }
            output += (char)(cInt);
        }

        return output;
    }
}
