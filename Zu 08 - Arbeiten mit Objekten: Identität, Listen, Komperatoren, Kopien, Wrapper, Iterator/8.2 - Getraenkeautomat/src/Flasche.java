package de.oth.pg2.grosseUebung;

public class Flasche {
	
	private Sorte sorte;
	private Preis preis;
	
	
	public Flasche(Sorte sorte, Preis preis) {
		super();
		this.sorte = sorte;
		this.preis = preis;
	}
	
	
	public Sorte getSorte() {
		return sorte;
	}
	public void setSorte(Sorte sorte) {
		this.sorte = sorte;
	}
	public Preis getPreis() {
		return preis;
	}
	public void setPreis(Preis preis) {
		this.preis = preis;
	}
	

}
