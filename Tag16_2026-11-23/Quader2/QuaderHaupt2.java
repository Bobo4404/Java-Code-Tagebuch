/*
 * Beispiel zur Vererbung von Methoden
 * u. zum coderecycling:
 * Neben Attributen werden auch Methoden vererbt
 * In Subklasse "Quader" ist geerbte Methode
 * "schreibeRechteck()" der Superklasse "Rechteck" verfügar.
 * Sie dort in der Methode "schreibeQuader()" aufzurufen
 * verhindet Quelltextduplizierung,
 * die erneute Definition der Ausgabe 
 * von "laenge" u. "breite": code recycling!
 */

public class QuaderHaupt2 {
	
	public static void main (String[] args) {
			// Erzeugen eines Objektes der Subklasse:
		Quader q1 = new Quader();
		
			// Belegen aller Attribute,
			// der geerbten wie des neu hinzugekommenen:
		q1.laenge = 3;
		q1.breite = 4;
		q1.hoehe  = 5;
	
			// Ausgabe
		q1.schreibeQuader();
	}
}
