/*
 * Weiteres Beispiel zum Einstieg in die OOP:
 * abhängige Klasse deklarieren,
 * in der Hauptklasse Objekt davon erzeugen,
 * Attribute belegen 
 * u. (vorerst) vom Hauptprogramm aus ausgeben
 */

public class KreisHaupt1 {

	public static void main(String[] args) {
			// Anlegen eines Kreises "k1"
		System.out.println("Kreis k1:");
		Kreis k1 = new Kreis();
		
			// Belegen der Attribute:
		k1.radius = 1.0;
		k1.istGefuellt = true;
		
			// Ausgabe der Attribute:
		System.out.println("Radius: "+k1.radius);
		System.out.println
		("Ist er gefüllt? "+k1.istGefuellt);
	}

}
