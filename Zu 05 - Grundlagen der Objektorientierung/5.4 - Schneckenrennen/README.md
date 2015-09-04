#5.4 - Schneckenrennen

In dieser Übung geht es um die Simulation eines Schneckenrennens. Es gibt Rennschnecken, das Rennen an sich und ein Wettbüro.

**Die Rennschnecke**

Eine Rennschnecke kann mit einer bestimmten Geschwindigkeit kriechen und gehört einer Rasse an. Die Geschwindigkeit ist nur durch die Strecke definiert, welche eine Schnecke in einer Zeiteinheit zurücklegen kann. Weiterhin besitzt sie eine Startnummer und weiß zu jedem Zeitpunkt über ihre zurückgelegte Strecke Bescheid. Jeder Schnecke soll sich ausgeben können, z.B. mit Hilfe der „toString()“-Methode

**Das Rennen**

Das Rennen beinhaltet Informationen über die Anzahl der teilnehmenden Schnecken, die zurückgelegte Strecke und einen Namen, der das Rennen identifiziert. Weiterhin können die Schnecken zum Kriechen veranlasst und der Gewinner ermittelt werden. Wird eine Schnecke zum Kriechen gebracht, so legt sie eine zufällige Strecke zurück. Die zurückgelegte Strecke kann zwischen 0 und dem Wert der Geschwindigkeit hinterlegt wurde variieren. Ein Rennen läuft so lange bis alle Rennschnecken im Ziel angekommen sind. Erreicht eine Schnecke das Ziel, so wird der erreichte Platz der Rennschnecke zugewiesen. Die Informationen über ein Rennen sollen zusätzlich abgefragt und evtl. auf der Konsole ausgegeben werden können. Des Weiteren können Schnecken sowohl einem Rennen hinzugefügt als auch entfernt werden.

**Das Wettbüro**

Das Wettbüro nimmt Rennwetten entgegen und organisiert das Rennen. Das Wettbüro weiß für welches Rennen es Wetten angenommen hat. Eine Wette gehört immer zu einem bestimmten Rennen und einer bestimmten Rennschnecke, somit können keine Wetten abgegeben werden, die für mehrere Rennen oder Rennschnecken gelten. Die Ergebnisse der Wetten sollen auch ausgegeben werden können.

Sollten weitere Attribute und/oder Methoden benötigt werden, so ergänzen Sie diese.

##Aufgabe 5.4.1

Zeichnen Sie ein vereinfachtes Klassendiagram mit den jeweiligen Attributen und Methoden. Getter/Setter können in der Zeichnung vernachlässigt werden.

##Aufgabe 5.4.2

Implementieren Sie die Klassen und erstellen Sie ein Testprogramm.