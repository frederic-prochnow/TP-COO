package digisim;

public class XorN extends AnyN{

	public XorN(int compte) {
		super(compte);
	}

	public boolean valeur() {
		boolean b = false;
		for(int i=0; i<super.entrees.length-1; i++) {
			Entree entreeA = entrees[i];
			Entree entreeB = entrees[i+1];
			b = entreeA.valeur() ^ entreeB.valeur();
		}
		return b;
	}
}
