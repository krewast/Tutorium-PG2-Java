package de.oth.pg2.grosseUebung;

public enum Sorte {

	COLA(1, "Cola"),
	WASSER(2, "Wasser"),
	LIMO(3, "Limo");
	
	private final int wert;
	private final String typ;
	
	
	Sorte(int wert, String typ){
		this.wert = wert;
		this.typ = typ;
	}

	public int getWert() {
		return wert;
	}


	public String getTyp() {
		return typ;
	}
	
	
}
