
public class Doppelschleife1 {

	public static void main(String[] args) {

		// äußere Schleife über "zeile"
		for (int zeile=1; zeile<=9; zeile++) {
			
			// innere Schleife über "spalte"
			for (int spalte=1; spalte<=10; spalte++)
				System.out.print  (zeile);
	
			System.out.println();
			
		}
	}

}
