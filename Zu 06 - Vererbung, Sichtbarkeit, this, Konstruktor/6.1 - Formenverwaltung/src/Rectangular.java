package de.oth.pg2_4.aufgabe_1;

public class Rectangular extends Square {

	private double width;
	
	/**
	 * Konstruktor der Klasse
	 * @param lenght
	 * @param width
	 */
	public Rectangular(double lenght, double width) {
		//Ruft Konstruktor von Quadrat auf
		super(lenght);
		this.width = width;
	}	
	
	/**
	 * Berechnet den Umfang des Rechtecks
	 * @return Umfang des Rechtecks
	 */
	public double berechneUmfang(){
		return 2 * this.getWidth() + 2 * this.getLength();
	}
	
	/**
	 * Berechnet die Fl�che des Rechtecks
	 * @return Fl�che des Rechtecks
	 */
	public double berechneFlaeche(){
		return this.getLength() * this.getWidth();
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
