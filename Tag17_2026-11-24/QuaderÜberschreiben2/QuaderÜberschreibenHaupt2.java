/*
 * Beispiel zum Überschreiben (overwrite) von Methoden:
 * Kontext: in Superklasse ist eine Methode definiert
 * In Subklasse wird eine gleichen Namens
 * <und> gleicher Parameterliste definiert.
 * Die Methode der Subklasse <überschreibt>
 * die geerbte aus der Superklasse.
 * Zur Laufzeit sucht sich der Compiler
 * die richtige heraus
 * 
 * In Subklasse Bezug auf geerbte, überschriebene Methode
 * mit "super.*",
 * hier: super.schreibe();
 */

public class QuaderÜberschreibenHaupt2 {

	public static void main(String[] args) {
		System.out.println("Objekt der Superklasse:");
		System.out.println("Rechteck \"r1\":");
		Rechteck r1 = new Rechteck();
		r1.laenge = 3;		r1.breite = 5;
		r1.schreibe();
//		r1.schreibeQuader();
		
		System.out.println("\nObjekt der Subklasse:");
		System.out.println("Quader \"q1\":");
		Quader q1 = new Quader();
		q1.laenge=1;		q1.breite=2; 	q1.hoehe=3;
		q1.schreibe();
//		q1.schreibeRechteck();
	}

}
