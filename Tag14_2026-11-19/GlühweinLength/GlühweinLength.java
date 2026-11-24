/*
 * Dritte Version des Glühwein-Projektes
 * Dieses Mal verzichte ich auf die Übergabe
 * des Parameters "gruppengröße"
 * an die Methoden "belegeListe()" u. "ausgabeListe()",
 * weil ich mich stattdessen auf "liste.length" beziehe.
 * Vorteile:
 * 1. kürzerer Quelltext
 * 2. kürzere Laufzeit
 * 3. Ersparnis an Speicherplatz
 * 4. übersichtlicher, da weniger Parmeter
 * 5. Vermeidung der Gefahr, einen falschen Wert zu übergeben
 */

public class GlühweinLength {

	public static void main(String[] args) {
		double einzelpreis = 3.79;
		final int gruppengröße = 10;
		// ***************************
		double[] liste = new double[gruppengröße + 1];
		
			// Liste belegen:
		belegeListe(liste, einzelpreis);
		
			// Ausgabe Liste:
		ausgabeListe(liste);
	}

	public static void belegeListe
		(double[] liste, double einzelpreis) {
		for (int i=1; i<liste.length; i++)	// i:1..gruppengröße
			liste[i] = i * einzelpreis;		
	}
	
	public static void ausgabeListe	(double[] liste) {
		System.out.println("Unsere Glühweinpreise:\n");
		System.out.println("Anzahl\tPreis:\n");
		
		for (int i=1; i<liste.length; i++)
			System.out.println(i+"\t"+liste[i]);		
	}
}
