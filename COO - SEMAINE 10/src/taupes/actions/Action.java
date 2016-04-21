package taupes.actions;
import taupes.terrain.*;
import taupes.parcelles.*;

public abstract class Action {

	protected int direction;
	Coordonnees coordonnees;
	Taupe taupe;
	
	public Action(Taupe taupe,int direction) {
		this.taupe = taupe;
		this.direction = direction;
		if(direction == 0) {
			Coordonnees d0 = new Coordonnees(
					taupe.getCoordonnees().getAbscisse(),
					taupe.getCoordonnees().getOrdonnee()-1);
			this.coordonnees = d0;
		}
		if(direction == 1) {
			Coordonnees d1 = new Coordonnees(
					taupe.getCoordonnees().getAbscisse(),
					taupe.getCoordonnees().getOrdonnee()+1);
			this.coordonnees = d1;
		}
		if(direction == 2) {
			Coordonnees d2 = new Coordonnees(
					taupe.getCoordonnees().getAbscisse()-1,
					taupe.getCoordonnees().getOrdonnee());
			this.coordonnees = d2;
		}
		if(direction == 3) {
			Coordonnees d3 = new Coordonnees(
					taupe.getCoordonnees().getAbscisse()+1,
					taupe.getCoordonnees().getOrdonnee());
			this.coordonnees = d3;
		}
	}
	
	public Coordonnees getCoordonnees() {
		return this.coordonnees;
	}
	
	public abstract void agit();

}
