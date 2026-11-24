/*
 * Lookup-Table für Preise:
 * Im Feld an Stelle i soll stehen,
 * wie viel i Glühwein kosten.
 * Die Gruppengröße wird als Konstante deklariert,
 * damit sie nicht verädert werden kann,
 * nachdem das Feld mit ihr aufgezogen wurde.
 * Das Feld wird mit einem größer als der Gruppengröße dimensioniert,
 * damit Index 0 ignoriert werden kann.
 */

public class Glühweinpreisliste {

	public static void main(String[] args) {
		double einzelpreis = 3.79; 
		final int gruppengröße = 10;	// Konstante
		// *********************
		double[] liste = new double[gruppengröße + 1];
			// Deklaration mit einem mehr als Gruppengröße,
			// um Offset bei Beginn mit 0 zu vermeiden
		
			// Belegen der List:
		for (int i=1; i<=gruppengröße; i++)	// i:1..gruppengröße
			liste[i] = i * einzelpreis;
		
			// Ausgeben der Liste:
		System.out.println("Unsere Glühweinpreise:\n");
		System.out.println("Anzahl\tPreis\n");
		
		for (int i=1; i<=gruppengröße; i++)
			System.out.println(i+"\t"+liste[i]);
	}

}
