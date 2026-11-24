/*
 * Erweiterte Version mit "long" als Rückgabetyp,
 * weil die Fakultäten recht schnell sehr groß werden
 * Rückgabewert u. Hilfsvariable,
 * in der das Ergebnis gesammelt wird,
 * werden als "long" deklariert.
 * In der Schleife treffen i als int
 * u. "ergebnis" als long aufeinander.
 * Es findet eine "implizite Konvertierung"
 * ein "promoting" statt.
 * Stattdessen kann man die Umwandlung auch explizit durchführen
 * mit dem "cast-Operator":
 * Der Typ, in den eine Variable umgewandelt werden soll,
 * wird in runden Klammern vor die Variable geschrieben
 * Hier in Zeile 33
 */

public class FakuLong {

	public static void main(String[] args) {
		int n = 20;
		
		System.out.println
		("Die Fakultäten von "+n+" ist "+ faku(n));
	}
	
		// Methode mit Parameter und Rückgabewert
	public static long faku (int n) {
		long ergebnis = 1;
		
		for (int i=1; i<=n; i++)	// i:1..n
				// cast-Operator: explizite Typanpassung
			ergebnis *= (long)i;
		
		return ergebnis;
	}

}
