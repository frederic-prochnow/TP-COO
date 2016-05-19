package digisim;

public class Or2 extends Any2 implements Sortie{

	public Or2() {
		super();
	}

	public Or2(Sortie borneA,Sortie borneB) {
		super(borneA,borneB);
	}
	
	@Override
	public boolean valeur() {
		return this.getEntreeA().valeur() || this.getEntreeB().valeur();
	}

}
