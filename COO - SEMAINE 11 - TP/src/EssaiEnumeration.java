public class EssaiEnumeration {
		
	public static void main(String[] args) {
		
		// La variable ne peut prendre qu'une des trois valeurs : BTS,DUT,LICENCE
		Diplome qualification = Diplome.DUT;
		
		// Dans un case on ne reprend pas le nom de la classe
		switch (qualification){
		case BTS: System.out.println("Bof");break;
		case DUT: System.out.println("Super");break;
		case LICENCE: System.out.println("A suivre");break;
		default:System.out.println("Fallait bosser!");break;
		}
	}
}
