package de.oth.pg2_7;

import java.util.Random;

public class Rennschnecke implements Comparable<Rennschnecke> {

	private static Random r = new Random();

	private String name;
	private final int startnummer;
	private final int geschwindigkeit;
	private int platzierung;
	private int zeit;
	private int zurueckgelegteStrecke;

	public Rennschnecke(String name, int startnummer, int geschwindigkeit) {
		this.name = name;
		this.startnummer = startnummer;
		this.geschwindigkeit = geschwindigkeit;
		this.platzierung = 0;
		this.zurueckgelegteStrecke = 0;
	}

	public void kriechen() {
		zurueckgelegteStrecke += r.nextInt(geschwindigkeit + 1);
		zeit++;
	}

	public void insZielKriechen(int strecke) {
		while (zurueckgelegteStrecke < strecke) {
			kriechen();
		}
	}

	@Override
	public String toString() {
		return String
				.format("Platz %d, Startnummer: %d, Name: %s, Geschwindigkeit: %d, benötigte Zeit: %d",
						this.platzierung, this.startnummer, this.name,
						this.geschwindigkeit, this.zeit);
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

	// Getter / Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartnummer() {
		return startnummer;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public int getPlatzierung() {
		return platzierung;
	}

	public void setPlatzierung(int platzierung) {
		this.platzierung = platzierung;
	}

	public int getZeit() {
		return this.zeit;
	}

	public int getZurueckgelegteStrecke() {
		return zurueckgelegteStrecke;
	}

}
