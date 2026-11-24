/*
 * Beispiel zur Weiterverwendungen von Methoden zur Berechnung:
 * Stellt die Superklasse Methoden mit Berechnungen bereit,
 * die in der Subklasse als Zwischenberechnungen
 * verwendet werden können,
 * kann auch so Quelltextduplizierung vermieden
 * u. die Berechnung übersichtlicher gestalten werden.
 * Beispiel hier:
 * Berechnung des Volumens eines Quaders in der Subklasse
 * bei vorhandener Berechnung der Fläche des Rechtecks
 * in der Subklasse:
 * Volumen Quader = Fläche Rechteck Mal Höhe
 */

public class QuaderHaupt3 {
	
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
		
			// Berechnung
		System.out.println
		("\nSein Volumen beträgt: "+q1.berechneVolumenQuader());
	}
}
