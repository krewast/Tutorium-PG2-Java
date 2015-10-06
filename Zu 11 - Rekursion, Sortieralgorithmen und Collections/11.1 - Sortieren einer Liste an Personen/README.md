#11.1 - Sortieren einer Liste an Personen

Gegeben sind die folgenden zwei Java-Klassen Person und Beruf. Modifizieren Sie beide Klassen, so dass eine Liste *list* von Personen durch einen Aufruf von *Collections.sort(list)* wie folgt sortiert wird:

1. Sortierkriterium: Aufsteigend nach dem Gehalt, das dem Beruf der Person entspricht.
2. Sortierkriterium: Absteigend nach der Größe (size) der Person.

Grober Aufbau der Klassen:

    public class Person {
        public String name;
        public int size;
        public Beruf beruf;
    }
    
    public class Beruf {
        public String name;
        public float gehalt;
    }