 package pg2._04;

import java.util.Scanner;

public class MainProgram {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int i = 0;
    boolean check = false;

    PasswordManager pManager = new PasswordManager();

    do {
      System.out.println("Willkommen beim Passwordmanager.");
      System.out.println("Wählen Sie ein Funktion aus.");

      System.out.println("1. Am System anmelden");
      System.out.println("2. Passwort ändern");

      switch (sc.nextInt()) {
      case 1:
        System.out.println("Bitte geben Sie das Passwort ein:");

        String passwordToCheck = sc.next();
        check = pManager.verify(passwordToCheck);
        break;
      case 2:
        System.out.println("Bitte geben Sie alte Passwort ein:");
        String oldPassword = sc.next();
        System.out.println("Bitte geben Sie neue Passwort ein:");
        String newPassword = sc.next();
        pManager.changePassword(newPassword, oldPassword);
        break;
      default:
        System.out.println("Falsche Eingabe");
      }
    } while (!check);

    System.out
        .println("Vielen Dank,"
            + "dass sie den Passwordmanager für die Authentifizierung verwendet haben.");

  }
}