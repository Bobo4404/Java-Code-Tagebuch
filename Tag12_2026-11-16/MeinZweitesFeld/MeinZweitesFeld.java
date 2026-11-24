/*
 * Zweites Beispiel zu Feldern:
 * Anlegen, automatisiertes Belegen
 * u. ebenso automatisiertes Ausgeben
 */

public class MeinZweitesFeld {

	public static void main(String[] args) {
			// Anlegen des Feldes
		int[] meinFeld = new int[5];
		
			// automatisiertes Belegen mit Elementnr:
		for (int i=0; i<5; i++)	// i:0..4;
			meinFeld[i] = i+1;
		
			// automatiertes Ausgeben:
		for (int i=0; i<5; i++)
			System.out.println
			("An Indexpos. "+i+" steht EleNr. "+meinFeld[i]);
	}

}
