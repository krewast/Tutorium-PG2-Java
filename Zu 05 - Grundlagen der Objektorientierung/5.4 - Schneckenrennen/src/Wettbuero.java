package de.oth.pg2.hamster;

import java.util.ArrayList;

public class Wettbuero {

    private final ArrayList<Wette> _wetten;
    private final ArrayList<Rennen> _rennen;
    private static final int _quote = 2;

    public Wettbuero() {
        this._wetten = new ArrayList<Wette>();
        this._rennen = new ArrayList<Rennen>();
    }

    public void wetteAnnehmen(Wette wette) {
        if (wette.getRennen().getStatus() == Status.WarteAufTeilnehmer) {
            this._wetten.add(wette);
        }
    }

    public void addRennen(Rennen rennen) {
        this._rennen.add(rennen);
    }

    public void start() {
        for (Rennen r : this._rennen) {
            if (r.getStatus() == Status.WarteAufTeilnehmer) {
                r.start();
            }
        }
    }

    public void ergebnisseErmitteln() {
        for (Wette w : this._wetten) {
            if (w.getRennen().getStatus() == Status.Beendet) {
                w.setErgebnis();
            }
        }
    }

    public static int getQuote() {
        return Wettbuero._quote;
    }

    @Override
    public String toString() {
        String ret = "Wettergebnisse:\n";
        for (Wette w : this._wetten) {
            ret += w.toString() + "\n";
        }

        return ret;
    }

}
