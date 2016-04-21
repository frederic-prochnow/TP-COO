package taupes.actions;
import taupes.parcelles.*;

public class Creuser extends Action {

	public Creuser(Taupe taupe,int direction) {
		super(taupe,direction);
	}
	
	public void agit() {
		super.taupe.getVue().creuserTrou(super.taupe, super.coordonnees);
	}
}
