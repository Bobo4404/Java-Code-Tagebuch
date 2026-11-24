/*
 * Beispiel zur Infix-Notation:
 * Zur Ermittlung der allgemeinen Potenz:
 * basis hoch expo
 * wird auf eine Hilfsvariable
 * die basis expo mal aufmultipliziert.
 */

public class AllgemeinePotenz {

	public static void main(String[] args) {
		int basis=3, expo=5;
		// *******************
		int ergebnis=1;

		for (int i=1; i<=expo; i++) {	// i:1..expo: expo mal
			ergebnis *= basis;
			System.out.println
			(basis+" hoch "+i+" ist "+ergebnis);
		}
	}

}
