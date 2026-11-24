/*
 * 1. Beispiel für eine Methode mit Parameter:
 * Methode "schreibeSterne()" wird so verallgemeinert,
 * dass sie nicht nur eine fixe-,
 * sondern eine beliebige Anzahl Sterne schreiben kann.
 * Dazu wird bei der Deklaration in den runden Klammern
 * ein Parameter definiert.
 * Dies ist die "formale Parameterliste".
 * Bei Aufruf wird ein Wert übergeben,
 * die "aktuelle Parameterliste".
 * Somit können mit Methoden mehrfach 
 * nicht nur identische-,
 * sondern auch ähnliche Aufgaben ausgeführt werden!
 */

public class SchreibeSterne1Par {

	public static void main(String[] args) {
		schreibeSterne(5);
		schreibeSterne(10);
		schreibeSterne(15);
		schreibeSterne(10);
		schreibeSterne(5);
	}

	public static void schreibeSterne(int anzahl) {
		for (int i=1; i<=anzahl; i++)	// i:1..15: 15 mal
			System.out.print  ("*");
		System.out.println();
	}
}
