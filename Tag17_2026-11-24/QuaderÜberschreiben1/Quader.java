
public class Quader extends Rechteck {
	int hoehe=0;
	
		// Ausgabemethode der Subklasse
	public void schreibeQuader() {
//		System.out.println("Laenge: "+laenge);
//		System.out.println("Breite: "+breite);		
		schreibeRechteck();
		System.out.println("Hoehe:  "+hoehe);
	}
}
