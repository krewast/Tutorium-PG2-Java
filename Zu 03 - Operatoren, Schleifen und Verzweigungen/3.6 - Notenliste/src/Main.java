import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int c = 0;

        String[][] teilnehmer = new String[0][2];

        while (true)
        {
            System.out.print("Weiteren Kursteilnehmer erfassen (0/1)? ");

            if (sc.nextInt() == 0)
                break;

            // Siehe Vorlesung 02_Datentypen_Variablen_Kodierung_Binaerzahlen_Arrays Seite 60
            teilnehmer = Arrays.copyOf(teilnehmer, teilnehmer.length + 1);
            teilnehmer[c] = new String[2];

            // Workaround zu Java Problem
            // Konsole gibt \n von sc.nextInt() an sc.nextLine() weiter
            // Das führt dazu, dass sc.nextLine() übersprungen zu werden scheint.
            sc.nextLine();

            System.out.print("Name: ");
            teilnehmer[c][0] = sc.nextLine();
            System.out.print("Note: ");
            teilnehmer[c][1] = Integer.toString(sc.nextInt());

            c++;
        }

        for (int t = 0; t < teilnehmer.length; t++)
        {
            System.out.println(String.format("%d. %s:\t%d", t+1,teilnehmer[t][0],
                    Integer.parseInt(teilnehmer[t][1]) -1 ));
        }
    }
}
