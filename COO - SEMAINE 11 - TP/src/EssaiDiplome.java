import java.util.EnumSet;

public class EssaiDiplome{
	
	public static void main(String[] args) {
		
		Diplome qualification = Diplome.DUT;
		System.out.println(qualification) ; // affiche DUT
		// Les trois instructions suivantes réalisent la même opération :
		qualification = Diplome.DUT;
		qualification = Diplome.valueOf("DUT");
		qualification = Enum.valueOf(Diplome.class,"DUT");
		Diplome[] diplomes = Diplome.values() ;
		
		System.out.println(diplomes[1]); // affiche DUT
		System.out.println("N°"+qualification.ordinal()+" : "+qualification); // affiche N°1 : DUT
		
		System.out.println(Diplome.DUT.compareTo(Diplome.BTS)) ; // affiche 1
		Diplome.afficheTout();
		
		EnumSet<Diplome> enumSet = EnumSet.allOf(Diplome.class);
		
		for(Diplome diplome : enumSet) {
			System.out.println(diplome);
		}
	}
}