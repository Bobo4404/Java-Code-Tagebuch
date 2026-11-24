
/*
 * Erstes Beispiel für ein Feld:
 * Ein Feld namens "meinFeld"
 * aus int-Variablen der Größe 5 wird angelegt.
 * Dann wird an Indexpos. 3 die Zahl 17 geschrieben.
 * Anschließend wird das Element ausgelesen.
 */

public class MeinErstesFeld {

	public static void main(String[] args) {
			// Deklaration eines Feldes:
			// Typ: int
			// Name: meinFeld
			// Größe: 5
		int[] meinFeld = new int[5];
		
			// Schreiben an Indexpos 3:
			// Wert 17:
		meinFeld[3] = 17;
		
			// lesender Zugriff auf Indexpos. 3:
		System.out.println(meinFeld[3]);
	}

}
