/*
 * Beispiel für eine while-Schleife,
 * die im übernächsten Schritt umgewandelt wird
 * in eine do-while-Schleife
 */

public class ZerfallWhile {

	public static void main(String[] args) {
		double startWert = 1.0, grenzWert = 0.1;
		// **************************************
		int hwz = 0;	// Halbwertszeit
		double aktuWert = startWert;

		System.out.println("Wie viele Halbwertszeiten müssen vergehen,");
		System.out.println("bis von einer Substanz der Menge "+startWert);
		System.out.println
		("nur noch weniger übrig ist als der Grenzwert "+grenzWert+" ?\n");
		
		while (aktuWert >= grenzWert) {
			System.out.println("Nach "+hwz+" Halbwertzeiten: "+aktuWert);
			aktuWert /= 2.0;		// Zerfallen lassen: halbieren
			hwz++;
		}

		System.out.println("\nEs müssen "+hwz+" Halbwertszeiten vergehen,");
		System.out.println("bis von einer Substanz der Menge "+startWert);
		System.out.println
		("nur noch weniger übrig ist als der Grenzwert "+grenzWert+",");
		System.out.println("nämlich "+aktuWert+".");
	}

}
