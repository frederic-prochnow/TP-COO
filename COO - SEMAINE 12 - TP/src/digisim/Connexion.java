package digisim;

public class Connexion implements Entree,Sortie{

	protected Sortie from;
	
	public Connexion() {
	}
	
	public void connectTo(Sortie sortie) {
		this.from = sortie;
	}
	
	public boolean valeur() {
		if(from == null) {
			return false;
		} else {
			return from.valeur();
		}
	}

}
