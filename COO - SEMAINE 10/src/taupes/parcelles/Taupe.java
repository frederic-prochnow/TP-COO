package taupes.parcelles;
import taupes.terrain.*;

public class Taupe {

	private int equipe;
	private Vue vue;
	private Coordonnees coordonnees;
	
	public Taupe(int equipe,Vue vue) {
		this.equipe = equipe;
		this.vue = vue;
	}
	
	public Taupe(int equipe,Vue vue,int x,int y) {
		this.equipe = equipe;
		this.vue = vue;
		this.coordonnees = new Coordonnees(x,y);
		this.vue.poserTaupe(this, this.coordonnees);
	}
	
	public int getEquipe() {
		return this.equipe;
	}
	
	public Vue getVue() {
		return this.vue;
	}
	
	public Coordonnees getCoordonnees() {
		return this.coordonnees;
	}
	
	public void setCoordonnees(Coordonnees coordonnees){
		this.coordonnees = coordonnees;
	}

}
