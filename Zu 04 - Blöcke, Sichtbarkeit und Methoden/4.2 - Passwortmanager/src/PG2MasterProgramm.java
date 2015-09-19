import java.util.Scanner;

public class PG2MasterProgramm {
    public static String applicationName = "PG2 Master Programm";

    public static void main(String[] args) {
        PasswordManager passwordManager = new PasswordManager();
        Scanner sc = new Scanner(System.in);

        // Endlossschleife
        while (true) {
            System.out.println("--------------------");
            System.out.println("Willkommen beim Passwordmanager. Wählen Sie ein Funktion aus:");
            System.out.println("   1. Am System anmelden");
            System.out.println("   2. Passwort ändern");

            int userChoice = sc.nextInt();
            if (userChoice == 1) {          // Anmeldung am System
                System.out.print("Bitte geben Sie das Passwort ein: ");
                String passwordToVerify = sc.next();

                int passwordVerifyStatus = passwordManager.verifyPassword(passwordToVerify);
                if (passwordVerifyStatus < 0) {
                    System.out.println("Anmeldung nicht möglich, zu viele Fehlversuche!");
                    break;
                } else if (passwordVerifyStatus == 1) {
                    System.out.println("Sie haben sich erfolgreich bei der Applikation \"" + applicationName + "\" angemeldet.");
                    break;
                } else {
                    System.out.println("Falsches Passwort. Bisherige Fehlversuche: " + passwordManager.failedAttemptsCounter);
                }
            } else if (userChoice == 2) {   // Passwort ändern
                System.out.println("Bitte geben Sie alte Passwort ein:");
                String oldPassword = sc.next();
                System.out.println("Bitte geben Sie neue Passwort ein:");
                String newPassword = sc.next();
                boolean successfulChange = passwordManager.changePassword(newPassword, oldPassword);
                if (successfulChange) {
                    System.out.println("Passwort wurde erfolgreich geändert.");
                } else {
                    System.out.println("Das Passwort konnte nicht geändert werden.");
                }
            } else  {
                System.out.println("Invalide Eingabe. Wiederholen.");
            }
        }

        sc.close();
        System.out.println("Vielen Dank, dass sie den Passwordmanager für die Authentifizierung verwendet haben.");
    }
}
