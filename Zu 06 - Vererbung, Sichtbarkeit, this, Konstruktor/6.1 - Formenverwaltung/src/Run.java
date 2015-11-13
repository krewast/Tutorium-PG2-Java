package de.oth.pg2_4.aufgabe_1;

public class Run {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Erzeugt ein neues Quadrat
        Square s = new Square(10.5);

        System.out.println("Flaeche des Quadrats: " + s.berechneFlaeche());
        System.out.println("Umfang des Quadrats: " + s.berechneUmfang());

        // Erzeugt ein neues Rechteck
        Rectangular r = new Rectangular(10.5, 5.5);

        System.out.println("Flaeche des Quadrats: " + r.berechneFlaeche());
        System.out.println("Umfang des Quadrats: " + r.berechneUmfang());
    }

}
