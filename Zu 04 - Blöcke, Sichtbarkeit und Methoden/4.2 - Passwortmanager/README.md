#4.2 - Passwortmanager

Sie entwickeln einen Passwortmanager.

Folgende drei Variablen soll das Programm besitzen:

* Passwort (Standardwert: "pg2machtspass")
* Name der Applikation für das Passwort (Standardwert: "PG2 Master Programm")
* Zähler für die Falscheingaben

Bei diesem Verwaltungsprogramm ist es wichtig, dass die Variable des Passwort zwar gespeichert und verändert werden kann, aber nicht direkt direkt ausgelesen werden kann. (Denken Sie auch an die Sichtbarkeit der anderen Variablen!)

Nachdem Sie die Klasse implementiert haben, entwickeln Sie ein kleines Beispielprogramm, um den Passwortmanager zu verwenden.

Beispiel zum Erzeugen des PasswortManager:

    PasswordManager pManager = new PasswordManager();

Beispielausgabe (Falsche Eingabe):

    Willkommen beim Passwordmanager.
    Wählen Sie ein Funktion aus.
    1. Am System anmelden
    2. Passwort ändern
    1
    Bitte geben Sie das Passwort ein:
    falsches Passwort
    Falsches Passwort (Anzahl der Fehlversuche: 1)

Beispielausgabe (Richtige Eingabe):

    Willkommen beim Passwordmanager.
    Wählen Sie ein Funktion aus.
    1. Am System anmelden
    2. Passwort ändern
    1
    Bitte geben Sie das Passwort ein:
    pg2machtspass
    Sie haben sich erfolgreich an der Applikation PG2 Master Programm angemeldet.
    Vielen Dank,dass sie den Passwordmanager für die Authentifizierung verwendet haben.

Beispielausgabe (Passwortänderung):

    Willkommen beim Passwordmanager.
    Wählen Sie ein Funktion aus.
    1. Am System anmelden
    2. Passwort ändern
    2
    Bitte geben Sie alte Passwort ein:
    pg2machtspass
    Bitte geben Sie neue Passwort ein:
    pg2machtsehrvielspass
    Passwort wurde erfolgreich geändert.