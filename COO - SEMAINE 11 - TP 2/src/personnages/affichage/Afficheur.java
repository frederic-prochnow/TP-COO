package personnages.affichage;

import java.awt.Graphics;

import javax.swing.*;

public class Afficheur {
	
	private int largeurNiveau;
	private ImageIcon[][] images;
	private int hauteurImage;
	private int largeurImage;
	private int[][] niveaux;
	private int lignes;
	private int colonnes;
	
	Afficheur(String titre, String[][] chemins, int[][] niveaux) {
		JFrame fenetre = new JFrame(titre);
		// chemins ???
		// niveaux ???
	}
	
	public void paintComponent(Graphics g) {
		
	}
	
	public void setNiveaux(int[][] niveaux) {
		
	}
	
	public int[][] getNiveaux() {
		return null;
	}
	
	public void affichage() {
		
	}
}
