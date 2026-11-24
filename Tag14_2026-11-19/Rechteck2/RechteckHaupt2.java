/*
 * Beispiel für Methoden als zweiten Bestandteil
 * von (abhängigen) Klassen:
 * 1. Attribute: Eigenschaften
 * 2. Methoden: Aktionen auf Eigenschaften
 */


public class RechteckHaupt2 {

	public static void main(String[] args) {
		// Erzeugen eines Rechtecks r1:
		System.out.println("Rechteck \"r1\":");
		Rechteck r1 = new Rechteck();
		
		// Belegen der Attribute:
		r1.laenge = 3;
		r1.breite = 5;

		// Ausgabe der Attribute:
		r1.schreibeRechteck();
	}

}
