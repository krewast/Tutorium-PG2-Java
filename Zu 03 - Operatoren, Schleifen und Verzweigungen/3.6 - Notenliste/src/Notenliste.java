import java.util.Arrays;
import java.util.Scanner;

public class Notenliste {
    public static void main(String[] args) {
        String[][] students = new String[0][2]; // Zweidimensionales Array mit aktuell 0 Reihen, und 2 Spalten (Spalte 1: Name, Spalte 2: Note)
        int studentCounter = 0;
        boolean addAnotherStudent;
        Scanner sc = new Scanner(System.in);

        do  {
            // Siehe Vorlesung 02_Datentypen_Variablen_Kodierung_Binaerzahlen_Arrays Seite 60
            students = Arrays.copyOf(students, students.length + 1);
            students[studentCounter] = new String[2];

            // Name einlesen
            System.out.print("Name: ");
            students[studentCounter][0] = sc.nextLine();

            // Note einlesen und validieren
            System.out.print("Note: ");
            while (true) {
                int grade = sc.nextInt();
                if (grade > 0 && grade < 7) {
                    students[studentCounter][1] = Integer.toString(grade);
                    break;
                } else {
                    System.out.println("Bitte eine Note im Bereich zwischen 1 und 6 eingeben.");
                }
            }

            studentCounter++;

            System.out.print("Weiteren Kursstudents erfassen (0/1)? ");
            addAnotherStudent = (sc.nextInt() == 1);

            // Workaround zu Java Problem:
            // Konsole gibt \n (newline) von sc.nextInt() an sc.nextLine() im neuen Durchlauf der while-Schleife weiter
            // Das führt dazu, dass sc.nextLine() übersprungen zu werden scheint. Zum Testen die folgende Zeile einfach auskommentieren und probieren.
            sc.nextLine();
        } while(addAnotherStudent);

        // Ausgabe der Teilnehmerliste durch simples Iterieren über die Liste
        for (int i = 0; i < students.length; i++) {
            System.out.println(String.format("%d. %s: %d", i + 1, students[i][0], Integer.parseInt(students[i][1])));
        }
    }
}
