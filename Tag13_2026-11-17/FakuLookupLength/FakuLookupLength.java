/*
 * dritte Version,
 * bei der die Feldgröße den Methoden 
 * nicht als Parameter übergeben wird,
 * sondern wir uns auf <Feldname>.length beziehen.
 * Vorteile:
 */

public class FakuLookupLength {

	public static void main(String[] args) {
		final int fakuMax = 10;
		// ***********************
		int[] fakuFeld = new int[fakuMax+1];
		
			// Feld belegen, alte Version 
			// belegeFeld(fakuFeld, fakuMax);
		// Feld belegen, neue Version 
		belegeFeld(fakuFeld);

			// Feld ausgeben:
			// ausgabeFeld(fakuFeld, fakuMax);
		// Feld ausgeben, neue Version:
		ausgabeFeld(fakuFeld);
	}

			// Signatur alte Version:
			// public static void belegeFeld (int[] fakuFeld, int fakuMax) {
		// neue Version ohne Übergabe von "fakuMax":
	public static void belegeFeld (int[] fakuFeld) {
		for (int i=1; i<fakuFeld.length; i++)	// i:1..fakuMax
			fakuFeld[i] = faku(i);		
	}
	
			// Signarur alte Version mit Paramter "fakuMax":
			// public static void ausgabeFeld (int[] fakuFeld, int fakuMax) {
		// neue Version ohne Übergabe von "fakuMax":
	public static void ausgabeFeld (int[] fakuFeld) {
		System.out.println("Fakultätstabelle:\n");
		
		for (int i=1; i<fakuFeld.length; i++)	// i:1..fakuMax
			System.out.println(i+"! = "+fakuFeld[i]);		
	}
	

	public static int faku (int n) {
		int ergebnis = 1;
		
		for (int i=1; i<=n; i++)		//i:1..n
			ergebnis *= i;
		
		return ergebnis;
	}
}
