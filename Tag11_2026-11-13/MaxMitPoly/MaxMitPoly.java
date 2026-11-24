/*
 * Klasse zur Herleitung des Polymorphismus (bei Methoden):
 * Alle Methoden werden gleich genannt.
 * Sie unterscheiden sich in den Parameterlisten.
 * Der Compiler sucht zur Laufzeit die richtige heraus,
 * so dass nicht nur der Name-,
 * sondern auch die Parameterliste stimmt.
 * Vorteile:
 * 1. Kein Aufwand zur Codierung von Parametertyp- u. Anzahl
 * 2. Kein Aufwand zur Zuordnung
 * 3. Dadurch auch keine Fehlerquelle für ein falsche Zuordnung
 */

public class MaxMitPoly {

	public static void main(String[] args) {
		max(3,5);
		max(3,5,2);
		max(3,5,2,7);

		max(3.0, 5.5);
		max(3.5, 5.7, 2.0);
		max(3.8, 5.3, 2.5, 7.7);
	}

	public static void max (int a, int b) {
		int maximum;
		
		if (a>=b)
			maximum = a;
		else
			maximum = b;
		
		System.out.println
		("Das Maximum der zwei int-Zahlen ist "+maximum);
	}
	
	public static void max (int a, int b, int c) {
		int maximum;
		
		if (a>=b && a>=c)
			maximum = a;
		else if (b>=a && b>=c)
			maximum = b;
		else
			maximum = c;
		
		System.out.println
		("Das Maximum der drei int-Zahlen ist "+maximum);
	}
	
	public static void max (int a, int b, int c, int d) {
		int maximum;
		
		if (a>=b && a>=c && a>=d)
			maximum = a;
		else if (b>=a && b>=c && b>=d)
			maximum = b;
		else if (c>=a && c>=b && c>=d)
			maximum = c;
		else
			maximum = d;
		
		System.out.println
		("Das Maximum der vier int-Zahlen ist "+maximum);
	}
	
	public static void max (double a, double b) {
		double maximum;
		
		if (a>=b)
			maximum = a;
		else
			maximum = b;
		
		System.out.println
		("Das Maximum der zwei double-Zahlen ist "+maximum);
	}
	
	public static void max (double a, double b, double c) {
		double maximum;
		
		if (a>=b && a>=c)
			maximum = a;
		else if (b>=a && b>=c)
			maximum = b;
		else
			maximum = c;
		
		System.out.println
		("Das Maximum der drei double-Zahlen ist "+maximum);
	}
	
	public static void max (double a, double b, double c, double d) {
		double maximum;
		
		if (a>=b && a>=c && a>=d)
			maximum = a;
		else if (b>=a && b>=c && b>=d)
			maximum = b;
		else if (c>=a && c>=b && c>=d)
			maximum = c;
		else
			maximum = d;
		
		System.out.println
		("Das Maximum der vier double-Zahlen ist "+maximum);
	}
}
