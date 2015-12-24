import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Fahrzeug> fuhrpark = new ArrayList<Fahrzeug>();
        
        // Hinzufügen von mehreren, unterschiedlichen Fahrzeugen zum Fuhrpark
        fuhrpark.add(new PKW("NM-TG 790", true, COLOR.RED, 150, 4, 5));
        fuhrpark.add(new PKW("NM-AA 80", true, COLOR.RED, 150, 4, 5));
        fuhrpark.add(new PKW("NM-FF 70", false, COLOR.BLACK, 95, 2, 5));
        fuhrpark.add(new PKW("R-FF 90", false, COLOR.BLUE, 100, 4, 4));
        fuhrpark.add(new LKW("R-AA 99", false, COLOR.GREEN, 200, 6, 1500));
        fuhrpark.add(new LKW("R-BB 11", false, COLOR.YELLOW, 400, 6, 3000));

        // Alle Fahrzeuge im Fuhrpark ausgeben        
        for (Fahrzeug fahrzeug : fuhrpark) {
            // Kleiner Reminder: Automatischer Aufruf der toString-Methode in den Klasse des jeweiligen Fahrzeugs
            System.out.println(fahrzeug);
        }

        // Alle Fahrzeuge im Fuhrpark mit Test-PKW vergleichen
        // Hier iterieren wir zu Demonstration mit Hilfe der for-Schleife über die Liste von Fahrzeugen
        PKW testPKW = new PKW("NM-FF 70", false, COLOR.BLACK, 95, 2, 5);
        boolean testPKWGefunden = false;
        for (Fahrzeug fahrzeug : fuhrpark) {
            if (testPKW.equals(fahrzeug)) {
                System.out.println("Gleichen PKW gefunden");
                testPKWGefunden = true;
                break;
            }
        }
        if (testPKWGefunden == false) {
            System.out.println("Gleichen PKW nicht gefunden");
        }

        // Alle Fahrzeuge im Fuhrpark mit Test-LKW vergleichen
        // Hier iterieren wir nicht "von Hand" mit einer for-Schleife, sondern nutzen die Methode "contains" unserer
        // ArrayList, die automatisch auf die equals-Methode des zu vergleichenden Objekts zugreift.
        LKW testLKW = new LKW("R-AA 99", false, COLOR.GREEN, 200, 6, 1500);
        if (fuhrpark.contains(testLKW)) {
            System.out.println("Gleichen LKW gefunden");
        } else {
            System.out.println("Gleichen LKW nicht gefunden");
        }
    }
}
