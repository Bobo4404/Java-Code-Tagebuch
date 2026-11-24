
public class Doppelschleife2 {

	public static void main(String[] args) {

		// äußere Schleife
		for (int zeile=1; zeile<=9; zeile++) {
			
			System.out.print  (zeile+": ");
			
			// innere Schleife
			for (int spalte=1; spalte<=9; spalte++) {
				System.out.print  (spalte);
			}
			
			// Zeilenumbruch nachdem alle Spalten der Zeile
			// geschrieben wurden,
			// bevor es in die nächste Zeile geht
			System.out.println();
		}
		
	}
}
