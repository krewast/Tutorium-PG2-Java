package de.oth.pg2.warenkorb;

public class Buch implements Produkt {

	private String name;
	private String author;
	private double preis;
	private double mwst = 1.05;
	
	@Override
	public double bruttoPreis() {
		return preis * mwst;
	}

	@Override
	public String toString() {
		return "Buch [name=" + name + ", author=" + author + ", preis=" + preis
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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
	
	

}
