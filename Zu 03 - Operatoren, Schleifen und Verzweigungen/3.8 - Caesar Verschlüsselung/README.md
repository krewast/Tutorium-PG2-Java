#3.8 - Caesar Verschlüsselung

##Aufgabe 3.8.1

Schreiben Sie ein Java-Programm, das einen Text mit Hilfe der Caesar-Verschlüsselung chiffriert. Bei dieser einfachen (und unsicheren) Verschlüsselung wird jeder Buchstabe des Klartexts auf einen Geheimtextbuchstaben abgebildet. Diese Abbildung ergibt sich, indem man die Zeichen eines geordneten **Alphabets** um eine bestimmte Anzahl **zyklisch nach rechts verschiebt** (rotiert). Die Anzahl der verschobenen Zeichen bildet den **Schlüssel**, der für die gesamte Verschlüsselung unverändert bleibt.

Eine mögliche Zuordnung der Klartextbuchstaben zu den Geheimtextbuchstaben ist beispielsweise:

    Klar:    a b c d e f g h i j k l m n o p q r s t u v w x y z
    Geheim:  d e f g h i j k l m n o p q r s t u v w x y z a b c

Der Schlüssel ist in diesem Fall 23. Hier wird der Buchstabe a (Klartext) durch den Buchstaben d (Geheimtext), der Buchstabe b durch den Buchstaben e, usw. bei der Verschlüsselung ersetzt. Das Programm fordert den Benutzer im ersten Schritt zur Eingabe des Schlüssels (eine Zahl zwischen 1 und  26) auf. Anschließen kann der Benutzer den zu verschlüsselnden Klartext eingeben. Das Programm liefert den mit Hilfe der Caesar-Chiffre verschlüsselten Geheimtext. Zur Vereinfachung sollen dabei nur die oben dargestellten 26 Buchstaben (keine Sonderzeichen, Leerzeichen, Umlaute, usw.) verschlüsselt werden.

*Hinweis: Weitere Informationen zur Caesar-Verschlüsselung finden Sie unter <http://de.wikipedia.org/wiki/Caesar-Verschlüsselung>*

##Aufgabe 3.8.2 (Caesar -Entschlüsselung)

Schreiben Sie ein Java-Programm, das in der Lage ist, einen verschlüsselten Text aus Aufgabe 10 zu entschlüsseln. Dazu gibt der Benutzer zunächst den Schlüssel (eine Zahl zwischen 1 und  26) ein. Anschließend gibt der Benutzer den Geheimtext ein. Das Programm zeigt den entschlüsselten Klartext an, sofern der korrekte Schlüssel eingegeben wurde.