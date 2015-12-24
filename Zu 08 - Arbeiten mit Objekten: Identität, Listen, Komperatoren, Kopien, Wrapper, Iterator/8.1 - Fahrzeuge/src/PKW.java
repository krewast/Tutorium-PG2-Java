public class PKW extends Fahrzeug {

    private int _anzahlTueren;
    private int _anzahlSitzplaetze;
    
    public PKW(String kennzeichen, boolean istBenziner, COLOR color, int ps, int anzahlTueren, int anzahlSitzplaetze) {
        super(kennzeichen, istBenziner, color, ps);
        this._anzahlSitzplaetze = anzahlSitzplaetze;
        this._anzahlTueren = anzahlTueren;
    }

    public int getAnzahlTueren() {
        return this._anzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        this._anzahlTueren = anzahlTueren;
    }

    public int getAnzahlSitzplaetze() {
        return this._anzahlSitzplaetze;
    }

    public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
        this._anzahlSitzplaetze = anzahlSitzplaetze;
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

        PKW pkw = (PKW)obj;

        if (this.getAnzahlTueren() != pkw.getAnzahlTueren())
           return false;
        if (this.getAnzahlSitzplaetze() != pkw.getAnzahlSitzplaetze())
           return false;

        return true;
    }

    @Override
    public String toString() {
        return "PKW: {anzahlTueren=" + getAnzahlTueren() + ", anzahlSitzplaetze=" + getAnzahlSitzplaetze() + "} " + super.toString();
    }
}
