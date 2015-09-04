package de.oth.pg2_7;

import java.util.ArrayList;
import java.util.Collections;

public class Rennen {

	private final ArrayList<Rennschnecke> teilnehmer;
	private final String name;
	private Status status;
	private int strecke;

	public Rennen(String name, int strecke) {
		this.teilnehmer = new ArrayList<Rennschnecke>();
		this.name = name;
		this.status = Status.WarteAufTeilnehmer;
		this.strecke = strecke;
	}

	public void addSchnecke(Rennschnecke schnecke) {
		if (this.status == Status.WarteAufTeilnehmer
				&& !this.teilnehmer.contains(schnecke)) {
			this.teilnehmer.add(schnecke);
		}
	}

	public void removeSchnecke(Rennschnecke schnecke) {
		if (this.status == Status.WarteAufTeilnehmer) {
			teilnehmer.remove(schnecke);
		}
	}

	public void start() {
		this.status = Status.Laufend;
		boolean goOn = true;

		while (goOn) {
			goOn = false;
			for (Rennschnecke r : teilnehmer) {
				if (r.getZurueckgelegteStrecke() < strecke) {
					r.kriechen();
					goOn = true;
				}
			}
		}

		// Alternative L�sung zur "while"-Schleife
		// for (Rennschnecke r : teilnehmer) {
		// r.insZielKriechen(strecke);
		// }

		Collections.sort(teilnehmer);
		for (int i = 0; i < teilnehmer.size(); i++) {
			teilnehmer.get(i).setPlatzierung(i + 1);
		}

		this.status = Status.Beendet;
	}

	@Override
	public String toString() {
		String ret = String
				.format("Ergebnisse für Rennen %s, zurückzulegende Strecke: %d :\n--- Status: %s\n",
						this.name, this.strecke, this.status);

		for (Rennschnecke r : teilnehmer) {
			ret += r.toString() + "\n";
		}

		return ret;
	}

	// Getter / Setter

	public ArrayList<Rennschnecke> getTeilnehmer() {
		return teilnehmer;
	}

	public String getName() {
		return name;
	}

	public Status getStatus() {
		return status;
	}

	public int getStrecke() {
		return strecke;
	}

	public void setStrecke(int strecke) {
		if (status == Status.WarteAufTeilnehmer) {
			this.strecke = strecke;
		}
	}

}
