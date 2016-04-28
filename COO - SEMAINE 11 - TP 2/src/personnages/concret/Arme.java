package personnages.concret;

public enum Arme {

	ARC, EPEE, HACHE;
	
	Arme() {
	}
	
	public int puissance() {
		if(this == ARC) {
			return 1;
		}
		if(this == EPEE) {
			return 2;
		}
		if(this == HACHE) {
			return 3;
		}
		return 0;
	}
}
