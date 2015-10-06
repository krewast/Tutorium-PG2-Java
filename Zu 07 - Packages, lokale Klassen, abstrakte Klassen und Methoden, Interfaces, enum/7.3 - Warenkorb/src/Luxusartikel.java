package de.oth.pg2.warenkorb;

public class Luxusartikel implements Produkt {

	private String name;
	private double preis;
	private double mwst = 1.25;
	
	@Override
	public double bruttoPreis() {
		return preis * mwst;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public double getMwst() {
		return mwst;
	}


	@Override
	public String toString() {
		return "Luxusartikel [name=" + name + ", preis=" + preis + "]";
	}

}
