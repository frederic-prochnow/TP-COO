package taupes.actions;
import taupes.parcelles.*;

public class Deplacer extends Action {

	public Deplacer(Taupe taupe,int direction) {
		super(taupe,direction);
	}

	public void agit() {
		super.taupe.getVue().poserTaupe(super.taupe, super.coordonnees);
	}
}
