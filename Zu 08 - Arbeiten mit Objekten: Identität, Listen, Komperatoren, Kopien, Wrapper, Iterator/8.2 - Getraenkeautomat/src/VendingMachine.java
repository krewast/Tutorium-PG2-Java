import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

    Scanner _sc = new Scanner(System.in);
    
    // Der Getränkeautomat besitzt intern drei Slots für Getränke.
    // Jeden Slot füllen wir bei der Erstellung des Automats (beim Aufruf des Konstruktors)
    // mit jeweils einer Sorte von Getränk
    private ArrayList<Bottle> _beverageSlot1 = new ArrayList<>();    // Cola
    private ArrayList<Bottle> _beverageSlot2 = new ArrayList<>();    // Limo
    private ArrayList<Bottle> _beverageSlot3 = new ArrayList<>();    // Wasser

    // In den folgenden Variablen wird gespeichert, welcher Vorrat an Münzen noch im Automaten vorhanden ist
    // Wenn der Benutzer eine Münze einwirft, wird der Zählerstand erhöht, beim Ausgeben von Wechselgeld verringert.
    private int _counter10Cents = 10;
    private int _counter20Cents = 5;
    private int _counter50Cents = 2;

    public VendingMachine() {
        // Jeden Slot des Automaten mit ein paar Getränken vorbestücken
        for (int i = 0; i < 2; i++) {
            this._beverageSlot1.add(new Bottle(BeverageKind.COLA));
            this._beverageSlot2.add(new Bottle(BeverageKind.LEMONADE));
            this._beverageSlot3.add(new Bottle(BeverageKind.WATER));
        }
    }

    public void showAvailableBeverages() {
        System.out.println("Bitte wählen Sie ein Getränk aus:");
        // Prüfen, ob ein Slot noch Getränke enthält. Wenn ja, erste darin Flasche aufrufen
        // und deren Sorte ausgeben. Durch die toString-Methode in BeverageKind werden
        // "automatisch" alle wichtigen Infos auf der Konsole angezeigt.
        if (!this._beverageSlot1.isEmpty()) {
            Bottle bottle = this._beverageSlot1.get(0);
            System.out.println(bottle.getBeverageKind());
        }
        if (!this._beverageSlot2.isEmpty()) {
            Bottle bottle = this._beverageSlot2.get(0);
            System.out.println(bottle.getBeverageKind());
        }
        if (!this._beverageSlot3.isEmpty()) {
            Bottle bottle = this._beverageSlot3.get(0);
            System.out.println(bottle.getBeverageKind());
        }
    }

    public void chooseAndPayBeverage() {
        ArrayList correctBeverageSlot = null;
        Bottle bottle = null;

        while (true) {
            // Den Benutzer fragen, welche Art von verfügbarem Getränk er kaufen möchte.
            int chosenBeverage = this._sc.nextInt();

            // Ähnlich wie schon bei der Ausgabe der verfügbaren Getränke in der vorherigen Methode
            // schauen wir uns an, ob ein Slot bereits leer ist. Wenn nicht, "speichern" wir die erste
            // Flasche in der Variable "bottle". Diese Flasche nutzen wir dann, um festzustellen, mit
            // welcher Sorte von Getränk wir es hier zu tun haben und ob der Identifier dieser Sorte dem
            // entspricht, den der Nutzer eingegeben hat. Sollte das der Fall sein, so ist die gerade
            // betrachtete Flasche eine der Sorte, die der Nutzer haben will und wir merken uns den
            // aktuell betrachteten Slot in "correctBeverageSlot" und verlassen die Schleife.
            if (!this._beverageSlot1.isEmpty()) {
                bottle = this._beverageSlot1.get(0);
                if (bottle.getBeverageKind().getIdentifier() == chosenBeverage) {
                    correctBeverageSlot = this._beverageSlot1;
                    break;
                }
            }
            if (!this._beverageSlot2.isEmpty()) {
                bottle = this._beverageSlot2.get(0);
                if (bottle.getBeverageKind().getIdentifier() == chosenBeverage) {
                    correctBeverageSlot = this._beverageSlot2;
                    break;
                }
            }
            if (!this._beverageSlot3.isEmpty()) {
                bottle = this._beverageSlot3.get(0);
                if (bottle.getBeverageKind().getIdentifier() == chosenBeverage) {
                    correctBeverageSlot = this._beverageSlot3;
                    break;
                }
            }

            // Hat der Nutzer einen unzulässigen Wert eingegeben, so wird eine Meldung angezeigt und
            // die Schleife erneut gestartet.
            // Ein unzulässiger Wert ist alles, was sich keinem Identifier einer Sorte zuordnet lässt,
            // also alles was nicht der 1, 2 oder 3 entspricht.
            // Allerdings ist es auch so, dass 1, 2 oder 3 als nicht valide angesehen werden, wenn kein
            // Getränk mehr im entsprechenden Slot vorhanden ist. Bsp: 2 ist dann nicht mehr valide,
            // wenn keine Limo mehr vorhanden und der Slot entsprechend leer ist
            if (correctBeverageSlot == null) {
                System.out.println("Inkorrekte Eingabe. Erneut versuchen: ");
            }
        }

        // Die Flasche enthält eine bestimmte Sorte von Getränk, das wiederum einen bestimmten Preis hat
        int unpayedCents = bottle.getBeverageKind().getPriceInEuroCents();
        while (unpayedCents > 0) {
            System.out.println("Bitte werfen Sie noch " + unpayedCents + " Cent ein. Gültige Münzen: (10: 10 Cent, 20: 20 Cent, 50: 50 Cent)");
            int enteredCents = this._sc.nextInt();
            // Prüfen, ob "eingeworfene" Münze valide ist
            if (enteredCents == 10 || enteredCents == 20 || enteredCents == 50) {
                // Die eingeworfene Münze wird zum entsprechenden Vorrat an Münzen hinzugefügt
                if (enteredCents == 10)
                    this._counter10Cents++;
                if (enteredCents == 20)
                    this._counter20Cents++;
                if (enteredCents == 50)
                    this._counter50Cents++;

                unpayedCents -= enteredCents;
            } else {
                System.out.println("Inkorrekte Eingabe. Erneut versuchen: ");
            }
        }

        // Lösungsvorschlag der Teilaufgabe 8.2.2
        if (unpayedCents < 0) {
            System.out.println("Wechselgeld zurückgeben: " + unpayedCents * (-1) + " Cent");
            // Es wird nie passieren, dass 50 Cent zurückgegeben werden müssen.
            // Daher auch kein Code dafür an dieser Stelle.
            while (unpayedCents <= -20) {
                this._counter20Cents--;
                unpayedCents += 20;
                System.out.println(" - 20 Cent zurück");
            }
            while (unpayedCents <= -10) {
                this._counter10Cents--;
                unpayedCents += 10;
                System.out.println(" - 10 Cent zurück");
            }
        }

        System.out.println("Vielen Dank für Ihren Kauf. Bitte entnehmen Sie Ihre Flasche " + bottle.getBeverageKind().getDescription() + ".");

        // Am Ende die Flasche "auswerfen", indem sie aus dem Slot entfernt wird.
        correctBeverageSlot.remove(bottle);
    }

    // Lösungsvorschlag der Teilaufgabe 8.2.3
    public void printStatusReport() {
        System.out.println("STATUSREPORT:");

        // Ausgabe der Slots
        System.out.println("Slot 1:         " + this._beverageSlot1);
        System.out.println("Slot 2:         " + this._beverageSlot2);
        System.out.println("Slot 3:         " + this._beverageSlot3);

        // Ausgabe der Münzvorräte
        System.out.println("10-Cent-Münzen: " + this._counter10Cents);
        System.out.println("20-Cent-Münzen: " + this._counter20Cents);
        System.out.println("50-Cent-Münzen: " + this._counter50Cents);
    }
}
