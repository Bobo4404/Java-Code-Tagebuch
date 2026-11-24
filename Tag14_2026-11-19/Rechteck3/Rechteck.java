
public class Rechteck {
		// Attribute:
	int laenge=0, breite=0;

		// Beispiel für Veränderung von Attributen
	public void vertauscheSeiten() {
		int hilf = laenge;
		laenge = breite;
		breite = hilf;
	}
	
		// Beispiel für Berechnung auf Attriubten
	public int berechneFlächeRechteck() {
		return laenge * breite;
	}
	
		// Beispiel für I/O auf Attributen
	public void schreibeRechteck() {
		System.out.println("Laenge: "+laenge);
		System.out.println("Breite: "+breite);		
	}
}
