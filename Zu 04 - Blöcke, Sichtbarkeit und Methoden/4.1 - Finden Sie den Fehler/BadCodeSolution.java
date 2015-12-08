import java.util.Scanner;

public class BadCodeSolution {
    int start = 1;

    public static void main(int[] args) {                       // Statt "int[] args" sollte es "String[] args" heißen!
        if (args != null){
            start = args[0]                                     // Fehlendes Semikolon. Außerdem wird versucht einen String in eine Variable des Typs int zu speichern
        }

        System.out.println("Die Ursprungszahl ist: " + start);  // "start" unbekannt: Variable "start" nicht bekannt, da "static" fehlt - Richtig: static int start = 1;
        Scanner sc = new Scanner(System.in);
        double d1 = add(start, sc.nextInt());                   // "start" unbekannt
        double d2 = sub(start, sc.nextFloat());                 // "start" unbekannt; Float statt Integer als Übergabewert

        test(20);
    }

    public static void add(int start, int add) {                // Falscher Rückgabewert "void" statt "int" der Methode
        return (start + add);
    }

    public int sub(int start, int sub) {                        // Aufruf der Methode nicht möglich, da "static" fehlt
        return (start - sub);
    }

    public static void test(int start) {
        if (start > 10) {
          int value = 5;
        } else {
          int value = -5;
        }

        System.out.println(value);                              // "value" ist hier unbekannt, da die Variable jeweils innerhalb der if/else Blöcke deklariert wurde
    }
}
