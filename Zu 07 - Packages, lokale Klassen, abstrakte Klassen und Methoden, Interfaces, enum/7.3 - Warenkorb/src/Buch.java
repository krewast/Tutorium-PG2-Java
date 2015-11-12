package de.oth.pg2.warenkorb;

public class Buch implements Produkt {

    private String _name;
    private String _author;
    private double _preis;
    private double _mwst = 1.05;

    @Override
    public double bruttoPreis() {
        return this._preis * this._mwst;
    }

    @Override
    public String toString() {
        return "Buch [name=" + this._name + ", author=" + this._author + ", preis=" + this._preis + "]";
    }

    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getAuthor() {
        return this._author;
    }

    public void setAuthor(String author) {
        this._author = author;
    }

    public double getPreis() {
        return this._preis;
    }

    public void setPreis(double preis) {
        this._preis = preis;
    }

    public double getMwst() {
        return this._mwst;
    }
}
