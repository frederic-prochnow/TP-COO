package personnages.abstrait;

public interface Magicien extends Vivant{

	public void attaque(Magicien magicien);
	public void subitAttaque(Magicien magicien);
	public Element getElement();
}
