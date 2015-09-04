#5.3 - Hamsterprogramm

Sie programmieren einen neuen virtuellen Hamster. Dieser lernt von Aufgabe zu Aufgabe noch Fähigkeiten. Helfen Sie Ihm, diese verschiedenen Fähigkeiten zu erlernen.

##Aufgabe 5.3.1

Unser Hamster befindet sich auf einer 2-D Karte. Diese Karte kann wie folgt aussehen:

    ###########
    #     *   #
    #   #   * #
    #   *#    #
    #   *  ## #
    # *  #*   #
    #  < #    #
    ###########

Durch die Benutzereingaben steuern Sie den Hamster durch das Spielfeld. Folgende Funktionen besitzt unser Hamster.

1. Links drehen
2. Rechts drehen
3. Vorwärts gehen
4. Anzahl gefressener Körner ausgeben

**Bedeutung der Feldtypen:**

    # = Mauer (Hamster kann dieses Feld nicht betreten)

    * = Korn (Hamster isst diese Körner auf)

    <,^,>,v = Der Hamster mit seiner aktuellen Laufrichtung

##Aufgabe 5.3.2

Wir bringen unseren Hamster ein bisschen Intelligenz bei. Diese Intelligenz kann je nach Belieben gesteigert werden

    Dies bedeutet, der Hamster läuft das Feld ab, bis er sein erstes Korn gefunden hat.
    Der Hamster läuft das komplette Feld ab, bis alle Körner aufgegessen sind.
    Der Hamster merkt sich die Felder, auf denen er schon war.
