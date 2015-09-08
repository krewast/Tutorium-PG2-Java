// Hiermit geben wir bekannt, wo das Scanner-Objekt zu finden ist
import java.util.Scanner;

public class Aufgabe_2_3 {
    public static void main(String[] args) {
        // Deklaration der Variablen, in denen die Eingaben des Benutzers gespeichert werden
        // ACHTUNG: Wir arbeiten hier nun mit Fließkommzahlen!
        float a;
        float b;

        // Eine neues Scanner-Objekt initialisieren
        Scanner sc = new Scanner(System.in);
        // Nun nach der Eingabe fragen und diese dann in den vorher definierten Variablen speichern
        System.out.print("Bitte die erste Zahl eingeben: ");
        a = sc.nextFloat();
        System.out.print("Bitte die zweite Zahl eingeben: ");
        b = sc.nextFloat();
        // Scanner "schließen", um den verwendeten Arbeitsspeicher wieder freizugeben. Ab hier kann der obige Scanner nicht weiterverwendet werden
        sc.close();

        // Ausführen der einzelnen Berechnungen + Ausgabe
        System.out.println("Addition von       " + a + " und " + b + " = " + (a + b));
        System.out.println("Substraktion von   " + a + " und " + b + " = " + (a - b));
        // Spezialfall: Gibt der User für b eine 0 ein, entsteht eine Division durch 0, welche nicht erlaubt ist.
        // Daher testen wir: Wenn b != 0, dann wird NaN (Not a Number) durch das entsprechende Ergebnis ersetzt und anschließend ausgegeben
        float result = Float.NaN;
        if (b != 0) {
            result = a / b;
        }
        System.out.println("Division von       " + a + " und " + b + " = " + result);
        System.out.println("Multiplikation von " + a + " und " + b + " = " + (a * b));
    }
}
