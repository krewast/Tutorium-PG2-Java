package de.oth.pg2.grosseUebung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Getraenkeautomat {

	private List<Flasche> wasserList = new ArrayList<>();
	private List<Flasche> limoList = new ArrayList<>();
	private List<Flasche> colaList = new ArrayList<>();
	
	private int anzahl10Cent = 5;
	private int anzahl20Cent = 5;

	public Getraenkeautomat() {
		this.init();
	}

	public void auffuellen() {
		this.init();
	}

	public void auffuellen(Sorte sorte) {

		switch (sorte) {
		case COLA:
			this.colaList.add(generateBootle(sorte));
			break;
		case LIMO:
			this.limoList.add(generateBootle(sorte));
			break;
		case WASSER:
			this.wasserList.add(generateBootle(sorte));
			break;
		}
	}

	public int verfuegbareGetraenkeAusgeben() {

		int anzahlGesamt = 0;
		
		if (colaList.size() > 0) {
			anzahlGesamt += colaList.size();
			System.out
					.println(Sorte.COLA.getWert() + "=" + Sorte.COLA.getTyp());
		}
		if (wasserList.size() > 0) {

			anzahlGesamt += wasserList.size();
			System.out.println(Sorte.WASSER.getWert() + "="
					+ Sorte.WASSER.getTyp());
		}

		if (limoList.size() > 0) {

			anzahlGesamt += limoList.size();
			System.out
					.println(Sorte.LIMO.getWert() + "=" + Sorte.LIMO.getTyp());
		}
		
		return anzahlGesamt;
	}

	public void wechselgeldAuffuellen() {

	}

	public void kontostandAbfragen() {

	}

	public void geldHinzufuegen() {

	}

	private void init() {

		for (int i = 0; i < 3; i++) {
			colaList.add(generateBootle(Sorte.COLA));
		}
		for (int i = 0; i < 3; i++) {
			wasserList.add(generateBootle(Sorte.WASSER));
		}
		for (int i = 0; i < 3; i++) {
			limoList.add(generateBootle(Sorte.LIMO));
		}
	}

	private Flasche generateBootle(Sorte sorte) {

		switch (sorte) {
		case COLA:
			Preis colaPreis = new Preis("Euro", 100);
			Flasche colaFlasche = new Flasche(Sorte.COLA, colaPreis);
			return colaFlasche;
		case WASSER:
			Preis wasserPreis = new Preis("Euro", 80);
			Flasche wasserFlasche = new Flasche(Sorte.WASSER, wasserPreis);
			return wasserFlasche;
		case LIMO:
			Preis limoPreis = new Preis("Euro", 90);
			Flasche limoFlasche = new Flasche(Sorte.LIMO, limoPreis);
			return limoFlasche;
		}

		return null;
	}

	public void getraenkeausgabeUndBezahlen(int eingabe, Scanner sc) {
		
		int betrag = 0;
		int kontostand = 0;
		String sorte = null;
		
		if (Sorte.COLA.getWert() == eingabe){
			betrag = colaList.get(0).getPreis().getWert();	
			sorte = Sorte.COLA.getTyp();
		}
		else if (Sorte.WASSER.getWert() == eingabe){
			betrag = wasserList.get(0).getPreis().getWert();
			sorte = Sorte.WASSER.getTyp();
		}
		else if (Sorte.LIMO.getWert() == eingabe){
			betrag = limoList.get(0).getPreis().getWert();	
			sorte = Sorte.LIMO.getTyp();
		} else {
			return;
		}
		
		System.out.println("Das gewählte Getränk kostet "+ betrag +" Cent.");
		
		//Kontostand auffüllen, bis der Betrag erfüllt wurde
		while (betrag > kontostand){
			System.out.println("Bitte werfen Sie eine Münze ein(10=10-Cent,20=20-Cent,50=50-Cent,100=100-Cent)");
			int muenze = sc.nextInt();
			if (muenze == 10){
				anzahl10Cent++;
			} else if (muenze == 20){
				anzahl20Cent++;
			}
			kontostand += muenze;
		}
		
		
		//Wechselgeld ausgeben
		while (kontostand - betrag >= 20 && anzahl20Cent > 0){
			kontostand -= 20;
			anzahl20Cent--;
			System.out.println("Bitte entnehmen Sie 20 Cent");
		}
		
		while (kontostand - betrag >= 10 && anzahl10Cent > 0){
			kontostand -= 10;
			anzahl10Cent--;

			System.out.println("Bitte entnehmen Sie 10 Cent");
		}

		System.out.println("Bitte entnehmen Sie Ihr Falsche " + sorte);
	}

}
