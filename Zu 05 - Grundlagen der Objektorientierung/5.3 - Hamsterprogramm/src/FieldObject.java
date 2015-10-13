package de.oth.pg2.hamster;

public abstract class FieldObject {

    private char _symbol;

    public FieldObject(char symbol) {
        this._symbol = symbol;
    }

    public char getSymbol() {
        return this._symbol;
    }

    public void setSymbol(char symbol) {
        this._symbol = symbol;
    }
}
