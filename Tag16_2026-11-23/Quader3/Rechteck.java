	// Superklasse
public class Rechteck {
	int laenge=0, breite=0;
	
	public int berechneFlaecheRechteck() {
		return laenge * breite;
	}
	
	public void schreibeRechteck() {
		System.out.println("Laenge: "+laenge);
		System.out.println("Breite: "+breite);
	}
}
