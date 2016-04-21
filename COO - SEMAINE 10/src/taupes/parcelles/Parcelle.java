package taupes.parcelles;
import taupes.terrain.*;

public class Parcelle {

	private int trou = 0;
	private boolean tas;
	private boolean mur;
	private Coordonnees coordonnees;
	private Taupe taupe;
	
	public Parcelle(int x,int y) {
		this.coordonnees = new Coordonnees(x,y);
	}
	
	public Coordonnees getCoordonnees() {
		return coordonnees;
	}
	
	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}
	
	public Taupe getTaupe() {
		return this.taupe;
	}
	
	public int estTrou() {
		return trou;
	}
	
	public void setTrou(int trou){
		this.trou = trou;
	}
	
	public boolean estTas() {
		return tas;
	}
	
	public void setTas(boolean tas) {
		this.tas = tas;
	}
	
	public boolean estMur() {
		return mur;
	}
	
	public void setMur() {
		this.mur = true;
	}

	public int estTaupe() {
		if(getTaupe() == null) {
			return 0;
		} else {
			return taupe.getEquipe();
		}
	}
	
	public void poserTas() {
		this.tas = true;
	}
	
	public void retirerTas() {
		this.tas = false;
	}
	
	public void boucherTrou() {
		this.trou = 0;
	}
	
	public void poserTaupe(Taupe taupe) {
		this.taupe = taupe;
	}
	
	public void retirerTaupe() {
		this.taupe = null;
	}
	
	public void creuserTrou(int equipe){
		this.trou = equipe;
	}
	
	public void vider() {
		this.tas = false;
		this.mur = false;
		this.trou = 0;
		this.taupe = null;
	}
}
