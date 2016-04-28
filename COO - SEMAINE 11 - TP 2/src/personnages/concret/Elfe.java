package personnages.concret;

import personnages.abstrait.*;
import personnages.concret.*;

public class Elfe  extends Personnage implements Magicien,Combattant{

	private boolean estGuerrier;
	private Arme arme;
	private Element element;
	
	Elfe() {
		
	}
	
	Elfe(String nom) {
		
	}
	
	Elfe(String nom, Arme arme,Element element) {
		
	}
	
	public String toString() {
		return null;
	}
	
	public void attaque(Elfe elfe) {
		
	}
	
	public void attaque(Combattant combattant) {
		
	}
	
	public void attaque(Magicien magicien) {
		
	}
	
	public void attaque(Vivant vivant) {
		
	}
	
	public void subitattaque(Magicien magicien) {
		
	}
	
	public void subitattaque(Combattant combattant) {
		
	}
	
	public Element getElement() {
		return element;
	}
	
	public Arme getArme() {
		
	}
}
