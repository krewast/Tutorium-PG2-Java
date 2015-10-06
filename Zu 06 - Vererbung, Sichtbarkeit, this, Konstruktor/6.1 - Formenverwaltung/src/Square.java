package de.oth.pg2_4.aufgabe_1;

public class Square{
	private double length;

	/**
	 * Konstruktor der Klasse
	 * @param d
	 */
	public Square(double d){
		this.length = d;
	}
	
	/**
	 * Berechnet den Umfang des Quadrats
	 * @return Umfang des Quadrats
	 */
	public double berechneUmfang(){
		return 4 * length;
	}
	
	/**
	 * Berechnet den Flächeninhalt des Quadrats
	 * @return Fläche des Quadrats
	 */
	public double berechneFlaeche(){
		return length * length;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
}
