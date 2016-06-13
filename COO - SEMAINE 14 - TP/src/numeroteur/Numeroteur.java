package numeroteur;

import java.io.BufferedReader;
import java.io.FileReader;

public class Numeroteur {

	public static void main(String[] args) {
		int cpt=1;
		String ligne;
		FileReader flux;
		BufferedReader fichier;

		try{
			flux=new FileReader("ressources/README.MD"); 
			fichier=new BufferedReader(flux);
			while ((ligne=fichier.readLine())!=null)
				System.out.println(cpt++ + "\t"+ligne);
			flux.close();
			fichier.close(); 
		}
		catch (Exception e){
			System.err.println("Erreur ==> "+e.toString());
		}
	}
}
