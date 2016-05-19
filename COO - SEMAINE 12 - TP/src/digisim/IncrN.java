package digisim;

public class IncrN {

	private Connexion[] entrees;
	private int MAXVAL;
	private Connexion retenue;
	private Connexion[] sorties;
	
	public IncrN(int size) {
		Incr1 incr2 = null;
		for(int i=0; i<size;i++) {
			entrees[i] = new Connexion();
			sorties[i] = new Connexion();
			Incr1 incr1 = new Incr1();
			incr1.getEntreeA().connectTo(entrees[i]);
			sorties[i].connectTo(incr1.getSomme());
			if(incr2 == null){
				incr1.getRetenueIn().connectTo(Fixe.TRUE);
			} else {
				incr1.getRetenueIn().connectTo(incr2.getRetenueOut());
			}
			incr2 = incr1;
		}
		retenue = new Connexion();
		retenue.connectTo(incr2.getRetenueOut());
		MAXVAL = size;
	}
	
	public Entree getEntree(int e) {
		return entrees[e];
	}
	
	public Sortie getSortie(int s) {
		return sorties[s];
	}
	
	public Sortie getRetenue() {
		return retenue;
	}
	
	public void setIntEntree(int x) {
		String binaire = "";
		int decimal = x;
		if(decimal<256) {
			decimal -= 128;
			binaire +=1;
		} else {
			binaire +=0;
		}
		if(decimal<128) {
			decimal -= 64;
			binaire += 1;
		} else {
			binaire += 0;
		}
		if(decimal<64) {
			decimal -= 32;
			binaire += 1;
		} else {
			binaire += 0;
		}
		if(decimal<32) {
			decimal -= 16;
			binaire += 1;
		} else {
			binaire += 0;
		}
		if(decimal<16) {
			decimal -= 8;
			binaire += 1;
		} else {
			binaire += 0;
		}
		if(decimal<8) {
			decimal -= 4;
			binaire += 1;
		} else {
			binaire += 0;
		}
		if(decimal<4) {
			decimal -= 2;
			binaire += 1;
		} else {
			binaire += 0;
		}
		if(decimal<2) {
			decimal -= 1;
			binaire += 1;
		} else {
			binaire += 0;
		}
		// a revoir
		for(int i=0; i<binaire.length(); i++) {
			char c = binaire.charAt(i);
			int j = (int) c;
			if(j == 1) {
				entrees[i].connectTo(Fixe.TRUE);
			} else {
				entrees[i].connectTo(Fixe.FALSE);
			}
		}
	}
	
	public int getIntSortie() {
		//a developer
		return 0;
	}
	

}
