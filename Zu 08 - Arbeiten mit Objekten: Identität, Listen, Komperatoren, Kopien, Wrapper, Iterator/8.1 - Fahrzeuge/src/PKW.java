package de.oth.pg2_6.aufgabe_2;

public class PKW extends Fahrzeug {

    private int anzahlTueren;
    private int anzahlSitzplaetze;

    public PKW(String kennzeichen, boolean istBenziner, COLOR color, int ps, int anzahlTueren, int anzahlSitzplaetze) {
        super(kennzeichen, istBenziner, color, ps);
        this.anzahlSitzplaetze = anzahlSitzplaetze;
        this.anzahlTueren = anzahlTueren;
    }

    public PKW(String kennzeichen) {
        super(kennzeichen);
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }

    public int getAnzahlSitzplaetze() {
        return anzahlSitzplaetze;
    }

    public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
        this.anzahlSitzplaetze = anzahlSitzplaetze;
    }

    @Override
    public String toString() {
        return "PKW [anzahlTueren=" + anzahlTueren + ", anzahlSitzplaetze=" + anzahlSitzplaetze + "]" + super.toString();
    }
}
