public class LKW extends Fahrzeug {

    private int _anzahlReifen;
    private int _ladeGewicht;
    
    public LKW(String kennzeichen, boolean istBenziner, COLOR color, int ps, int anzahlReifen, int ladeGewicht) {
        super(kennzeichen, istBenziner, color, ps);
        this._anzahlReifen = anzahlReifen;
        this._ladeGewicht = ladeGewicht;
    }

    public int getAnzahlReifen() {
        return this._anzahlReifen;
    }

    public void setAnzahlReifen(int anzahlReifen) {
        this._anzahlReifen = anzahlReifen;
    }

    public int getLadeGewicht() {
        return this._ladeGewicht;
    }

    public void setLadeGewicht(int ladeGewicht) {
        this._ladeGewicht = ladeGewicht;
    }

    @Override
    public boolean equals(Object obj) {
        // Mit dem folgenden Aufruf wird die equals-Methode der Super-Klasse (in diesem Fall Fahrzeug)
        // aufgerufen und die dortigen Vergleiche ausgeführt. Wenn die Checks dort ergeben, dass es sich
        // nicht um das gleiche Objekt handeln kann, geben wir sofort "false" zurück. Falls die 
        // Überprüfungen dort jedoch "true" ergeben, fahren wir in dieser Methode noch weiter mit den 
        // Vergleichen weiter unten fort, statt direkt "true" zurückzugeben. Das wäre falsch!
        if (super.equals(obj) == false) {
            return false;
        }

        if (this.getClass() != obj.getClass())
            return false;

        LKW lkw = (LKW)obj;
        
        if (this.getAnzahlReifen() != lkw.getAnzahlReifen())
           return false;
        if (this.getLadeGewicht() != lkw.getLadeGewicht())
           return false;
       
        return true;
    }

    @Override
    public String toString() {
        return "LKW: {anzahlReifen=" + getAnzahlReifen() + ", ladeGewicht=" + getLadeGewicht() + "} " + super.toString();
    }
}
