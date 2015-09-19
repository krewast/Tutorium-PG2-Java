public class PasswordManager {
    // Das Passwort muss hier mit "private" vor dem Zugriff durch andere Klassen auf jeden Fall geschützt werden
    // Die Anzahl der bisherigen Fehlversuche ist eine weniger kritische Angabe und deshalb durch "public" von anderen Klassen "einsehbar"
    private String password = "pg2machtspass";
    public int failedAttemptsCounter = 0;

    public int verifyPassword(String passwordToCheck) {
        if (failedAttemptsCounter >= 3) {
            // Bei zu vielen bisherigen Fehlversuchen wird ein Wert kleiner 0 zurückgegeben
            return -1;
        } else if (passwordToCheck.equals(password)) {
            // Ist das Passwort richtig, ist der Returnwert 1
            failedAttemptsCounter = 0;
            return 1;
        } else {
            // Bei einem falschen Passwort gibt der PasswordManager die 0 zurück, nachdem der Zähler der Fehlversuche um 1 erhöht wurde
            failedAttemptsCounter++;
            return 0;
        }
    }

    public boolean changePassword(String newPassword, String oldPassword) {
        // Erst das alte Passwort mit dem neuen vergleichen und entsprechend reagieren
        if (password.equals(oldPassword)) {
            password = newPassword;
            failedAttemptsCounter = 0;
            return true;
        } else {
            return false;
        }
    }
}