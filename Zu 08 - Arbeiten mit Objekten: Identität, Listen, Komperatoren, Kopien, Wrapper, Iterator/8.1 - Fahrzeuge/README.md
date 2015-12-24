#8.1 - Fahrzeuge

##8.1.1

Erstellen Sie ein Enum. Dieses soll die Konstanten „RED“, „GREEN“, „BLUE“, „YELLOW“ und „BLACK“ annehmen können.

##8.1.2

Gegeben ist folgendes schematisches Klassendiagramm. Implementieren Sie die jeweiligen Klassen in Java. Beachten Sie, dass es sich bei der Klasse „Fahrzeug“ um eine abstrakte Klasse handelt. Die Klassen „PKW“ und „LKW“ erben von der Klasse Fahrzeug. Die Attribute entnehmen Sie passend vom schematisches Klassendiagramm. Das Attribut Farbe soll ein Enum des Typs aus der vorherigen Teilaufgabe sein.

Stellen Sie zusätzlich sicher, dass die Klasse Fahrzeug nur über diesen Konstruktor durch eine Unterklasse instanziiert werden kann:

    protected Fahrzeug(String kennzeichen, boolean istBenziner, COLOR color, int ps) { ... }

![Klassendiagramm](Klassendiagramm.jpg)

##8.1.3

**A)** Implementieren Sie nun die equals-Methode in Ihrer Fahrzeug-Klasse (Achtung: Diese Methode ist nicht abtrakt, auch wenn sie sich innerhalb einer abstrakten Klasse befindet!). Die equals-Methode soll es ermöglichen, zwei Fahrzeuge miteinander auf Basis der Fahrzeug-Attribute Kennzeichen, Benziner oder nicht, Farbe und PS-Zahl miteinander zu vergleichen. Beachten Sie außerdem, dass in dieser equals-Methode gleich zu Beginn getestet werden sollte, ob es sich bei den beiden Objekten um das gleiche handelt und ob diese der gleichen Klasse entsprechen (Siehe Vorlesungsfolien!).

**B)** Erstellen Sie die Klassen PKW und LKW wie im Klassendiagram dargestellt.

**C)** Implementieren Sie nun eine Klasse welche die main-Methode enthält, in der eine beliebige Anzahl unterschiedlicher Fahrzeuge (PKWs und LKWs gemischt) in einer ArrayList mit dem Namen "fuhrpark" gespeichert werden soll. Erstellen Sie zusätzlich noch jeweils ein Objekt der Klasse PKW oder LKW mit beliebigen Attributen und fügen Sie dieses **nicht** dem Fuhrpark hinzu. Iterieren Sie nun über den Fuhrpark und vergleichen Sie durch den Aufruf der equals-Methode, ob Ihr separat angelegtes Fahrzeug einem in Ihrem Fuhrpark entspricht. Falls dies nicht der Fall sein sollte, ändern Sie die Attribute Ihres Testfahrzeugs entsprechend, um zu überprüfen, ob die equals-Methode richtig von Ihnen implementiert wurde.

**D)** Erweitern Sie nun die Klassen PKW und LKW um eigene equals-Methoden, in denen Sie zusätzlich Attribute wie "Anzahl der Sitzplätze" bzw. "Anzahl der Reifen" vergleichen können. Beachten Sie, dass die equals-Methode der Fahrzeug-Klasse weiterhin verwendet werden soll und in den Unterklassen mit "super.equals(obj)" aufgerufen werden kann. Testen Sie im Anschluss Ihre neu implentieren equals-Methoden wieder mit Hilfe des in Teilaufgabe C) erstellten Fuhrparks.

Es ist - statt über den Fuhrpark zu iterieren - auch möglich die contains-Methode der ArrayList zu nutzen, um auf Gleichheit zu testen! Werfen Sie hierzu einen Blick in die [Dokumention der ArrayList](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#contains(java.lang.Object))
