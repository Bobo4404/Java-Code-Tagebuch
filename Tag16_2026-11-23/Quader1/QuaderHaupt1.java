/*
 * Erstes Beispiel zur Vererbung:
 * Bekannte Klasse "Rechteck" dient als Superklasse.
 * Sie wird von der Subklasse "Quader" erweiter
 * um das zusätzliche Attribut "hoehe".
 * Im Hauptprogramm wird ein Objekt der Subklasse erzeugt,
 * mit Werten belegt u. ausgegeben.
 */

public class QuaderHaupt1 {
	
	public static void main (String[] args) {
			// Erzeugen eines Objektes der Subklasse:
		Quader q1 = new Quader();
		
			// Belegen aller Attribute,
			// der geerbten wie des neu hinzugekommenen:
		q1.laenge = 3;
		q1.breite = 4;
		q1.hoehe  = 5;
	
			// Ausgabe
		System.out.println("Laenge: "+q1.laenge);
		System.out.println("Breite: "+q1.breite);
		System.out.println("Hoehe:  "+q1.hoehe);
	}
}
