package personnages.abstrait;

public interface Combattant extends Vivant{

	public void attaque(Combattant combattant);
	public Arme getArme();
}
