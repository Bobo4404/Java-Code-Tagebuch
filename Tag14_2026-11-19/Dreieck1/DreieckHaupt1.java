/*
 * Beipsiel zum Einstieg in die OOP:
 * Eine abhängige Klasse "Dreieck" ist definiert.
 * Ein Dreieck besteht aus drei Seiten a, b u. c,
 * die explizit mit 0 init werden,
 * obwohl sie eigentlich schon implizit init. wurden.
 * Ferner hat ein Dreieck auch ein boolesches Attribut,
 * hier nenne ich es "istSchraffiert".
 * Es wird explizit mit "flase" init.
 * Von dieser Klasse erzeugen wir ein Objekt "d1".
 * Wir belegen die Attribute mit irgendwelchen Werten.
 * Die Ausgabe erfolgt in dieser Version noch
 * aus dem Hauptprogramm heraus.
 */

// Hauptklasse mit Hauptmethode

public class DreieckHaupt1 {

	public static void main(String[] args) {
			// Erzeugen eines Dreieck d1:
		System.out.println("Dreieck \"d1\":");
		Dreieck d1 = new Dreieck();

			// Belegen der Attribute
		d1.a=3;		d1.b=4;		d1.c=5;
		d1.istSchraffiert = true;
		
			// Ausgabe der Atribute:
		System.out.println("a: "+d1.a);
		System.out.println("b: "+d1.b);
		System.out.println("c: "+d1.c);
		System.out.println
		("Ist es schraffiert? "+d1.istSchraffiert);
	}

}
