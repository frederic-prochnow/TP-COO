package personnages.concret;

public enum Element {

	EAU,FEU,TERRE,AIR;
	
	Element() {
	}
	
	public boolean estOppose(Element element) {
		if(this == element.getOppose()) {
			return true;
		} else {
			return false;
		}
	}
	
	public Element getOppose() {
		if(this == EAU) {
			return FEU;
		}else 
			if(this == FEU) {
			return EAU;
		}else 
			if(this == TERRE) {
			return AIR;
		}else 
			if(this == AIR) {
			return TERRE;
		}else {
			return null;
		}
	}
}
