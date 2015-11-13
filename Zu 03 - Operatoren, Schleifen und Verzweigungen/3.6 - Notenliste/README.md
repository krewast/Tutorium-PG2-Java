#3.6 - Notenliste

Schreiben Sie ein Programm, das es dem Benutzer erlaubt, eine Notenliste eines Kurses einzugeben. Für jeden Kursteilnehmer soll der Name und die Note erfasst werden (Achtung: es gibt nur ganzzahlige Noten zwischen 1 und 6). Nach jeder Eingabe eines Namens und einer zugehörigen Note soll der Benutzer gefragt werden:

    Weiteren Kursteilnehmer erfassen (0/1)?

Antwortet der Benutzer mit 1, so werden ein weiterer Name und eine weitere Note abgefragt. Antwortet der Benutzer mit 0, so wird die Notenliste ausgegeben. Bei der Ausgabe sollen die Benutzer zusätzlich durchnummeriert werden.Beispielsweise sollte das Programm diese Ausgabe für einen Kurs mit drei Teilnehmern erzeugen:

1. Max Mustermann: 3
2. Sepp Maier: 1
3. Marta Wagner: 2

Zusatzaufgabe: Der Kurs kann beliebig viele Teilnehmer haben. (Um es Ihnen selbst einfacher zu mache, sollten Sie diese Funktionalität erst am Ende hinzufügen.)

*Hinweis: Nutzen Sie für die Abfrage von Strings aus der Command-Line diesen Quellcode:*

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();