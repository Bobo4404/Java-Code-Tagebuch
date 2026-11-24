/*
 * Anwendung der Konstanten <Feldname>.length:
 * Methoden sollen so verallgemeinert werden,
 * dass sie Felder unterschiedlicher Länge verarbeiten können.
 * Dafür beziehen sie sich in der Schleife 
 * bei der Obergrenze auf <Feldname>.length
 */

public class FelderUnterschieldicherLänge {

	public static void main(String[] args) {
		int[] feld1 = new int[ 5];
		int[] feld2 = new int[10];
		int[] feld3 = new int[15];

		belegeFeld(feld1);
		belegeFeld(feld2);
		belegeFeld(feld3);
		
		ausgabeFeld(feld1);
		ausgabeFeld(feld2);
		ausgabeFeld(feld3);
	}

		// belegt Feld unterschiedlicher Größen
		// mit den Elementnummern
	public static void belegeFeld(int[] feld) {
		for (int i=0; i<feld.length; i++)	// i:0..<Feldgröße
			feld[i] = i+1;	// Elementnummer 1 größer als Index
	}
	
		// gibt Felder unterschiedlicher Größe aus
	public static void ausgabeFeld(int[] feld) {
		for (int i=0; i<feld.length; i++)	// i:0..<Feldgröße
			System.out.print  (feld[i]+" ");
		System.out.println();
	}
}
