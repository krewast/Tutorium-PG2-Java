
public class MeinKind {
	int alter;
	
	public MeinKind(int alter) {
		this.alter = alter;
	}
	
	// ermöglicht tiefe Kopie
	public MeinKind(MeinKind kind) {
		this.alter = kind.alter;
	}
}
