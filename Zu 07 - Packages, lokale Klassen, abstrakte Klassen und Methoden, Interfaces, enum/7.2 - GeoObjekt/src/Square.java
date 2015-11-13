package de.oth.pg2_6.aufgabe_1;

public class Square extends GeoObject {
    private double length;

    /**
     * Konstruktor der Klasse
     * 
     * @param d
     */
    public Square(double x, double y, double d) {
        super(x, y);
        this.length = d;
    }

    /**
     * Berechnet den Umfang des Quadrats
     * 
     * @return Umfang des Quadrats
     */
    public double berechneUmfang() {
        return 4 * length;
    }

    /**
     * Berechnet den Flaecheninhalt des Quadrats
     * 
     * @return Flaeche des Quadrats
     */
    public double berechneFlaeche() {
        return length * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
