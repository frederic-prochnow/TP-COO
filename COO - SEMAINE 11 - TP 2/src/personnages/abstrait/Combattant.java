package personnages.abstrait;
import personnages.concret.*;

public interface Combattant extends Vivant{

	public void attaque(Combattant combattant);
	public Arme getArme();
}
