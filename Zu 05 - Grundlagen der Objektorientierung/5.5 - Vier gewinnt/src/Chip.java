package de.oth.pg2.viergewinnt;

public class Chip {

    private char _consoleOut;

    public Chip(char consoleOut) {
        this._consoleOut = consoleOut;
    }

    // we don't need a setter, because we always initialize the class with
    // the constructor
    public char getConsoleOut() {
        return this._consoleOut;
    }

    @Override
    public String toString() {
        return String.valueOf(consoleOut);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chip) {
            return this._consoleOut == ((Chip) obj).getConsoleOut();
        }
        return false;
    }
}
