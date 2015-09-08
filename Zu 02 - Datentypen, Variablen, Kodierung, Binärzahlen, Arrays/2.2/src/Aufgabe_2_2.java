public class Aufgabe_2_2 {
    public static void main(String[] args) {
        // Deklarieren und initialisieren der beiden "Zahlenvariablen"
        float a = 5.0f;
        float b = 3.0f;
        // Deklarieren der Variable zur Zwischenspeicherung der Rechenergebnisse
        float resultFloat;

        // Hier passiert nun vier mal das Folgende:
        // - Berechnung des Ergebnisses einer Operation (Addition, Subtraktion, Division, Multiplikation), zwischenspeichern in der Variable "resultFloat"
        // - Ausgabe des Inhalts der Variable auf der Kommandozeile
        // - Ausgabe des Inhalts der Variable auf der Kommandozeile, nachdem diese durch eine Cast-Operation in eine Ganzzahl umgewandelt wurde
        resultFloat = a + b;
        System.out.println("Addition von       " + a + " und " + b + " (Float) = " + resultFloat);
        System.out.println("Addition von       " + a + " und " + b + " (Int)   = " + (int)resultFloat);

        resultFloat = a - b;
        System.out.println("Substraktion von   " + a + " und " + b + " (Float) = " + resultFloat);
        System.out.println("Substraktion von   " + a + " und " + b + " (Int)   = " + (int)resultFloat);

        resultFloat = a / b;
        System.out.println("Division von       " + a + " und " + b + " (Float) = " + resultFloat);
        System.out.println("Division von       " + a + " und " + b + " (Int)   = " + (int)resultFloat);

        resultFloat = a * b;
        System.out.println("Multiplikation von " + a + " und " + b + " (Float) = " + resultFloat);
        System.out.println("Multiplikation von " + a + " und " + b + " (Int)   = " + (int)resultFloat);
    }
}