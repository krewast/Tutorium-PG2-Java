package de.oth.pg2.warenkorb;

import java.lang.reflect.Array;

public class Warenkorb {

    private Produkt[] _products = new Produkt[0];

    public void print() {
        String printString = "";
        for (Produkt produkt : this._products) {
            printString += produkt.toString() + "\n";
        }
        System.out.println(printString);
    }

    public void clear() {
        this._products = new Produkt[1];
    }

    public void add(Produkt artikel) {
        // Erweitern des Arrays
        Object newArray = Array.newInstance(produkts.getClass().getComponentType(), Array.getLength(produkts) + 1); // +1
        System.arraycopy(this._products, 0, newArray, 0, Array.getLength(produkts));
        this._products = (Produkt[]) newArray;
        
        // Artikel an die letzte Stelle im Array einfügen
        this._products[this._products.length - 1] = artikel;
    }

    public double gesamtPreis() {
        double sum = 0;
        for (Produkt produkt : produkts) {
            sum += produkt.bruttoPreis();
        }
        return sum;
    }

}
