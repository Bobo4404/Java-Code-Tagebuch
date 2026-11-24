
public class Kreis {
	double radius = 0.0;
	boolean istGefuellt = false;
	
	public double berechneFlaecheKreis() {
		return 3.14 * radius * radius;
	}
	
	public void schreibeKreis() {
		System.out.println("Radius: "+radius);
		System.out.println
		("Ist er gefuellt? "+istGefuellt);		
	}
}
