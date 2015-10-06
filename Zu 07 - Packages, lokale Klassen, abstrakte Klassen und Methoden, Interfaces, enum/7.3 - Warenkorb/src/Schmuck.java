package de.oth.pg2.warenkorb;

public class Schmuck extends Luxusartikel {

	@Override
	public double bruttoPreis() {
		return this.getPreis() * this.getMwst() + (this.getPreis() * 1.3);
	}

	@Override
	public String toString() {
		return "Schmuck [name=" + this.getName() + ", preis=" + this.getPreis()
				+ "]";
	}
}
