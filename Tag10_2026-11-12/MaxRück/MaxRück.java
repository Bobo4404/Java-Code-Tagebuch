/*
 * Erstes Beispiel für Methoden mit Rückgabewert
 * statt "void" wird der zurückzugebenden Typ eingesetzt,
 * hier: int
 * Der Methode werden zwei int-Parameter übergeben.
 * Nach einer Berechnung wird ein Wert zurückgegeben.
 * Er landet als textuelle Ersetzung
 * an der Aufrufstelle der Methode,
 * wo er von der Ausgabefunktion entgegengenommen
 * u. ausgegeben wird.
 * 
 * In der Version wird nicht direkt nach Bekanntwerden
 * des Ergebnisses mit zwei returns abgebrochen,
 * sondern das Ergebnis in einer Hilfsvariable gesammelt.
 * Somit haben wir ein "single out",
 * nur eine return-Anweisung am Schluss.
 * Das ist guter Stil,
 * da es die Lesbarkeit fördert
 * u. ein Fehlersuche erleichtert.
 */

public class MaxRück {

	public static void main(String[] args) {
		System.out.println
		("Das Maximum von 3 u. 5 ist "+max(3,5));
	}

	public static int max (int a, int b) {
		int maxRück;
		
		if (a>=b)
			maxRück = a;
		else
			maxRück = b;
		
		return maxRück;
	}
}
