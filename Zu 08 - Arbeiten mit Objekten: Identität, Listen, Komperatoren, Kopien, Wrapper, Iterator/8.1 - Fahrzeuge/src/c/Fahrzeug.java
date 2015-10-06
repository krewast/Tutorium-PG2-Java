package de.oth.pg2_6.aufgabe_2.c;

import de.oth.pg2_6.aufgabe_2.COLOR;

public abstract class Fahrzeug {

	private String kennzeichen;
	private boolean istBenziner;
	private COLOR color;
	private int ps;
	
	protected Fahrzeug(String kennzeichen, boolean istBenziner, COLOR color, int ps){
		this.kennzeichen = kennzeichen;
		this.istBenziner = istBenziner;
		this.color = color;
		this.ps = ps;
	}
	
	protected Fahrzeug() {
		
	}

	public Fahrzeug(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public boolean isIstBenziner() {
		return istBenziner;
	}

	public void setIstBenziner(boolean istBenziner) {
		this.istBenziner = istBenziner;
	}

	public COLOR getColor() {
		return color;
	}

	public void setColor(COLOR color) {
		this.color = color;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	@Override
	public boolean equals(Object obj) {
		Fahrzeug other = (Fahrzeug) obj;
		//Überprüfung auf das gleiche Kennzeichen
		//Early-Out Condition, falls beide "null" als Kennzeichen haben
		if (kennzeichen == null) {
			if (other.kennzeichen != null)
				return false;
		} else if (!kennzeichen.equals(other.kennzeichen))
			return false;
		return true;
	}

	
	
}
