	// Hauptklasse mit Hauptmethode

public class RechteckHaupt1 {

	public static void main(String[] args) {
			// Erzeugen eines Objektes:
		System.out.println
			("Ich erzeuge ein Rechteck \"r1\":");
		Rechteck r1 = new Rechteck();

			// Belegen der Attribute
		r1.laenge = 3;
		r1.breite = 5;
		
			// Ausgeben der Attribute:
		System.out.println("Länge:  "+r1.laenge);
		System.out.println("Breite: "+r1.breite);
	}

}
