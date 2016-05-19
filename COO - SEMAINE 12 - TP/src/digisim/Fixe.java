package digisim;

public class Fixe implements Sortie{

	private final boolean valeur;
	public static Sortie FALSE = new Fixe(false);
	public static Sortie TRUE = new Fixe(true);
	
	public Fixe(boolean valeur) {
		this.valeur = valeur;
	}

	@Override
	public boolean valeur() {
		return this.valeur;
	}

}
