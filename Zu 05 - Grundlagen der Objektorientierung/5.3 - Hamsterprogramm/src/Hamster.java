package de.oth.pg2.hamster;

public class Hamster extends FieldObject {

	private String name;
	private int x;
	private int y;
	private EmptyField eField = new EmptyField(' ');
	private int numberOfCorns = 0;

	public Hamster(char symbol, String name, int x, int y) {
		super(symbol);
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public FieldObject[][] goForward(FieldObject[][] field) {

		int newX = 0;
		int newY = 0;

		if (this.getSymbol() == '>') {
			newX = x;
			newY = y + 1;
		} else if (this.getSymbol() == 'v') {
			newX = x + 1;
			newY = y;
		} else if (this.getSymbol() == '<') {
			newX = x;
			newY = y - 1;
		} else if (this.getSymbol() == '^') {
			newX = x - 1;
			newY = y;
		}

		if (field[newX][newY].getClass().equals(Wall.class)) {
			System.out.println("Achtung Wand");
		} else {
			if (field[newX][newY].getClass().equals(Corn.class)) {
				System.out.println("Fresse Korn");
				this.numberOfCorns++;
			}
			field[x][y] = eField;
			field[newX][newY] = this;
			this.x = newX;
			this.y = newY;
		}
		
		return field;
	}

	public void left() {
		switch (this.getSymbol()) {
		case '<':
			this.setSymbol('v');
			break;
		case 'v':
			this.setSymbol('>');
			break;
		case '>':
			this.setSymbol('^');
			break;
		case '^':
			this.setSymbol('<');
			break;
		}
	}

	public void right() {
		switch (this.getSymbol()) {
		case '<':
			this.setSymbol('^');
			break;
		case 'v':
			this.setSymbol('<');
			break;
		case '>':
			this.setSymbol('v');
			break;
		case '^':
			this.setSymbol('>');
			break;
		}
	}

	public int getNumberOfCorns() {
		return numberOfCorns;
	}

	public void setNumberOfCorns(int numberOfCorns) {
		this.numberOfCorns = numberOfCorns;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
