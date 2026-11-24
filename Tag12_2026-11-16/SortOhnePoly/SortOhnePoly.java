/*
 * Beispiel zum Polymorphismus:
 * Ohne Poly: Methoden heißen unterschiedlich
 * Aufwand für unterschiedliche Namensvergabe,
 * Weiterer Aufwand für Zuordnung,
 * dabei auch Gefahrenquelle der falschen Zuordnung
 */

public class SortOhnePoly {

	public static void main(String[] args) {
		sort2int(3, 5);
		sort3int(3, 5, 2);
		sort4int(3, 5, 2, 7);
		
		sort2double(3.4, 5.2);
		sort3double(3.8, 5.7, 2.4);
		sort4double(3.2, 5.5, 2.6, 7.0);
	}

	public static void sort2int (int a, int b) {
		System.out.println
		("Sind die zwei int-Zahlen sortiert? "+(a<=b));
	}
	
	public static void sort3int (int a, int b, int c) {
		System.out.println
		("Sind die drei int-Zahlen sortiert? "
		+(a<=b && b<=c));
	}
	
	public static void sort4int (int a, int b, int c, int d) {
		System.out.println
		("Sind die vier int-Zahlen sortiert? "
				+(a<=b && b<=c && c<=d));
	}
	
	
	public static void sort2double (double a, double b) {
		System.out.println
		("Sind die zwei double-Zahlen sortiert? "+(a<=b));
	}
	
	public static void sort3double (double a, double b, double c) {
		System.out.println
		("Sind die drei double-Zahlen sortiert? "
				+(a<=b && b<=c));
	}
	
	public static void sort4double (double a, double b, double c, double d) {
		System.out.println
		("Sind die vier double-Zahlen sortiert? "
				+(a<=b && b<=c && c<=d));
	}
}
