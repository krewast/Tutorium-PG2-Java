package de.oth.pg2.viergewinnt;

public class Chip {

	private char consoleOut;
	
	
	//constructor
	public Chip(char consoleOut) {
		this.consoleOut = consoleOut;
	}
	
	@Override
	public String toString() {
		return String.valueOf(consoleOut);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Chip) {
			return this.consoleOut == ((Chip)obj).getConsoleOut();
		}
		return false;
	}
	
	// getter
	public char getConsoleOut() {
		return this.consoleOut;
	}

}
