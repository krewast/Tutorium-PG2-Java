package de.oth.pg2.hamster;

public abstract class FieldObject {
	
	private char symbol;
	
	public FieldObject(char symbol) {
		this.symbol = symbol;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
}
