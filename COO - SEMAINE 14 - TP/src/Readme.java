import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Readme {

	JFrame fen;


public Readme(){
		fen = new JFrame("Help?");
		fen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fen.setResizable(true);
		fen.setMinimumSize(new Dimension(300,400));
		fen.setSize(new Dimension(700,700));
		
		JLabel affichage = new JLabel("<html><body>aze<br>test</body></html>");
		
		fen.add(affichage);
		
		String affiche = "<html><body>";
		
		BufferedReader text;
		PrintWriter text2;
		try {
			text = new BufferedReader(new FileReader("ressources/README.MD"));
			affiche+=text.readLine();
			affiche+="<br>";
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			text = null;
		} catch (IOException e) {
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		
		fen.setVisible(true);
		
		
		try {
			text2 = new PrintWriter("ressources/README.MD");
			text2.write("bonjour tout le monde");
			//text2.newLine();
			text2.write("Nous sommes le 13"); 
			text2.close();
			affiche+=text2.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			while(text.ready()){
				affiche+=text.readLine();
				affiche+="<br>";
				//affiche+=text2;
			}
			text.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		affichage.setText(affiche);
	}
	public static void main(String[] args){
		new Readme();
	}
}
