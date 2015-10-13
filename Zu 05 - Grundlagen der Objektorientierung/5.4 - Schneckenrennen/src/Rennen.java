package de.oth.pg2.hamster;

import java.util.ArrayList;
import java.util.Collections;

public class Rennen {

    private final ArrayList<Rennschnecke> _teilnehmer;
    private final String _name;
    private Status _status;
    private int _strecke;

    public Rennen(String name, int strecke) {
        this._teilnehmer = new ArrayList<Rennschnecke>();
        this._name = name;
        this._status = Status.WarteAufTeilnehmer;
        this._strecke = strecke;
    }
    
    // Getter

    public ArrayList<Rennschnecke> getTeilnehmer() {
        return this._teilnehmer;
    }

    public String getName() {
        return this._name;
    }

    public Status getStatus() {
        return this._status;
    }

    public int getStrecke() {
        return this._strecke;
    }
    
    // Setter

    public void setStrecke(int strecke) {
        if (this._status == Status.WarteAufTeilnehmer) {
            this._strecke = strecke;
        }
    }

    public void addSchnecke(Rennschnecke schnecke) {
        if (this._status == Status.WarteAufTeilnehmer && !this._teilnehmer.contains(schnecke)) {
            this._teilnehmer.add(schnecke);
        }
    }

    public void removeSchnecke(Rennschnecke schnecke) {
        if (this._status == Status.WarteAufTeilnehmer) {
            this._teilnehmer.remove(schnecke);
        }
    }

    public void start() {
        this._status = Status.Laufend;
        boolean goOn = true;

        while (goOn) {
            goOn = false;
            for (Rennschnecke r : this._teilnehmer) {
                if (r.getZurueckgelegteStrecke() < this._strecke) {
                    r.kriechen();
                    goOn = true;
                }
            }
        }

        // Alternative L�sung zur "while"-Schleife
        // for (Rennschnecke r : teilnehmer) {
        //      r.insZielKriechen(strecke);
        // }

        Collections.sort(this._teilnehmer);
        for (int i = 0; i < this._teilnehmer.size(); i++) {
            this._teilnehmer.get(i).setPlatzierung(i + 1);
        }

        this._status = Status.Beendet;
    }

    @Override
    public String toString() {
        String ret = String.format("Ergebnisse für Rennen %s, zurückzulegende Strecke: %d :\n--- Status: %s\n",
                this._name, this._strecke, this._status);

        for (Rennschnecke r : this._teilnehmer) {
            ret += r.toString() + "\n";
        }

        return ret;
    }
    
}