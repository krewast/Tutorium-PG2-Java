package de.oth.pg2_7;

import java.util.ArrayList;

public class Wettbuero {

	private final ArrayList<Wette> wetten;
	private final ArrayList<Rennen> rennen;

	private static final int quote = 2;

	public Wettbuero() {
		wetten = new ArrayList<Wette>();
		rennen = new ArrayList<Rennen>();
	}

	public void wetteAnnehmen(Wette wette) {
		if (wette.getRennen().getStatus() == Status.WarteAufTeilnehmer) {
			wetten.add(wette);
		}
	}

	public void addRennen(Rennen rennen) {
		this.rennen.add(rennen);
	}

	public void start() {
		for (Rennen r : rennen) {
			if (r.getStatus() == Status.WarteAufTeilnehmer) {
				r.start();
			}
		}
	}

	public void ergebnisseErmitteln() {
		for (Wette w : wetten) {
			if (w.getRennen().getStatus() == Status.Beendet) {
				w.setErgebnis();
			}
		}
	}

	public static int getQuote() {
		return quote;
	}

	@Override
	public String toString() {
		String ret = "Wettergebnisse:\n";
		for (Wette w : wetten) {
			ret += w.toString() + "\n";
		}

		return ret;
	}

}
