package personnages.abstrait;

public abstract class Personnage implements Vivant{

	private String nom;
	private int vie;
	private int force;
	private static int nbPersonnages;
	private int numeroPersonnage;
	
	/**
	 * @return le force
	 */
	public int getForce() {
		return this.force;
	}
	/**
	 * @param force le force à définir
	 */
	public void setForce(int force) {
		this.force = force;
	}
	/**
	 * @return le nom
	 */
	public String getNom() {
		return this.nom;
	}
	/**
	 * @return le vie
	 */
	public int getVie() {
		return this.vie;
	}
	
	public Personnage() {
	}
	
	public Personnage(String nom) {
		this.nom = nom;
		this.force = 10;
		this.vie = 100;
	}
	
	
	public void attaque(Vivant v) {
		v.perte(this.getForce());
	}
	
	public void subitattaque(Vivant v) {
		this.perte(v.getForce());
	}
	
	public void perte(int degats) {
		this.vie = this.vie - degats;
		
	}
	
	public boolean estVivant() {
		if(this.vie > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public String toString() {
		return "Personnage [nom=" + this.nom + ", vie=" + this.vie + ", force=" + this.force ;
	}
	
}	
