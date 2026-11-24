/*
 * Vom einzelnen Parameter zur Parameterliste:
 * Ergänzung um einen weiteren Parameter,
 * um eine beliebige Anzahl
 * eines beliebigen Zeichens schreiben zu können
 */

public class SchreibeSterne2Par {

	public static void main(String[] args) {
		schreibeSterne(10, 'a');
		schreibeSterne(15, 'b');
		schreibeSterne( 5, 'c');
	}

	public static void schreibeSterne(int anzahl, char bu) {
		for (int i=1; i<=anzahl; i++)	// i:1..anzahl: anzahl mal
			System.out.print  (bu);
		System.out.println();
	}
}
