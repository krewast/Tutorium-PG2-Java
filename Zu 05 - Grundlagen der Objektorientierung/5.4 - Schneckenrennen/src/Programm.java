package de.oth.pg2.hamster;

public class Programm {
	public static void main(String[] args) {
		// Anlegen der Rennschnecken
		Rennschnecke rs1 = new Rennschnecke("Rennschnecke 1", 1, 11);
		Rennschnecke rs2 = new Rennschnecke("Rennschnecke 2", 2, 15);
		Rennschnecke rs3 = new Rennschnecke("Rennschnecke 3", 3, 14);
		Rennschnecke rs4 = new Rennschnecke("Rennschnecke 4", 4, 11);
		Rennschnecke rs5 = new Rennschnecke("Rennschnecke 5", 5, 12);
		Rennschnecke rs6 = new Rennschnecke("Rennschnecke 6", 6, 14);

		// Erstellen eines Rennens
		Rennen r1 = new Rennen("Rennen 1", 200);
		r1.addSchnecke(rs1);
		r1.addSchnecke(rs2);
		r1.addSchnecke(rs3);
		r1.addSchnecke(rs4);
		r1.addSchnecke(rs5);
		r1.addSchnecke(rs6);

		// Das Wettbüro organisiert die Rennen
		Wettbuero w = new Wettbuero();
		w.addRennen(r1);

		// Wetten erstellen
		Wette w1 = new Wette("Spieler 1", r1, rs1, 100);
		Wette w2 = new Wette("Spieler 2", r1, rs2, 50);
		Wette w3 = new Wette("Spieler 3", r1, rs5, 130);

		// Wetten dem Wettbüro mitteilen
		w.wetteAnnehmen(w1);
		w.wetteAnnehmen(w2);
		w.wetteAnnehmen(w3);

		// Starten der Rennen
		w.start();

		// Ermittlung der Ergebnisse
		w.ergebnisseErmitteln();

		// Ausgabe...
		System.out.println(r1);
		System.out.println(w);
	}
}
