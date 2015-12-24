#8.2 - Getränkeautomat

##8.2.1

Schreiben Sie ein Java-Programm, das einen Getränkeautomaten simuliert. Der Automat kennt die drei verschiedenen Getränkesorten Cola, Limo und Wasser.
Eine Flasche Cola kostet 80 Cent, eine Flasche Limo 70 Cent und eine Flasche Wasser 60 Cent. Der Automat akzeptiert als Einwurf die Münzen 10-Cent, 20-Cent und 50-Cent. Der Automat ist mit jeweils zwei Flaschen pro Sorte bestückt. Das Programm soll den Benutzer zunächst wie folgt nach der Getränkesorte fragen:

    Bitte wählen Sie ein Getränk aus:
    1: Cola [80 Cent]
    2: Limo [70 Cent]
    3: Wasser [60 Cent]

Bei dieser Frage soll berücksichtigt werden, dass nur noch vorhandene Sorten angeboten werden. Ist beispielsweise kein Limo mehr im Automaten, soll sich die Frage nach der Sorte so verkürzen:

    Bitte wählen Sie ein Getränk aus:
    1: Cola [80 Cent]
    3: Wasser [60 Cent]

Nach der Wahl des Getränks, soll der Benutzer die Münzen, mit denen er bezahlen will, eingeben. Hat der Benutzer sich beispielsweise für eine Flasche Cola entschieden, wird ihm erst der zu zahlende Restbetrag und im Anschluss die Zahlungsmöglichkeiten genannt:

    Bitte werfen Sie noch 70 Cent ein. Gültige Münzen: (10: 10 Cent, 20: 20 Cent, 50: 50 Cent)

Ihr Programm soll den Benutzer solange nach Münzen fragen, bis der Preis des Getränks gedeckt ist. Falls eine ungültige Eingabe erfolgt, soll es eine entsprechende Fehlermeldung ausgeben aber nicht abbrechen. Sobald ausreichend Münzen eingeworfen worden sind, soll in etwa folgende Meldung ausgegeben werden

    Vielen Dank für Ihren Kauf. Bitte entnehmen Sie Ihre Flasche Cola.

Danach wiederholt sich das Programm und soll den Benutzer wieder nach der Getränkesorte fragen. Der Automat verfügt nicht über die Möglichkeit Wechselgeld auszugeben. Wird beispielswiese die Flasche Cola mit zwei 50-Cent-Münzen bezahlt, wird die Flasche ausgegeben, aber es gibt keine 20 Cent zurück.

##8.2.2 - Wechselgeld

Erweitern Sie das Programm aus der ersten Teilaufgabe so, dass auch Wechselgeld zurückgegeben wird. Gehen Sie dabei davon aus, dass der Automat zu Beginn über folgende Münzen verfügt

|Münze  |Stückzahl|
|-------|--------:|
|10-Cent|15       |
|20-Cent|10       |
|50-Cent|2        |

Der Automat soll das Wechselgeld in möglichst wenigen Münzen ausgeben. Beim obigen Beispiel der Cola-Flasche, die mit zwei 50-Cent-Münzen bezahlt wurde, soll er als Wechselgeld eine 20-Cent Münze zurückgeben und nicht etwa zwei 10-Cent Münzen. Der Automat gibt als Wechselgeld immer nur 10-Cent- oder 20-Cent-Münzen zurück, aber keine 50-Cent-Münzen!

Die Münzen, mit denen Flaschen bezahlt werden, sollen ebenfalls als Wechselgeld verwendet werden. Wurde z. B. eine Wasserflasche mit sechs 10-Cent-Münzen bezahlt, stehen dem Automaten diese sechs Münzen auch als Wechselgeld zur Verfügung.

##8.3.3 - Statusreport

Um überprüfen zu können, ob ihr Automat richtig arbeitet, sollen Sie nun eine weitere Methode hinzufügen, die Ihnen am Ende jedes Kaufs automatisch einen aktuellen Report ausgibt:

    public void printStatusReport() { ... }

Diese Methode soll Ihnen die Anzahl und Art von Flaschen in jedem Slot anzeigen, sowie eine Übersicht darüber bieten, wie viele Münzen von jeder Sorte sich derzeit im Automaten befinden.

Sobald Sie Ihren Automaten ausreichend getestet haben, können Sie den Aufruf dieser Methode auskommentieren und somit verhindern, dass im "laufenden Betrieb" interne Daten an die Nutzer ausgegeben werden. Löschen Sie die Methode nicht, vielleicht müssen Sie in Zukunft noch einmal testen!