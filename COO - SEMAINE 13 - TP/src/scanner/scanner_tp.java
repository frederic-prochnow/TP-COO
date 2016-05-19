package scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class scanner_tp {

	public static int lireEntier() {
		Scanner clavier = new Scanner(System.in);
		int res;
		try {
			res = Integer.parseInt(clavier.next());
		} catch(NumberFormatException e) {
			res = 0;
		}
		return res;
	}
	
	public static Calendar dateFromString(String date) throws FormatDateException{
		Calendar c = new GregorianCalendar();
			if(date.matches("\\d{2}/\\d{2}/\\d{4}")) {
					String j = date.substring(0, 2);
					int jj = Integer.parseInt(j);
					String m = date.substring(3, 5);
					int mm = Integer.parseInt(m);
					String aaa = date.substring(6,10);
					int aaaa = Integer.parseInt(aaa);
					c = new GregorianCalendar(aaaa,mm,jj);
			} else {
				throw(new FormatDateException("forme non conforme"));
			}
		return c;
	}
	
	public static void main(String[] args ){
		//System.out.println(lireEntier());
		try {
			Calendar c = dateFromString("07/07/1997");
			System.out.println("Essai 1 = " + c.get(GregorianCalendar.DAY_OF_MONTH)+" / "+c.get(GregorianCalendar.MONTH)+" / "+c.get(GregorianCalendar.YEAR));
		} catch(FormatDateException e) {
			System.out.println("Essai 1 = Erreur, date non conforme");
		}
		try {
			Calendar d = dateFromString("aa/bb/cccc");
			System.out.println("Essai 2 = " + d.get(GregorianCalendar.DAY_OF_MONTH)+" / "+d.get(GregorianCalendar.MONTH)+" / "+d.get(GregorianCalendar.YEAR));
		} catch(FormatDateException e) {
			System.out.println("Essai 2 = Erreur, date non conforme");
		}
	}
}
