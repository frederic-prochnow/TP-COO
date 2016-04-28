package personnages.simulation;

import java.util.Random;

import personnages.affichage.*;
import personnages.concret.*;

public class SimulationPeuples {

	private Guerrier guerrier;
	private Elfe elfes;
	private Mage mages;
	
	private int nbPeuples;
	private int nbIndividus;
	private int nbArmes;
	private int nbElements;
	private Random r;
	
	SimulationPeuples() {
	}
	
	private int[][] getNiveaux() {
		int[][] resultat = new int[nbIndividus][2];
		for(int i=0; i<this.nbIndividus; i++) {
			// effectuer le calcul
			resultat[i][1] = i;
			resultat[i][2] = this.guerrier.getForce();
		}
		return resultat;
	}
	
	public void lancer(Afficheur afficheur) {
		
	}
}