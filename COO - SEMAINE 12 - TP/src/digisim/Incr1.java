package digisim;

public class Incr1 {

	private And2 and;
	private Connexion entree;
	private Connexion retenueIn;
	private Xor2 xor;
	
	public Incr1() {
		and = new And2();
		entree = new Connexion();
		retenueIn = new Connexion();
		xor = new Xor2();
		and.getEntreeA().connectTo(entree);
		and.getEntreeB().connectTo(retenueIn);
		xor.getEntreeA().connectTo(entree);
		xor.getEntreeB().connectTo(retenueIn);
	}
	
	public Entree getEntreeA() {
		return entree;
	}
	
	public Entree getRetenueIn() {
		return retenueIn;
	}
	
	public Sortie getSomme() {
		return xor;
	}
	
	public Sortie getRetenueOut() {
		return and;
	}

}
