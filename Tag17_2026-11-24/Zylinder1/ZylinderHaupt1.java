/*
 * Beispiel für Vererbung von Methoden:
 * In Superklasse "Kreis" ist Methode "schreibeKreis()" implementiert.
 * In Subklasse sollen Attribute ausgegeben werden
 * in Methode "schreibeZylinder()".
 * Dabei beziehe ich mich auf die geerbte Methode,
 * in der schon die Ausgabe der Attribute
 * der Superklasse implementiert ist
 * u. ergänze nur die Ausgabe des hinzugekommenen Attributs.
 * Dadurch vermeide ich Quelltextduplizierung.
 */

public class ZylinderHaupt1 {

	public static void main(String[] args) {
		Zylinder z1 = new Zylinder();
		
		z1.radius = 1.0;
		z1.istGefuellt = true;
		z1.hoehe = 2.0;

		z1.schreibeZylinder();
	}

}
