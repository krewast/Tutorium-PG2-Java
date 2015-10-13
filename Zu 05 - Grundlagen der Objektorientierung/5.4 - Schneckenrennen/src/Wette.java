package de.oth.pg2.hamster;

public class Wette {

    private String _spieler;
    private Rennen _rennen;
    private Rennschnecke _schnecke;
    private int _einsatz;
    private boolean _gewonnen;
    private int _gewinn;

    public Wette(String spieler, Rennen rennen, Rennschnecke schnecke, int einsatz) {
        this._spieler = spieler;
        this._rennen = rennen;
        this._schnecke = schnecke;
        this._einsatz = einsatz;
        this._gewonnen = false;
        this._gewinn = 0;
    }

    // Getter
    public String getSpieler() {
        return this._spieler;
    }

    public Rennen getRennen() {
        return this._rennen;
    }
    
    public Rennschnecke getSchnecke() {
        return this._schnecke;
    }
    
    public int getEinsatz() {
        return this._einsatz;
    }

  
    // Setter
    public void setSpieler(String spieler) {
        this._spieler = spieler;
    }

    public void setRennen(Rennen rennen) {
        this._rennen = rennen;
    }

    public void setSchnecke(Rennschnecke schnecke) {
        this._schnecke = schnecke;
    }

    public void setEinsatz(int einsatz) {
        this._einsatz = einsatz;
    }

    public void setErgebnis() {
        this._gewonnen = this._rennen.getTeilnehmer().get(0).equals(this._schnecke);
        if (this._gewonnen) {
            this._gewinn = this._einsatz * Wettbuero.getQuote();
        }
    }
    
    
    public boolean isGewonnen() {
        return this._gewonnen;
    }

    @Override
    public String toString() {
        if (this._rennen.getStatus() == Status.Beendet) {
            return String.format("Wette von Spieler %s für Rennen %s auf Rennschnecke #%d, Gewonnen %s, Gewinn: %d",
                   this._spieler, this._rennen.getName(), this._schnecke.getStartnummer(),
                   (this._gewonnen ? "ja" : "nein"), this._gewinn);
        } else {
            return String.format("Wette von Spieler %s, Rennen %s ist noch nicht beendet", this._spieler,
                   this._rennen.getName());
        }
    }
}
