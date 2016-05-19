package digisim;

public abstract class AnyN implements Sortie{

	protected Connexion[] entrees;
	
	public AnyN(int compte) {
		entrees = new Connexion[compte];
		for(int i=0; i<compte; i++) {
			entrees[i] = new Connexion();
		}
	}

	public Entree getEntree(int i) {
		Connexion c = entrees[i];
		return c;
	}
	
	public abstract boolean valeur();


}
