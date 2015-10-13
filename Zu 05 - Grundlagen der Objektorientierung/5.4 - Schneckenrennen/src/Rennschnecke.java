package de.oth.pg2.hamster;

import java.util.Random;

public class Rennschnecke implements Comparable<Rennschnecke> {

    private static Random r = new Random();

    private String _name;
    private final int _startnummer;
    private final int _geschwindigkeit;
    private int _platzierung;
    private int _zeit;
    private int _zurueckgelegteStrecke;

    public Rennschnecke(String name, int startnummer, int geschwindigkeit) {
        this._name = name;
        this._startnummer = startnummer;
        this._geschwindigkeit = geschwindigkeit;
        this._platzierung = 0;
        this._zurueckgelegteStrecke = 0;
    }
    
    // Setter
    
    public void setName(String name) {
        this._name = name;
    }

    public void setPlatzierung(int platzierung) {
        this._platzierung = platzierung;
    }
    
    // Getter
    
    public String getName() {
        return this._name;
    }
    
    public int getStartnummer() {
        return this._startnummer;
    }

    public int getGeschwindigkeit() {
        return this._geschwindigkeit;
    }

    public int getPlatzierung() {
        return this._platzierung;
    }
    
    public int getZeit() {
        return this._zeit;
    }

    public int getZurueckgelegteStrecke() {
        return this._zurueckgelegteStrecke;
    }

    // operations

    public void kriechen() {
        this._zurueckgelegteStrecke += r.nextInt(this._geschwindigkeit + 1);
        this._zeit++;
    }

    public void insZielKriechen(int strecke) {
        while (this._zurueckgelegteStrecke < strecke) {
            kriechen();
        }
    }

    @Override
    public String toString() {
        return String.format("Platz %d, Startnummer: %d, Name: %s, Geschwindigkeit: %d, benötigte Zeit: %d",
                this._platzierung, this._startnummer, this._name, this._geschwindigkeit, this._zeit);
    }

    @Override
    public int compareTo(Rennschnecke other) {
        // Aufsteigende Sortierung 1..9 auf Grund der Zeit
        return this.getZeit() - other.getZeit();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rennschnecke)) {
            return false;
        }

        Rennschnecke other = (Rennschnecke) o;
        if (other.getStartnummer() != this.getStartnummer()) {
            return false;
        }

        return true;
    }

}
