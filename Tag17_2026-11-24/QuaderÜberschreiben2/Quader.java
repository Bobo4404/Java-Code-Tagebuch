
public class Quader extends Rechteck {
	int hoehe=0;
	
		// Ausgabemethode der Subklasse
		// überschreibt gleichnamige geerbte
	public void schreibe() {
//		System.out.println("Laenge: "+laenge);
//		System.out.println("Breite: "+breite);	
			// Bezug auf überschriebene Methode der Superklasse
		super.schreibe();
		System.out.println("Hoehe:  "+hoehe);
	}
}
