/*
 * Aufgabe zur Erweiterung der Parameterliste
 * um einen dritten Parameter:
 * Nur wenn im booleschen Parameter "nl" für new line
 * ein "true" kommt,
 * soll ein Zeilenumbruch nach der Ausgabe erfolgen,
 * sonst nicht.
 */

public class SchreibeSterne3Par {
	
	public static void main (String[] args) {
		schreibeSterne( 5, 'a', false);
		schreibeSterne( 5, 'b', false);
		schreibeSterne( 5, 'c', true);
		schreibeSterne(15, 'd', true);
		schreibeSterne( 5, 'e', false);
		schreibeSterne( 5, 'f', false);
		schreibeSterne( 5, 'g', true);
	}
	
	public static void schreibeSterne
			(int anzahl, char bu, boolean nl) {
		
		for (int i=1; i<=anzahl; i++)	// i:1..anzahl: anzahl mal
			System.out.print  (bu);
		
		if (nl)
			System.out.println();
	}
}
