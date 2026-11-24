/*
 * Einführung von <Feldname>.length:
 * Bei Deklaration eines Feldes
 * wird automatisch auch eine Konstante
 * <Feldname>.length angelegt,
 * die die Größe des Feldes beinhaltet.
 * Sie ist überall dort verfügbar,
 * wo auch das Feld sichtbar ist,
 * z.B. auch in Methoden,
 * denen das Feld übergeben wurde.
 * Dadurch können Programme verallgemeinert werden
 * u. die Übergabe der Feldlänge als Parameter entfällt.
 */

public class FeldnamePunktLength {

	public static void main(String[] args) {
		int[] meinFeld = new int[123];

		System.out.print  ("Länge von \"meinFeld\": ");
		System.out.println(meinFeld.length);
		
		m(meinFeld);
	}

	public static void m(int[] feld) {
		System.out.println
		("\nAuch in der Methode verfügbar: ");
		System.out.println("Feldlänge: "+feld.length);
	}
}
