package digisim;

public class And2 extends Any2 implements Sortie{

	public And2() {
		super();
	}

	public And2(Sortie borneA,Sortie borneB) {
		super(borneA,borneB);
	}
	
	@Override
	public boolean valeur() {
		return this.getEntreeA().valeur() && this.getEntreeB().valeur();
	}

}
