package personnages.concret;

import java.util.Random;

import personnages.abstrait.*;

public class Guerrier  extends Personnage implements Combattant {
	
	private Arme arme;
	
	Guerrier() {
		super("005");
		Random r = new Random();
		int i = r.nextInt(3);
		this.arme = Arme.values()[i];
	}
	
	Guerrier(String nom) {
		super(nom);
		Random r = new Random();
		int i = r.nextInt(3);
		this.arme = Arme.values()[i];
	}
	
	Guerrier(String nom,Arme arme) {
		super(nom);
		this.arme = arme;
	}
	
	public String toString() {
		return super.toString() + ", Arme =" + this.arme + "]";
	}
	
	public void subitAttaque(Combattant c) {
		if(this.getArme().equals(this.getArme())) {
			this.perte(c.getForce());
		}else {
			this.perte(c.getForce()*c.getArme().puissance());
		}
	}
	
	public Arme getArme() {
		return this.arme;
	}
	
	public void attaque(Combattant c) {
		if(this.getArme().equals(c.getArme())) {
			c.perte(this.getForce());
		}else {
			c.perte(this.getForce()*this.arme.puissance());
		}
	}
}
