#8.2 - Getränkeautomat

##8.2.1 (Getränkeautomat v2.0)

Schreiben Sie ein Java-Programm, das einen Getränkeautomaten simuliert. Der Automat kennt die drei verschiedenen Getränkesorten, Cola, Wasser und Limo. Eine Flasche Cola kostet 80 Cent, eine Flasche Wasser 60 Cent und eine Flasche Limo 70 Cent. Der Automat akzeptiert als Einwurf die Münzen, 10-Cent, 20-Cent, 50-Cent und 1€. Der Automat ist mit jeweils drei Flaschen pro Sorte bestückt. Das Programm soll den Benutzer zunächst wie folgt nach der Getränkesorte fragen:

    Wählen Sie das Getränk aus
    1=Cola
    2=Wasser
    3=Limo

Bei dieser Frage soll berücksichtigt werden, dass nur noch vorhandene Sorten angeboten werden. Ist beispielsweise kein Wasser mehr im Automaten, soll sich die Frage nach der Sorte so verkürzen:

    Wählen Sie das Getränk aus
    1=Cola
    3=Limo

Nach der Wahl des Getränks, soll der Benutzer die Münzen, mit denen er bezahlen will, eingeben. Hat der Benutzer sich beispielsweise für eine Flasche Cola entschieden, wird ihm erst der Preis genannt und dann das Geld verlangt.

    Das gewählte Getränk kostet 80 Cent.
    Bitte werfen Sie eine Münze ein(10=10-Cent,20=20-Cent,50=50-Cent,1=1€)

Ihr Programm soll den Benutzer solange nach Münzen fragen, bis der Preis des Getränks gedeckt ist. Falls eine ungültige Eingabe erfolgt, soll es eine entsprechende Fehlermeldung ausgeben. Sobald ausreichend Münzen eingeworfen worden sind, soll in etwa folgende Meldung ausgegeben werden

    Danke. Entnehmen Sie Ihre Flasche Wasser.

Danach wiederholt sich das Programm und soll den Benutzer wieder nach der Getränkesorte fragen. Der Automat verfügt nicht über die Möglichkeit Wechselgeld auszugeben. Wird beispielswiese die Flasche Cola mit einer 1€-Münze bezahlt, wird die Flasche ausgegeben, aber es gibt keine 20 Cent zurück.

##8.2.2 - Wechselgeld

Erweitern Sie das Programm aus Aufgabe 1 so, dass auch Wechselgeld zurückgegeben wird. Gehen Sie dabei davon aus, dass der Automat zu Beginn über folgende Münzen verfügt

|Münze  |Stückzahl|
|-------|--------:|
|10-Cent|10       |
|20-Cent|5        |

Der Automat soll das Wechselgeld in möglichst wenig Münzen ausgeben. Beim obigen Beispiel der Cola-Flasche, die mit 1€ bezahlt wurde, soll er als Wechselgeld eine 20-Cent Münze zurückgeben und nicht zwei 10-Cent Münzen. Der Automat gibt als Wechselgeld immer 10-Cent- oder 20-Cent-Münzen zurück. Er gibt keine 50-Cent- und auch keine 1€-Münze zurück!

Die Münzen, mit denen Flaschen bezahlt werden, sollen ebenfalls als Wechselgeld verwendet werden. Wurde z. B. eine Wasserlasche mit sechs 10 Cent-Münzen bezahlt, stehen dem Automaten diese sechs Münzen auch als Wechselgeld zur Verfügung.