/*
 * Übung zur Infix-Notation: 
 * Berechnung der Fakultät einer Zahl
 * Herleitung aus dem Algo zur Zweierpotenz
 * Unterschied: Es wird nicht mit der fixen 2 multipliziert,
 * sondern mit den Zahlen 1 bis n.
 * Diese werden zufällig vom Laufindex i durchlaufen,
 * ursprünglich um zu zählen,
 * dass n Multiplikationen getätigt werden.
 * Doppelbedeutung von Laufindex i:
 * 1. Zählen, um n Multiplikationen auszuführen
 * 2. Generieren der Zahlen 1..n,
 * die aufmultipliziert werden sollen
 */

public class FakultätInfix {

	public static void main(String[] args) {
		int n = 5;	
		// ***********
		int ergebnis = 1;

		for (int i=1; i<=n; i++) {	// i:1..n
			ergebnis *= i;			// Infix-Notation
			System.out.println(i+"! = "+ergebnis);
		}
	}

}
