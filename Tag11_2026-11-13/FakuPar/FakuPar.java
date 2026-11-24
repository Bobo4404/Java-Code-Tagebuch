/*
 * Zwischenversion der Methode "faku()":
 * Mit Parameter aber noch ohne Rückgabewert.
 * Vorteil:
 * Damit mehrfache Berechnung der Faku von Zahlen
 * ohne Quelltextduplizierung möglich.
 * Nachteil:
 * Ergebnis wird nur auf der Konsole ausgegeben.
 * Es kann nicht damit weitergerechnet werden,
 * z. B. die Summe von Fakultäten gebildet werden.
 */

public class FakuPar {

	public static void main(String[] args) {
		faku(5);
		faku(7);
	}
	
		// Methode mit Parameter
	public static void faku (int n) {
		int ergebnis = 1;
		
		for (int i=1; i<=n; i++)	// i:1..n
			ergebnis *= i;
		
		System.out.println
		("Die Fakultät von "+n+" ist "+ergebnis);		
	}

}
