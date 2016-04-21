package taupes.actions;
import taupes.parcelles.*;

public class PoserTas extends Action {

	public PoserTas(Taupe taupe,int direction) {
		super(taupe,direction);
	}
	
	public void agit() {
		super.taupe.getVue().poserTas(super.coordonnees);
	}

}
