/*
 * zweite Version mit Belegung u. Ausgabe 
 * ausgelagert in Methoden
 */

public class FakuLookupMethoden {

	public static void main(String[] args) {
		final int fakuMax = 10;
		// ***********************
		int[] fakuFeld = new int[fakuMax+1];
		
			// Feld belegen:
		belegeFeld(fakuFeld, fakuMax);

			// Feld ausgeben:
		ausgabeFeld(fakuFeld, fakuMax);
	}

	public static void belegeFeld (int[] fakuFeld, int fakuMax) {
		for (int i=1; i<=fakuMax; i++)	// i:1..fakuMax
			fakuFeld[i] = faku(i);		
	}
	
	public static void ausgabeFeld (int[] fakuFeld, int fakuMax) {
		System.out.println("Fakultätstabelle:\n");
		
		for (int i=1; i<=fakuMax; i++)	// i:1..fakuMax
			System.out.println(i+"! = "+fakuFeld[i]);		
	}
	

	public static int faku (int n) {
		int ergebnis = 1;
		
		for (int i=1; i<=n; i++)		//i:1..n
			ergebnis *= i;
		
		return ergebnis;
	}
}
