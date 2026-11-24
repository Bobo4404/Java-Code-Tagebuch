
public class Eimaleins {

	public static void main(String[] args) {
		
		// Spaltenüberschrift:
		System.out.print  ("\t|");
		for (int spalte=1; spalte<=9; spalte++)
			System.out.print  ("\t"+spalte);
		System.out.println();

		// Strich mit Einfachschleife:
		for (int strich=1; strich<=82; strich++)
			System.out.print  ("-");
		System.out.println();
		
		// Doppelschleife:
		// äußere Schleife:
		for (int zeile=1; zeile<=9; zeile++) {	// zeile:1..9
			
			// vor Spalten der Zeile
			System.out.print  (zeile+"\t|");
			
			// innere Schleife:
			for(int spalte=1; spalte<=9; spalte++) {	// spalte:1..9
				System.out.print  ("\t"+(zeile*spalte));
			}
			
			System.out.println();  // Zeilenumbruch
		}
	}

}
