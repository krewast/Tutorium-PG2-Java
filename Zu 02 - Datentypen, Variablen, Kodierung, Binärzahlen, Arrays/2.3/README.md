#2.3

Erweitern Sie das Programm aus Aufgabe 2.1 so, dass die beiden Zahlen nicht mehr statisch im Programm angegeben sind. Vielmehr soll der Benutzer diese beiden Zahlen über die Command-Line eingeben können.

Fordern Sie den Benutzer zur Eingabe der beiden Zahlen auf und zeigen Sie die entsprechenden Rechenergebnisse an. (Achten Sie dabei auf den möglichen Spezialfall der Division durch 0)

Hinweis: Um Eingaben aus der Command-Line abzufragen, können Sie diesen Code nutzen:

    Scanner sc = new Scanner(System.in);
    float zahl = sc.nextFloat();

Weitere Informationen finden Sie unter: <http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html>