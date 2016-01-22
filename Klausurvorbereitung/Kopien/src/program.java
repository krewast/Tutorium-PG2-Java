
public class program {

	public static void main(String[] args) {
		// Erzeuge neues Objekt von MeinKlasse
		MeinKind kind1 = new MeinKind(10); // die Klasse ist nur ein Beispiel
		MeineKlasse test1 = new MeineKlasse("test1", kind1);
		
		System.out.println("FLACH");
		// flache Kopie:
		MeineKlasse flach = test1;
		
		// Zum check: Ausgabe Konsole
		System.out.println("test1: " + test1.toString());
		System.out.println("flach: " + flach.toString());
		// Output Beispiel:
		// test1: MeineKlasse@6d06d69c
		// flach: MeineKlasse@6d06d69c
		// Das bedeutet: GLEICHE Object ID, d.h. es wurde nur ein Pointer angelegt
		
		
		System.out.println("\nTiefe Kopie");
		// tiefe Kopie mittels Copy Konstruktor
		MeineKlasse tief1 = new MeineKlasse(test1);
		// Zum check: Ausgabe Konsole
		System.out.println("test1: " + test1.toString());
		System.out.println("tief1: " + tief1.toString());
		// Output:
		// test1: MeineKlasse@6d06d69c
		// tief1: MeineKlasse@7852e922
		// Das bedeutet: VERSCHIEDENE Object ID, d.h. es wurde ein neues Objekt erzeugt
		
		System.out.println("Tiefe Kopie - Kind");
		// Check2: wie sieht es mit meinem Kindobjekt aus?
		System.out.println("test1: " + test1.kind.toString());
		System.out.println("tief1: " + tief1.kind.toString());
		// Output
		// test1 Kind: MeinKind@4e25154f
		// tief1 Kind: MeinKind@4e25154f
		// -> das ist nur eine flache Kopie, weil gleiches Objekt!
		
		
		System.out.println("\nTIEF mit TIEFEN Objekten");
		// tiefe Kopie mittels Cloneable (implementiert in MeineKlasse)
		MeineKlasse tief2 = test1.clone();
		
		System.out.println("Tiefe Kopie 2 - Kind");
		// Check2: wie sieht es mit meinem Kindobjekt aus?
		System.out.println("test1: " + test1.kind.toString());
		System.out.println("tief2: " + tief2.kind.toString());
		// Output
		// test1: MeinKind@4e25154f
		// tief2: MeinKind@70dea4e
		// -> das ist eine tiefe Kopie, weil neues Objekt!
		
	}

}
