public class Aufgabe_1_2 {
   public static void main(String[] args) {
      float zahl1 = 9.0f;
      float zahl2 = 5.0f;
      float ergebnisFloat;
      int ergebnisInt;

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

      ergebnisFloat = (zahl1 / zahl2);
      ergebnisInt = (int) ergebnisFloat;
      System.out.println("Ergebnis (float): " + ergebnisFloat);
      System.out.println("Ergebnis (int): " + ergebnisInt);
   }
}