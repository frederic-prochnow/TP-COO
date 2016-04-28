package personnages.concret;

import java.util.Random;
import personnages.abstrait.*;

public class Mage extends Personnage implements Magicien{

	private Element element;
	
	Mage() {
		new Elfe("007");
	}
	
	Mage (String nom) {
		super(nom);
		Random r = new Random();
		int i = r.nextInt(3);
		this.element = Element.values()[i];
	}
	
	Mage (String nom, Element element) {
		super(nom);
		this.element = element;
	}
	
	public String toString() {
		return super.toString()+", Element =" + this.element + "]";
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
	
	public Element getElement() {
		return this.element;
	}
}
