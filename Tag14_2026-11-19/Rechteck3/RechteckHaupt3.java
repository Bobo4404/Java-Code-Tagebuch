/*
 * Mehrere Typen von Methoden:
 * 1. I/O: Ein- und/oder Ausgabe der Attribute
 * 2. Berechnungen auf Attribute
 * 3. Veränderung der Attribute
 */


public class RechteckHaupt3 {

	public static void main(String[] args) {
		// Erzeugen eines Rechtecks r1:
		System.out.println("Rechteck \"r1\":");
		Rechteck r1 = new Rechteck();
		
		// Belegen der Attribute:
		r1.laenge = 3;
		r1.breite = 5;

		// Ausgabe der Attribute:
		r1.schreibeRechteck();
		
		// Berechnung auf den Attributen:
		System.out.println
		("\nSeine Fläche beträgt "+
		r1.berechneFlächeRechteck());
		
		// Veränderung von Attributen:
		System.out.println("\nJetz vertausche ich die Seiten:");
		r1.vertauscheSeiten();
		r1.schreibeRechteck();
	}

}
