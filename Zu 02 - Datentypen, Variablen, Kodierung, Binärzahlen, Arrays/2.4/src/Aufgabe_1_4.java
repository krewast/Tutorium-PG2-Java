import java.lang.System;
import java.util.Scanner;

public class Aufgabe_1_4 {
   public static void main(String[] args) {
      float ergebnisSumme = 0;
      float ergebnisProdukt = 1;
      String alleEingaben = "";
      Scanner sc = new Scanner(System.in);

      while (true) {
         System.out.print("Weitere Zahlen eingeben (0/1)? ");

         // Wenn eingabe gleich 0 verlassen wir die Endlosschleife
         if (sc.nextInt() == 0)
            break;

         System.out.print("Zahl eingeben: ");

         float zahl = sc.nextFloat();

         alleEingaben += String.format("%.2f, ", zahl);
         ergebnisSumme += zahl;
         ergebnisProdukt *= zahl;
      }

      sc.close();

      System.out.println(String.format("Sie haben eingegeben: %s", alleEingaben));

      System.out.println("\nErgebnis Summe: " + ergebnisSumme);
      System.out.println("Ergebnis Produkt: " + ergebnisProdukt);
   }
}