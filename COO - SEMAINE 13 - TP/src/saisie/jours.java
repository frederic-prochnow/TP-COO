package saisie;

public enum jours {
	lundi("lundi"),
	mardi("mardi"),
	mercredi("mercredi"),
	jeudi("jeudi"),
	vendredi("vendredi"),
	samedi("samedi"),
	dimanche("dimanche");
	private String s;
	
	private jours(String s){
		this.s = s;
	}
	
	public boolean jourOuvre(){
		if(this==samedi || this==dimanche) {
			return false;
		} else {
			return true;
		}
	}

	public String getS() {
		return s;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
	public static jours getJour(String s) {
		jours[] tab = jours.values();
		for(int i = 0; i<tab.length; i++){
			if(tab[i].equals(s)){
				return tab[i];
			}
		}
		return null;
	}
}
