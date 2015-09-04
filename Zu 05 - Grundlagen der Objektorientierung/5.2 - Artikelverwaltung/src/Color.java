package de.oth.pg2_3;

public class Color {
	
	private int red;
	private int green;
	private int blue;

	public int getRed() {
		return this.red;
	}

	public void setRed(int value) {
		this.red = value;
	}

	public int getGreen() {
		return this.green;
	}

	public void setGreen(int value) {
		this.green = value;
	}

	public int getBlue() {
		return this.blue;
	}

	public void setBlue(int value) {
		this.blue = value;
	}

	public String toString() {
		return String.format("#%02X%02X%02X", getRed(), getGreen(), getBlue());
	}
	
}
