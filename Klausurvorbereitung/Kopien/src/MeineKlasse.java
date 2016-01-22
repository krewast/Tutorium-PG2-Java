
public class MeineKlasse implements Cloneable {
	String name;
	MeinKind kind;

	public MeineKlasse(String name, MeinKind kind) {
		this.name = name;
		this.kind = kind;
	}
	
	// Copy Konstruktor für tiefe Kopie
	// mit flacher Kopie von Attributen
	public MeineKlasse(MeineKlasse copy) {
		this.name = copy.name;
		this.kind = copy.kind;
	}
	
	
	// Beispiel für Interface Cloneable
	// TIEFE Kopie mit TIEFER Kopie von Attributen
	// (beachtet das Attribut 'kind'
	@Override
	public MeineKlasse clone() { 
		// wir erzeugen auch von MeinKind eine tiefe Kopie
		MeinKind copy_kind = new MeinKind(this.kind);
		MeineKlasse copy = new MeineKlasse(this.name, copy_kind);
		return copy;
	}
	
	
}
