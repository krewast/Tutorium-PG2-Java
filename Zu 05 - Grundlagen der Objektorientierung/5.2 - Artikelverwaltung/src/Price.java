package de.oth.pg2_3;

public class Price {

	private double value;
	private String currency;

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String value) {
		this.currency = value;
	}

	@Override
	public String toString() {
		return String.format("%.2f", getValue()) + " " + getCurrency();
	}
	
}
