import java.util.Scanner;

public class Schleife {
    public static void main(String[] args) {
        int max, div;
        Scanner sc = new Scanner(System.in);
        
        // "max" einlesen
        System.out.print("max: ");
        do {
            max = sc.nextInt();
            if (max < 0){
                System.out.println("Bitte eine positive Zahl eingeben: ");
            }
        } while (max < 0);

        // "div" einlesen
        System.out.print("div: ");
        do {
            div = sc.nextInt();
            if (div < 0){
                System.out.println("Bitte eine positive Zahl eingeben: ");
            }
        } while (div < 0);
        
        System.out.println("--- Ergebnis ---");
        // Von 0 bis max iterieren
        for (int i = 0; i <= max; i++) {
            //Falls sich i durch div restlos teilen lässt, wird der aktuelle Wert von i über die Konsole ausgegeben
            if((i % div) == 0) {               
                System.out.println(i);
            }
        }
    }
}
