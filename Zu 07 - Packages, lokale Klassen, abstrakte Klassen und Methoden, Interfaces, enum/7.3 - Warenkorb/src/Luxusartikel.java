package de.oth.pg2.warenkorb;

public class Luxusartikel implements Produkt {

    private String _name;
    private double _preis;
    private double _mwst = 1.25;

    @Override
    public double bruttoPreis() {
        return this._preis * this._mwst;
    }

    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
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

    @Override
    public String toString() {
        return "Luxusartikel [name=" + this._name + ", preis=" + this._preis + "]";
    }

}
