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
		return force;
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
		return nom;
	}
	/**
	 * @return le vie
	 */
	public int getVie() {
		return vie;
	}
	
	Personnage() {
		this.force = 10;
		this.vie = 100;
	}
	
	Personnage(String nom) {
		this.nom = nom;
		this.force = 10;
		this.vie = 100;
	}
	
	/* !CodeTemplates.overridecomment.nonjd!
	 * @see personnages.abstrait.Vivant#attaque(personnages.abstrait.Vivant)
	 */
	@Override
	public void attaque(Vivant vivant) {
		// TODO Stub de la méthode généré automatiquement
		
	}
	/* !CodeTemplates.overridecomment.nonjd!
	 * @see personnages.abstrait.Vivant#subitattaque(personnages.abstrait.Vivant)
	 */
	@Override
	public void subitattaque(Vivant vivant) {
		// TODO Stub de la méthode généré automatiquement
		
	}
	/* !CodeTemplates.overridecomment.nonjd!
	 * @see personnages.abstrait.Vivant#perte(int)
	 */
	@Override
	public void perte(int perte) {
		// TODO Stub de la méthode généré automatiquement
		
	}
	/* !CodeTemplates.overridecomment.nonjd!
	 * @see personnages.abstrait.Vivant#estVivant()
	 */
	@Override
	public boolean estVivant() {
		// TODO Stub de la méthode généré automatiquement
		return false;
	}
	
	
	/* !CodeTemplates.overridecomment.nonjd!
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", vie=" + vie + ", force=" + force + ", numeroPersonnage=" + numeroPersonnage
				+ "]";
	}
	
}	
