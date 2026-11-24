/*
 * Wiederverwendung einer Berechnung aus der Superklasse
 * in einer Methode der Subklasse:
 * "berechneVolumenZylinder()" bezieht sich auf
 * "berechneFlaecheKreis().
 */

public class ZylinderHaupt2 {

	public static void main(String[] args) {
		Zylinder z1 = new Zylinder ();
		
		z1.radius = 1.0;
		z1.istGefuellt = true;
		z1.hoehe = 2.0;
		
		z1.schreibeZylinder();
		
		System.out.println
		("\nSein Volumen beträgt: "+z1.berechneVolumenZylinder());
	}

}
