package de.oth.pg2_6.aufgabe_2.c;

import de.oth.pg2_6.aufgabe_2.COLOR;

public class LKW extends Fahrzeug {

    private int anzahlReifen;
    private int ladeGewicht;

    public LKW(String kennzeichen, boolean istBenziner, COLOR color, int ps, int anzahlReifen, int ladeGewicht) {
        super(kennzeichen, istBenziner, color, ps);
        this.anzahlReifen = anzahlReifen;
        this.ladeGewicht = ladeGewicht;
    }

    public LKW(int ladeGewicht) {
        this.ladeGewicht = ladeGewicht;
    }

    public LKW(String kennzeichen) {
        super(kennzeichen);
    }

    public int getAnzahlReifen() {
        return anzahlReifen;
    }

    public void setAnzahlReifen(int anzahlReifen) {
        this.anzahlReifen = anzahlReifen;
    }

    public int getLeerGewicht() {
        return ladeGewicht;
    }

    public void setLeerGewicht(int leerGewicht) {
        this.ladeGewicht = leerGewicht;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        return super.equals(obj);
    }

}
