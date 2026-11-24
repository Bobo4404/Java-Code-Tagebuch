/*
 * Wie viele Jahre dauert es,
 * bis sich das Startkapital verdoppelt hat?
 */

public class ZinsenWhile {

	public static void main(String[] args) {
		double startKapital = 100.0,
			   zinssatz = 3.0;
		// *********************
		int jahre = 0;
		double aktuKapital = startKapital,
			   q = 1.0 + zinssatz/100.0;

		System.out.println
		("Sei ein Startkapital von "+startKapital+"€ gegeben,");
		System.out.println
		("sowie ein Zinssatz von "+zinssatz+"%.");
		System.out.println
		("Wie viele Jahre dauert es, \n"
			+ "bis sich das Kapital verdoppelt hat?\n");

		while(aktuKapital < 2.0 * startKapital) {
				// laufe, so lange das aktuelle Kapital
				// noch kleiner ist als das doppelte Starkapital
			System.out.println("Nach "+jahre+" Jahren: "+aktuKapital);
			aktuKapital *= q;	// verzinsen
			jahre++;
		}
		
		System.out.println
		("\nBei einem Startkapital von "+startKapital+"€,");
		System.out.println
		("sowie einem Zinssatz von "+zinssatz+"%");
		System.out.println
		("dauert es "+jahre+" Jahre,\n"
			+ "bis sich das Kapital verdoppelt hat\n"
			+ "nämlich auf "+aktuKapital+"€.");
	}

}
