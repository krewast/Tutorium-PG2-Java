import java.util.Scanner;

public class Aufgabe_1_3 {
   public static void main(String[] args) {
      float zahl1 = 9.0f;
      float zahl2 = 5.0f;
      float ergebnisFloat;
      int ergebnisInt;
      Scanner sc = new Scanner(System.in);

      System.out.print("Bitte Zahl1 eingeben: ");
      zahl1 = sc.nextFloat();
      System.out.print("\nBitte Zahl1 eingeben: ");
      zahl2 = sc.nextFloat();
      sc.close();

      ergebnisFloat = (zahl1 + zahl2);
      ergebnisInt = (int) ergebnisFloat;
      System.out.println("Ergebnis (float): " + ergebnisFloat);
      System.out.println("Ergebnis (int): " + ergebnisInt);

      ergebnisFloat = (zahl1 - zahl2);
      ergebnisInt = (int) ergebnisFloat;
      System.out.println("Ergebnis (float): " + ergebnisFloat);
      System.out.println("Ergebnis (int): " + ergebnisInt);

      ergebnisFloat = (zahl1 * zahl2);
      ergebnisInt = (int) ergebnisFloat;
      System.out.println("Ergebnis (float): " + ergebnisFloat);
      System.out.println("Ergebnis (int): " + ergebnisInt);

      ergebnisFloat = zahl2 != 0.0f ? (zahl1 / zahl2) : Float.NaN;
      ergebnisInt = (int) ergebnisFloat;
      System.out.println("Ergebnis (float): " + ergebnisFloat);
      System.out.println("Ergebnis (int): " + ergebnisInt);
   }
}