package personnages.concret;

import java.util.Random;

import personnages.abstrait.*;

public class Elfe  extends Personnage implements Magicien,Combattant{

	private boolean estGuerrier;
	private Arme arme;
	private Element element;
	
	Elfe() {
		super("006");
		Random r = new Random();
		int i = r.nextInt(3);
		this.element = Element.values()[i];
		i = r.nextInt(3);
		this.arme = Arme.values()[i];
	}
	
	Elfe(String nom) {
		super(nom);
		Random r = new Random();
		int i = r.nextInt(3);
		this.element = Element.values()[i];
		i = r.nextInt(3);
		this.arme = Arme.values()[i];
	}
	
	Elfe(String nom, Arme arme,Element element) {
		super(nom);
		this.arme = arme;
		this.element = element;
	}
	
	public String toString() {
		return super.toString() + ", Arme =" + this.arme + ", Element =" + this.element + "]";
	}
	
	public void attaque(Elfe e) {
		Random r = new Random();
		int i = r.nextInt(2);
		if(i==1){
			if(this.getArme().equals(e.getArme())) {
				e.perte(this.getForce());
			}else {
				e.perte(this.getForce()*this.arme.puissance());
			}
		}else{
			if(this.getElement().estOppose(e.getElement())) {
				e.perte(this.getForce()*4);
			}else 
				if(this.getElement().equals(e.getElement())) {
				e.perte(this.getForce());
			}else {
				e.perte(this.getForce()*2);
			}
		}
	}
	
	public void attaque(Combattant c) {
		if(this.getArme().equals(c.getArme())) {
			c.perte(this.getForce());
		}else {
			c.perte(this.getForce()*this.arme.puissance());
		}
	}
	
	public void attaque(Magicien m) {
		if(this.getElement().estOppose(m.getElement())) {
			m.perte(this.getForce()*4);
		}else 
			if(this.getElement().equals(m.getElement())) {
			m.perte(this.getForce());
		}else {
			m.perte(this.getForce()*2);
		}
	}
	
	public void attaque(Vivant v) {
		v.perte(this.getForce());
	}
	
	
	public void subitAttaque(Magicien m) {
		if(this.getElement().estOppose(m.getElement())) {
			this.perte(m.getForce()*4);
		}else 
			if(this.getElement().equals(m.getElement())) {
			this.perte(m.getForce());
		}else {
			this.perte(m.getForce()*2);
		}
	}
	
	public void subitAttaque(Combattant c) {
		if(c.getArme().equals(this.getArme())) {
			this.perte(c.getForce());
		}else {
			this.perte(c.getForce()*c.getArme().puissance());
		}
	}
	
	public Element getElement() {
		return this.element;
	}
	
	public Arme getArme() {
		return this.arme;
	}

}
