import java.util.Scanner;

public class Datumscheck {
    public static void main(String[] args) {
        int day, month, year;
        Scanner sc = new Scanner(System.in);

        // Einzelkomponenten des Datums einlesen
        System.out.println("Geben Sie ein Datum ein:");
        System.out.print("Tag:\t");
        day = sc.nextInt();
        System.out.print("Monat:\t");
        month = sc.nextInt();
        System.out.print("Jahr:\t");
        year = sc.nextInt();
        sc.close();

        // Tag auf Validität prüfen
        if (day <= 0 || day > getDaysOfMonth(month, year)) {
            System.err.println("Der eingegebene Tag ist nicht korrekt!");
            System.exit(1); // Programm mit Exitcode 1 verlassen, um anzuzeigen, dass ein Fehler aufgetreten ist
        }

        // Monat auf Validität prüfen
        if (month < 1 || month > 12) {
            System.err.println("Der eingegebene Monat ist nicht korrekt!");
            System.exit(1);
        }

        // Jahr auf Validität prüfen, indem sichergestellt wird, dass das Datum nach Beginn des Gregorianischen Kalenders liegt
        if ((year <= 1582) && (month <= 10) && (day <= 15)) {
            System.err.println("Das eingegebene Datum muss nach dem 15.10.1582 liegen!");
            System.exit(1);
        }

        System.out.println(String.format("Der %d.%d.%d ist ein valides Datum.", day, month, year));
    }

    public static int getDaysOfMonth(int month, int year) {
        // Februar
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }

        // Restliche Monate mit 30 oder 31 Tagen
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            return 30;
        } else {
            return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;

        if (year % 4 == 0) {
            leapYear = true;
        }
        if (year % 100 == 0) {
            leapYear = false;
        }
        if (year % 400 == 0) {
            leapYear = true;
        }

        return leapYear;
    }
}
