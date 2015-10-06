package de.oth.pg2.grosseUebung;

public class Preis {

	
	private String waehrung;
	private int wert;
	
	
	public Preis(String waehrung, int wert) {
		super();
		this.waehrung = waehrung;
		this.wert = wert;
	}
	
	
	public String getWaehrung() {
		return waehrung;
	}
	public void setWaehrung(String waehrung) {
		this.waehrung = waehrung;
	}
	public int getWert() {
		return wert;
	}
	public void setWert(int wert) {
		this.wert = wert;
	}
	
}
