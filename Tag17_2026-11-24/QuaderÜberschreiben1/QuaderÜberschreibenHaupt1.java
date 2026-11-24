
public class QuaderÜberschreibenHaupt1 {

	public static void main(String[] args) {
		System.out.println("Objekt der Superklasse:");
		System.out.println("Rechteck \"r1\":");
		Rechteck r1 = new Rechteck();
		r1.laenge = 3;		r1.breite = 5;
		r1.schreibeRechteck();
//		r1.schreibeQuader();
		
		System.out.println("\nObjekt der Subklasse:");
		System.out.println("Quader \"q1\":");
		Quader q1 = new Quader();
		q1.laenge=1;	q1.breite=2; 	q1.hoehe=3;
		q1.schreibeQuader();
//		q1.schreibeRechteck();
	}

}
