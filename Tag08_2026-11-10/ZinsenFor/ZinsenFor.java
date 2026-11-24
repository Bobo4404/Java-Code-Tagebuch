/*
 * Vorgegeben:
 * Kapital "startKapital" von 100€,
 * Zinssatz: 3%
 * 
 * Fragestellung 1:
 * Auf welchen Betrag wächst das Startkapital
 * nach 10 Jahren an?
 * 
 * print-f-Anweisung gibt Variable 
 * auf genau 2 Nachkommastellen abgeschnitten an.
 */

public class ZinsenFor {

	public static void main(String[] args) {
		double startKapital = 100.0,
			   zinssatz = 3.0;
		int jahre = 10;
		// ****************************
		double aktuKapital = startKapital,
			   q = 1.0 + zinssatz/100.0;
		
		System.out.println
		("Sei ein Kapital gegeben von "+startKapital+"€");
		System.out.println
		("sowie ein Zinssatz von "+zinssatz+"%.");
		System.out.println
		("Auf welchen Betrag wächst es nach "+jahre+" Jahren an?\n");
		
		for (int i=1; i<=jahre; i++) {	//i:1..jahre: jahre mal
			aktuKapital *= q;
			System.out.println("Nach "+i+" Jahren: "+aktuKapital);
		}
		
		System.out.println
		("\nEin Kapital von "+startKapital+"€");
		System.out.println
		("wächst bei einem Zinssatz von "+zinssatz+"%");
		System.out.print
		("nach "+jahre+" Jahren auf ");
		
//			//Variante 1 mit "normaler" println-Anweisung
//		System.out.println(aktuKapital+"€ an.");
		
			// Variante 2 mit "normaler" printf-Anweisung
		System.out.printf("%.2f€ an.",aktuKapital);
	}

}
