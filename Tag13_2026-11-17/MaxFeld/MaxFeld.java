/*
 * Lösung des Beispiels, das uns motiviert hat, Felder einzuführen:
 * Einer Methode "max" wird ein großes Feld mit Ganzzahlen übergeben.
 * Die Methode sucht automatisiert nach dem größten Element
 * u. gibt es zurück.
 * 
 * Die Methode "belegeFeld()" belegt ein Feld dahingehend,
 * dass alle Elemente mit dem "einheitsWert" belegt werden.
 * Danach wird an einer Stelle "versteckStelle",
 * die relativ zur Feldgröße definiert ist,
 * der "versteckWert" versteckt.
 */

public class MaxFeld {

	public static void main(String[] args) {
		// Deklaration eines großen int-Feldes:
		int feldgröße = 1000000;
		int[] feld = new int[feldgröße];

		belegeFeld(feld);
		System.out.println("Maximum: "+max(feld));
	}

	public static void belegeFeld(int[] feld) {
				// Wert, mit dem das Feld durchgehend belegt wird:
		int einheitsWert = 1,	
				// Maximum, das "versteckt werden soll":
			versteckWert = 17,
				// Versteckstelle relativ zur Feldgröße:
			versteckStelle = feld.length/2;
		
			// Setzen des Einheitswertes auf das ganze Feld:
		for (int i=0; i<feld.length; i++)	// i:0..<feldgröße
			feld[i] = einheitsWert;
		
			// verstecke "versteckwert" an "verSteckstelle"
		feld[versteckStelle] = versteckWert;
	}
	
	public static int max(int[] feld) {
		int maxBisJetzt = feld[0];	// init mit erstem Feldelement
		
		for (int i=1; i<feld.length; i++)	// i:1..<feldgröße
			if (feld[i] > maxBisJetzt)		// neues Max. gefunden
				maxBisJetzt = feld[i];		// überschreibe bisheriges Max.
		
		return maxBisJetzt;
	}
}
