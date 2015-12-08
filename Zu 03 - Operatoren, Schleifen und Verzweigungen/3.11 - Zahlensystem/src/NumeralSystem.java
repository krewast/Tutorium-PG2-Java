import java.util.Scanner;

public class NumeralSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNumber;
        String binaryString;
        String hexString;

        System.out.print("Bitte geben Sie eine Dezimalzahl ein: ");
        decimalNumber = sc.nextInt();
        sc.close();

        System.out.println("---------------");

        // Die simpelste Variante ist immer das zu nutzen, was bereits vorhanden ist!
        System.out.println("Binär #1: " + Integer.toBinaryString(decimalNumber));
        System.out.println("Binär #2: " + Integer.toString(decimalNumber, 2)); // 2 ist hier die Basis

        binaryString = transformToBinaryAlternative1(decimalNumber);
        System.out.println("Binär #3: " + binaryString);

        binaryString = transformToBinaryAlternative2(decimalNumber);
        System.out.println("Binär #4: " + binaryString);

        System.out.println("---------------");

        // Auch hier: Nutzen was bereits vorhanden ist! Dokumentation lesen hilft!
        System.out.println("Hex   #1: " + Integer.toHexString(decimalNumber));
        System.out.println("Hex   #2: " + Integer.toString(decimalNumber, 16)); // 16 ist hier die Basis

        hexString = transformToHex(decimalNumber);
        System.out.println("Hex   #3: " + hexString);
    }

    /*
     * Der in dieser Methode verwendete Algorithmus entspricht am ehesten der Konvertierung von Dezimal zu Binär von Hand
     * Dabei wird die Dezimalzahl durch 2 geteilt und nachgesehen, ob bei der Division ein Rest entsteht. Dieser Rest
     * ist entweder 0 oder 1 und entspricht unserem gesuchten Bit, welches im Anschluss links an den binaryString "gehängt"
     * wird. Dies geschieht so oft, bis bei einem Durchlauf die übriggebliebene Dezimalzahl nur noch 0 entspricht und somit
     * alle Bits gefunden wurden:
     * 30 : 2 = 15 - Rest: 0 (Der Rest entspricht jeweils dem gesuchten Bit 0 oder 1)
     * 15 : 2 =  7 - Rest: 1
     *  7 : 2 =  3 - Rest: 1
     *  3 : 2 =  1 - Rest: 1
     *  1 : 2 =  0 - Rest: 1
     * Resultat: 11110
     */
    static String transformToBinaryAlternative1(int decimalNumber) {
        String binaryString = "";

        while (decimalNumber > 0) {
            int bit = decimalNumber % 2;
            binaryString = bit + binaryString;
            decimalNumber = decimalNumber / 2;
        }

        return binaryString;
    }

    /*
     * Hier wird mit Hilfe von Bitverschiebungen und Masken gearbeitet. Die int-Zahl wird erst fast ganz nach rechts geschoben,
     * beim zweiten Durchlauf dann um eine Stelle weniger. Bei jedem Durchlauf wird die durch die Verschiebung entstandene Zahl
     * mit der Bitmaske von 1 "verundet", wodurch sich entweder eine 0 oder 1 ergibt, welche das gesuchte Bit darstellt. Dieses
     * Bit wird nun noch rechts and den binaryString angehängt, wodurch sich am Ende das für die eingegebenen Zahl gesuchte
     * Bitmuster ergibt.
     */
    static String transformToBinaryAlternative2(int decimalNumber) {
        int bitMask = 0x1;
        String binaryString = "";

        /*
         * Wir möchten nach der Umrechnung in die Binärdarstellung so wenige Bits wie möglich anzeigen.
         * Daher ist es notwendig herauszufinden, wie viele Bits wir mindestens brauchen, um die
         * übergebene Dezimalzahl speichern zu können. Dies geschieht mit unten aufgeführter Formel
         * http://stackoverflow.com/questions/12269096/how-many-bits-do-you-need-to-store-a-number
         */
        int minimalNumberOfBits = (int)(Math.floor(Math.log(decimalNumber) / Math.log(2)) + 1.0);

        for (int i = minimalNumberOfBits - 1; i >= 0; i--) {
            int bit = (decimalNumber >> i) & bitMask;
            binaryString += bit;
        }

        return binaryString;
    }

    /*
     * Diese Methode funktioniert im Prinzip wie die "transformToBinaryAlternative1", rechnet aber
     * natürlich in das Zahlensystem mit der Basis 16 um. Da hierfür nicht nur 0en und 1en benötigt
     * werden, sondern alle Ziffern von 0 bis 10, sowie die ersten Buchstaben des Alphabets, wird
     * zu Beginn ein Array mit eben diesen Werten angelegt. Mit Hilfe von Modulo lässt sich dann der
     * der entsprechende Wert finden und an den hexString links "anhängen".
     */
    static String transformToHex(int decimalNumber) {
        char[] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String hexString = "";

        while (decimalNumber > 0) {
            char hexDigit = hexArray[decimalNumber % 16];
            hexString = hexDigit + hexString;
            decimalNumber = decimalNumber / 16;
        }

        return hexString;
    }
}
