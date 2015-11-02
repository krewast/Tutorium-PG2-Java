package de.oth.pg2_4.aufgabe_1;

public class Square{
    
	private double _length;

	/**
	 * Konstruktor der Klasse
	 * @param d
	 */
	public Square(double d){
		this._length = d;
	}
	
	/**
	 * Berechnet den Umfang des Quadrats
	 * @return Umfang des Quadrats
	 */
	public double berechneUmfang(){
		return 4 * this._length;
	}
	
	/**
	 * Berechnet den Fl�cheninhalt des Quadrats
	 * @return Fl�che des Quadrats
	 */
	public double berechneFlaeche(){
		return this._length * this._length;
	}
	
	public double getLength() {
		return this._length;
	}

	public void setLength(double length) {
		this._length = length;
	}
	
}
