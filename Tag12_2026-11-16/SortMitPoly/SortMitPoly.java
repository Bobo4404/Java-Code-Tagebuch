/*
 * Beispiel zum Polymorphismus:
 * Mit Poly: Alle Methoden heißen gleich
 * Kein Aufwand mehr für unterschiedliche Namensvergabe,
 * auch nicht für Zuordnung,
 * ebensowenig Gefahrenquelle der falschen Zuordnung
 */

public class SortMitPoly {

	public static void main(String[] args) {
		sort(3, 5);
		sort(3, 5, 2);
		sort(3, 5, 2, 7);
		
		sort(3.4, 5.2);
		sort(3.8, 5.7, 2.4);
		sort(3.2, 5.5, 2.6, 7.0);
	}

	public static void sort (int a, int b) {
		System.out.println
		("Sind die zwei int-Zahlen sortiert? "+(a<=b));
	}
	
	public static void sort (int a, int b, int c) {
		System.out.println
		("Sind die drei int-Zahlen sortiert? "
		+(a<=b && b<=c));
	}
	
	public static void sort (int a, int b, int c, int d) {
		System.out.println
		("Sind die vier int-Zahlen sortiert? "
				+(a<=b && b<=c && c<=d));
	}
	
	
	public static void sort (double a, double b) {
		System.out.println
		("Sind die zwei double-Zahlen sortiert? "+(a<=b));
	}
	
	public static void sort (double a, double b, double c) {
		System.out.println
		("Sind die drei double-Zahlen sortiert? "
				+(a<=b && b<=c));
	}
	
	public static void sort (double a, double b, double c, double d) {
		System.out.println
		("Sind die vier double-Zahlen sortiert? "
				+(a<=b && b<=c && c<=d));
	}
}
