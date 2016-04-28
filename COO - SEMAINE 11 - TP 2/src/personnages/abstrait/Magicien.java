package personnages.abstrait;
import personnages.concret.*;

public interface Magicien extends Vivant{

	public void attaque(Magicien m);
	public void subitAttaque(Magicien m);
	public Element getElement();
}
