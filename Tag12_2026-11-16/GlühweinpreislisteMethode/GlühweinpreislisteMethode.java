/*
 * Auslagerung des Belegens u. der Ausgabe in Methoden:
 * Das Feld muss übergeben werden,
 * ebenso beim Belegen der Ausgabepreis.
 * In dieser Version wird auch die Gruppengröße übergeben,
 * was in der nächsten Version wegoptimiert werden wird.
 */

public class GlühweinpreislisteMethode {

	public static void main(String[] args) {
		double einzelpreis = 3.79; 
		final int gruppengröße = 10;	// Konstante
		// *********************
		double[] liste = new double[gruppengröße + 1];
			// Deklaration mit einem mehr als Gruppengröße,
			// um Offset bei Beginn mit 0 zu vermeiden
		
			// Belegen der List:
		belegeFeld(liste, einzelpreis, gruppengröße);
		
			// Ausgeben der Liste:
		ausgabeListe(liste, gruppengröße);
	}
	
	public static void belegeFeld
		(double[] liste, double einzelpreis, int gruppengröße) {
			
		for (int i=1; i<=gruppengröße; i++)	// i:1..gruppengröße
			liste[i] = i * einzelpreis;		
	}
	
	public static void ausgabeListe
		(double[] liste, int gruppengröße) {
		System.out.println("Unsere Glühweinpreise:\n");
		System.out.println("Anzahl\tPreis\n");
		
		for (int i=1; i<=gruppengröße; i++)
			System.out.println(i+"\t"+liste[i]);		
	}
}
