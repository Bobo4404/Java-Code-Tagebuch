/*
 * Fakultätstabelle als lookup-table:
 * Werden in einem Programm häufig Ergebnisse einer Berechnung,
 * z.B. die Fakultäten, benötigt,
 * ist es effektiver, die Berechnungen nur einmal durchzuführen
 * u. die Ergebnisse in einem Feld zu speichern.
 * Auf ein Feld kann in konstanter Zeit zugegriffen werden.
 * Die Berechnung erfolgt über die schon bekannte Methode "faku()".
 * Beim Belegen wird ins Feld an Stelle i 
 * die Fakultät von i geschrieben.
 * Index 0 wird ignoriert.
 * Deshalb muss das Feld um 1 größer dimensioniert werden
 * als die größte Zahl,
 * deren Faku gespeichert werden soll.
 * In der ersten Version erfolgt sowohl Belegung
 * als auch Ausgabe des Feldes im Hauptprogramm.
 */

public class FakuLookup {

	public static void main(String[] args) {
		final int fakuMax = 10;
		// ***********************
		int[] fakuFeld = new int[fakuMax+1];
		
			// Feld belegen:
		for (int i=1; i<=fakuMax; i++)	// i:1..fakuMax
				// Schreibe im Feld an Stelle i
				// die Fakultät von i,
				// über die Methode berechnet:
			fakuFeld[i] = faku(i);

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
