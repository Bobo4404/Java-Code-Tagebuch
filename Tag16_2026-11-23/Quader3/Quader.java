	// Subklasse
public class Quader extends Rechteck {
	int hoehe=0;
	
		// Bezug auf eine geerbte Methode mit Zwischenberechnung
	public int berechneVolumenQuader() {
		return berechneFlaecheRechteck() * hoehe;
	}
	
	public void schreibeQuader() {
//		System.out.println("Laenge: "+laenge);
//		System.out.println("Breite: "+breite);
			// Aufruf der geerbten Methode:
		schreibeRechteck();
		System.out.println("Hoehe:  "+hoehe);		
	}
}
