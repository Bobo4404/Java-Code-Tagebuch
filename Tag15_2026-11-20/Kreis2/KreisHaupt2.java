/*
 * Auch hier:
 * Auslagerung der Ausgabe der Werte der Attribute
 * in Methode der abhängigen Klasse
 */

public class KreisHaupt2 {

	public static void main(String[] args) {
		System.out.println("Kreis k1:");
		Kreis k1 = new Kreis();
		
		k1.radius = 1.0;
		k1.istGefuellt = true;
		
		k1.schreibeKreis();
	}

}
