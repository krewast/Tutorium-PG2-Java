import java.util.Scanner;

public class Aufgabe_2_4 {
    public static void main(String[] args) {
        int numberOfInputs = 0;     // Zähler, wie oft ein Benutzer bereits eine Zahl eingegeben hat
        String entireInput = "";
        float resultingSum = 0;
        float resultingProduct = 1;
        Scanner sc = new Scanner(System.in);

        // Endlosschleife, da ja beliebig viele Zahlen eingegeben werden können
        while (true) {
            // Check, ob bereits mehr als zwei Zahlen vom Benutzer eingeben wurden
            if (numberOfInputs >= 2) {
                System.out.print("Weitere Zahl eingeben (0/1)? ");
                // Nur wenn die Eingabe gleich 0 verlassen wir die Endlosschleife mit break
                if (sc.nextInt() == 0)  {
                    break;
                }
            }

            // Weitere Zahl vom Benutzer eingeben lassen
            System.out.print("Bitte Zahl eingeben: ");
            float newInput = sc.nextFloat();

            entireInput += String.format("%.2f, ", newInput);
            resultingSum += newInput;
            resultingProduct *= newInput;

            numberOfInputs++;
        }

        sc.close();

        // Ausgabe
        System.out.println("--------------------------");
        System.out.println(String.format("Sie haben eingegeben: %s", entireInput));
        System.out.println("Gesamtsumme:   " + resultingSum);
        System.out.println("Gesamtprodukt: " + resultingProduct);
    }
}
