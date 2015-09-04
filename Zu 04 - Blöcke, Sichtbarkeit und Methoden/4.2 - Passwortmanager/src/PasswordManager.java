public class PasswordManager {

  private String password = "";
  private int counter = 0;
  public String applicationName;


  public void changePassword(String newPassword, String oldPassword) {
    if (password.equals(oldPassword)) {
      password = newPassword;
      System.out.println("Passwort wurde erfolgreich geändert.");
    } else {
      System.out.println("Das Passwort konnte nicht geändert werden.");
    }
  }

  public boolean verify(String passwordToCheck) {
    if (counter >= 3) {
      System.out.println("Ihr Account wurde gesperrt.");
      return false;
    } else if (passwordToCheck.equals(password)) {
      counter = 0;
      System.out.println("Sie haben sich erfolgreich an der Applikation "
          + applicationName + " angemeldet.");
      return true;
    } else {

      counter++;
      System.out.println("Falsches Passwort (Anzahl der Fehlversuche: "
          + counter + ")");
      return false;
    }
  }
}