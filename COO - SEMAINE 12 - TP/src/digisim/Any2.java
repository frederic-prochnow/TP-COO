package digisim;

public abstract class Any2 implements Sortie{

	private Entree entreeA;
	private Entree entreeB;
	
	public Any2() {
		entreeA = new Connexion();
		entreeB = new Connexion();
	}
	
	public Any2(Sortie borneA,Sortie borneB){
		entreeA = new Connexion();
		entreeB = new Connexion();
		entreeA.connectTo(borneA);
		entreeB.connectTo(borneB);
	}
	
	/**
	 * @return le entreeA
	 */
	public Entree getEntreeA() {
		return entreeA;
	}

	/**
	 * @return le entreeB
	 */
	public Entree getEntreeB() {
		return entreeB;
	}

	public abstract boolean valeur();

}
