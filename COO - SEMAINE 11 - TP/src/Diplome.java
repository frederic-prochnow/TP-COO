public enum Diplome {
	BTS("Brevet de Technicien Supérieur"), 
	DUT("Diplome Universitaire de Technologies"), 
	LICENCE;
	
	private String nom;
	
	private Diplome(){
		nom=this.toString();
	}
	
	private Diplome(String nom){
		this.nom=nom;
	}
	
	public String getNom(){
		return nom;
	}
	
	public static void afficheTout(){
		for (int i=0;i<Diplome.values().length;i++) {
			System.out.println(Diplome.values()[i]+":"+Diplome.values()[i].getNom());
		}
	}
}
