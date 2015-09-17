public class CaesarCipher {
    public static void main(String[] args) {
        // Nachricht die verschlüsselt und im Anschluss wieder entschlüsselt werden soll:
        String startMessage = "programmieren";

        // Mit diesem Schlüssel wird die Nachricht ver- und wieder entschlüsselt
        int encryptionKey = 3;

        // Verschlüssle die Nachricht und gibt sie auf der Konsole aus
        String encryptedMessage = encrypt(startMessage, encryptionKey);
        System.out.println("Verschlüsselte Nachricht: " + encryptedMessage);

        // Entschlüssle die vorher verschlüsselte Nachricht wieder zurück und gibt das Erbnis auf der Konsole aus
        // Der ausgegebene Text sollte der "startMessage" entsprechen
        String decryptedMessage = decrypt(encryptedMessage, encryptionKey);
        System.out.println("Entschlüsselte Nachricht: " + decryptedMessage);
    }

    public static String encrypt(String text, int key) {
        String output = "";

        for (char c : text.toCharArray()) {
            // Umwandlung des derzeitigen Buchstabens der "startMessage" zu int
            int cInt = (int) c;
            for (int i = 1; i <= key; i++) {
                // Zyklische Verschiebung nach rechts
                cInt--;
                if (cInt == ('a' - 1)) {
                    cInt = 'a'- 1 + 26;
                }
            }
            output += (char)(cInt);
        }

        return output;
    }

    public static String decrypt(String text, int key) {
        String output = "";

        for (char c : text.toCharArray()) {
            // Umwandlung des derzeitigen Buchstabens der "startMessage" zu int
            int cInt = (int) c;
            for (int i = 1; i <= key; i++) {
                // Zyklische Verschiebung nach links
                cInt++;
                if (cInt == ('z' + 1)) {
                    cInt = 123 - 26;
                }
            }
            output += (char)(cInt);
        }

        return output;
    }
}
