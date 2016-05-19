package saisie;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import scanner.FormatDateException;

public class Saisie {

	public static jours SaisieJour() throws JourException{
		Scanner clavier = new Scanner(System.in);
		jours[] tab = jours.values();
		jours j; 
		String jour = clavier.next();
		for(int i=0; i<tab.length; i++){
			if(jour.equals(tab[i].getS())) {
				j = tab[i];
				return j;
			}
		}
		throw new JourException("jour non valide");
	}
	public static jours SaisieJourOuvre() throws JourOuvreException,JourException {
		if(SaisieJour().jourOuvre()){
			return SaisieJour();
		} else {
			throw new JourOuvreException("jour non valide");
		}
	}
	public static void main(String[]args){
		try {
			jours j2 = SaisieJour();
		} catch(JourException e) {
			System.out.println("Erreur,non conforme");
		}
	}
}
