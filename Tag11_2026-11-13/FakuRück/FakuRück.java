/*
 * Endgültige Version der Methode "faku()":
 * Mit Parameter und Rückgabewert.
 * Vorteil:
 * Nun kann mit den Ergebnissen weitergerechnet,
 * z. B. die Summe von Fakultäten gebildet werden.
 */

public class FakuRück {

	public static void main(String[] args) {
		System.out.println
		("Die Summe der Fakultäten von 5 u. 7 ist "+ (faku(5)+faku(7)) );
	}
	
		// Methode mit Parameter
	public static int faku (int n) {
		int ergebnis = 1;
		
		for (int i=1; i<=n; i++)	// i:1..n
			ergebnis *= i;
		
		return ergebnis;
	}

}
