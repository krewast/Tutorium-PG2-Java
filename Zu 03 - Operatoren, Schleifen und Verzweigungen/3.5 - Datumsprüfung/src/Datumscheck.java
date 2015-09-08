import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int day, month, year;

        System.out.println("Geben Sie ein Datum ein: ");
        System.out.print("Tag:\t ");
        day = sc.nextInt();
        System.out.print("Monat:\t ");
        month = sc.nextInt();
        System.out.print("Jahr:\t ");
        year = sc.nextInt();

        System.out.println(String.format("%d.%d.%d", day, month, year));

        if (month < 1 || month > 12)
        {
            System.err.println("Der eingegebene Monat ist nicht korrekt!");
        }

        if (day <= 0 || day > Main.getDaysOfMonth(month, year))
        {
            System.err.println("Der eingegebene Tag ist nicht korrekt!");
        }

        if (year <= 1582)
        {
            if (month <= 10)
            {
                if (day <= 15)
                {
                    System.err.println("Das eingegebene Datum muss nach dem 15.10.1582 liegen!");
                }
            }
        }
    }

    public static boolean isLeapYear(int year)
    {
        return (year % 4 == 0) || (year % 100 > 0 && year % 400 == 0);
    }

    public static int getDaysOfMonth(int month, int year)
    {
        if (month == 2)
            if (isLeapYear(year))
                return 29;
            else
                return 28;

        // Hardcore Lösung
        // Das ist genauso gut (oder besser, da Lesbar):
        // if ((month == 4) || (month == 6) || (month ==9) || (month == 11))
        if ((0x0A50 & (1 << month)) != 0)
            return 30;
        else
            return 31;
    }
}
