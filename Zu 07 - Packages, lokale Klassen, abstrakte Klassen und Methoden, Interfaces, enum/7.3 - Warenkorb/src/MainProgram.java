package de.oth.pg2.warenkorb;

public class MainProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Warenkorb warenkorb1 = new Warenkorb();
		
		Luxusartikel lArtikel1 = new Luxusartikel();
		lArtikel1.setName("Luxusartikel1");
		lArtikel1.setPreis(600.99);
		
		Luxusartikel lArtikel2 = new Luxusartikel();
		lArtikel2.setName("Luxusartikel2");
		lArtikel2.setPreis(1000.99);
		
		Schmuck schmuck1 = new Schmuck();
		schmuck1.setName("Schmuck");
		schmuck1.setPreis(455.55);
		
		Buch buch = new Buch();
		buch.setName("Buch1");
		buch.setPreis(10.79);
		buch.setAuthor("Tutor");
		
		warenkorb1.add(lArtikel1);
		warenkorb1.add(lArtikel2);
		warenkorb1.add(schmuck1);
		warenkorb1.add(buch);
		
		warenkorb1.print();
		
		System.out.println("Gesamtpreis: " + warenkorb1.gesamtPreis());
	}

}
