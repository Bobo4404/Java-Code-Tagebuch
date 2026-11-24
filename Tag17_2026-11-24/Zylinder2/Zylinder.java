
public class Zylinder extends Kreis {
	double hoehe = 0.0;
	
	public double berechneVolumenZylinder() {
		return berechneFlaecheKreis() * hoehe;
	}
	
	public void schreibeZylinder() {
		schreibeKreis();
		System.out.println("Hoehe:  "+hoehe);
	}
}
