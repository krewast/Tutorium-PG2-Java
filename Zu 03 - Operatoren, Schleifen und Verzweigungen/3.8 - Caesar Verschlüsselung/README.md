#3.8 - Caesar Verschlüsselung

Schreiben Sie ein Java-Programm, das einen Text mit Hilfe der Caesar-Verschlüsselung chiffriert. Bei dieser einfachen (und unsicheren) Verschlüsselung wird jeder Buchstabe des Klartexts auf einen Geheimtextbuchstaben abgebildet. Diese Abbildung ergibt sich, indem man die Zeichen eines geordneten **Alphabets** um eine bestimmte Anzahl **zyklisch nach rechts verschiebt** (rotiert). Die Anzahl der verschobenen Zeichen bildet den **Schlüssel**, der für die gesamte Verschlüsselung unverändert bleibt.

Eine mögliche Zuordnung der Klartextbuchstaben zu den Geheimtextbuchstaben ist beispielsweise:

    Klar:    abcdefghijklmnopqrstuvwxyz
    Geheim:  defghijklmnopqrstuvwxyzabc - Verschiebung nach links um 3 Stellen

Der Schlüssel ist in diesem Fall 3. Hier wird der Buchstabe a (Klartext) durch den Buchstaben d (Geheimtext), der Buchstabe b durch den Buchstaben e, usw. bei der Verschlüsselung ersetzt.

Geben Sie in Ihrem Programm einen Text an, den Sie dann mit einem von Ihnen ausgewählten Schlüssel verschlüsseln und im Anschluss wieder entschlüsseln. So sehen Sie sofort, ob Ihre beiden Methoden richtig programmiert wurden. Definieren Sie für diese beiden Aufgaben (Verschlüsselung, Entschlüsselung) jeweils eine eigene Methode, um Ihren Code übersichtlicher zu gestalten:

	public static void main(String[] args) { ... }
	public static String encrypt(String text, int key) { ... }
	public static String decrypt(String text, int key) { ... }

Zur Vereinfachung sollen nur die oben dargestellten 26 Buchstaben (Keine Großbuchstaben, Sonderzeichen, Leerzeichen, Umlaute, usw.) verschlüsselt werden!

*Hinweis: Weitere Informationen zur Caesar-Verschlüsselung finden Sie unter <http://de.wikipedia.org/wiki/Caesar-Verschlüsselung>*
