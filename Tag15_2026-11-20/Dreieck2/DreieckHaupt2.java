/*
 * Aulagerung der Ausgabe 
 * als Methode in die abhängige Klasse
 */

public class DreieckHaupt2 {

	public static void main(String[] args) {
		System.out.println("Dreieck d1:");
		Dreieck d1 = new Dreieck();
		
		d1.a=3;		d1.b=4;		d1.c=5;
		d1.istSchraffiert = true;
		
		d1.schreibeDreieck();
	}

}
