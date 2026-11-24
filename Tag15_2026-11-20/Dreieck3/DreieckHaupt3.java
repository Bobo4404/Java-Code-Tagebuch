/*
 * Beispiel für Methoden, 
 * die Berechnungen anstellen
 * hier: Geometrieeigenschaften von Dreiecken.
 * Für Methodennamen "System.out.print(...);
 * wurde ein Synonym definiert: "p()",
 * für die Version mit Zeilenumbruch:
 * "System.out.println()": "pLn()"
 * Das Prüfen der Eigenschaften wird zusammengefasst
 * in Methode "eigenschaften()".
 * Der auszugebende Namen des Dreiecks
 * wird als String übergeben.
 */

public class DreieckHaupt3 {

	public static void main(String[] args) {
	// d1: 3,4,5
		Dreieck d1 = new Dreieck();
		d1.a=3;		d1.b=4;		d1.c=5;
		d1.istSchraffiert = true;
		d1.eigenschaften("d1");

	// d2: 3,3,3	
		Dreieck d2 = new Dreieck();
		d2.a=3;		d2.b=3;		d2.c=3;
		d2.istSchraffiert = true;
		d2.eigenschaften("d2");
		
	// d3: 3,3,5
		Dreieck d3 = new Dreieck();
		d3.a=3;		d3.b=3;		d3.c=5;
		d3.istSchraffiert = true;
		d3.eigenschaften("d3");
		
	// d4: 1,2,10
		Dreieck d4 = new Dreieck();
		d4.a=1;		d4.b=2;		d4.c=10;
		d4.istSchraffiert = true;
		d4.eigenschaften("d4");		
	}

}
