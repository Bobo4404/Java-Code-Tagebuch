/*
 * Zwischenschritt mit bedingter Anweisung:
 * 
 * 		if (es gibt etwas zu tun){
 * 			1. Berechnung
 * 			2. Antwortsatz
 * 		} else
 * 			Meldung
 * 
 */

public class ZerfallIf {

	public static void main(String[] args) {
		double startWert = 0.01, grenzWert = 0.1;
		// **************************************
		int hwz = 0;	// Halbwertszeit
		double aktuWert = startWert;

			// Frage
		System.out.println("Wie viele Halbwertszeiten müssen vergehen,");
		System.out.println("bis von einer Substanz der Menge "+startWert);
		System.out.println
		("nur noch weniger übrig ist als der Grenzwert "+grenzWert+" ?\n");
		
		if (aktuWert >= grenzWert) {	// es gibt etwas zu tun: Berechnung u. Anwort
		
						// 1. Berechnung
					while (aktuWert >= grenzWert) {
						System.out.println("Nach "+hwz+" Halbwertzeiten: "+aktuWert);
						aktuWert /= 2.0;		// Zerfallen lassen: halbieren
						hwz++;
					}
			
						// 2. Antwort
					System.out.println("\nEs müssen "+hwz+" Halbwertszeiten vergehen,");
					System.out.println("bis von einer Substanz der Menge "+startWert);
					System.out.println
					("nur noch weniger übrig ist als der Grenzwert "+grenzWert+",");
					System.out.println("nämlich "+aktuWert+".");
		
		} else // es gibt nichts zu tun: Meldung darüber
					System.out.println("Schon zu Beginn liegt der Startwert unter dem Grenzwert:\n"
							+ "Es gibt nichts zu tun!");
	}

}
