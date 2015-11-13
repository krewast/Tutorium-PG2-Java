package de.oth.pg2_4.aufgabe_1;

// EXTENDS is the important word here. That means we are using
// all items from Square (e.g. the length item) and add some 
// additional items (here width)
public class Rectangular extends Square {

    private double _width;

    /**
     * Konstruktor der Klasse
     * 
     * @param lenght
     * @param width
     */
    public Rectangular(double length, double width) {
        // Ruft Konstruktor von Quadrat auf
        super(length);
        this._width = width;
    }

    /**
     * Berechnet den Umfang des Rechtecks
     * 
     * @return Umfang des Rechtecks
     */
    public double berechneUmfang() {
        return 2 * this.getWidth() + 2 * this.getLength();
    }

    /**
     * Berechnet die Fl�che des Rechtecks
     * 
     * @return Fl�che des Rechtecks
     */
    public double berechneFlaeche() {
        return this.getLength() * this.getWidth();
    }

    public double getWidth() {
        return this._width;
    }

    public void setWidth(double width) {
        this._width = width;
    }
}
