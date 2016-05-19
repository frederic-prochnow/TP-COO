package digisim;

public class Xor2 extends Any2 implements Sortie{

	public Xor2() {
		super();
	}

	public Xor2(Sortie borneA,Sortie borneB) {
		super(borneA,borneB);
	}
	
	@Override
	public boolean valeur() {
		return this.getEntreeA().valeur() ^ this.getEntreeB().valeur();
	}
}
