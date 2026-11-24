/*
 * Herleitung von Feldern
 * über steigenden Aufwand bei Übergabe einzelner Parameter:
 * Verhältnis: Anzahl Parameter zu Anzahl zu prüfender Vergleiche.
 * Anzahl Vergleiche für n Paramter = (n-1)²
 * damit quadratischer Anstieg des Aufwandes 
 * im Verhältnis zu den Eingangsparametern
 * 
 * Allgemeine Zusammenstellung der störenden Faktoren
 * bei steigender Anzahl von Paramtern,
 * z.B. 10, 20 oder gar 100:
 * 1. Parameter müssen einzeln übergeben werden
 * 2. Wir müssen einzeln Namen vergeben
 * 3. Alle Parmeter "einzeln in die Hand genommen werden müssen"
 */

public class MaxVielePar {

	public static void main(String[] args) {
		System.out.println(max (3,5));
		System.out.println(max (3,5,2));

	}

		// n=2 Parameter: 1 Fall mit 1 Vergleich
	public static int max(int a, int b) {
		int maxRück;
		
		if (a>=b)
			maxRück = a;
		else 
			maxRück = b;
		
		return maxRück;
	}
	
		// n=3 Parameter: 2 Fälle mit je 2 Vergleichen: 4 Vergleiche 
	public static int max(int a, int b, int c) {
		int maxRück;
		
		if (a>=b && a>=c)
			maxRück = a;
		else if (b>=a && b>=c)
			maxRück = b;
		else
			maxRück = c;
		
		return maxRück;
	}
	
		// 4 Parameter: 3 Fälle mit je 3 Vergleichen: 9 Vergleiche
	public static int max(int a, int b, int c, int d) {
		int maxRück;
		
		if (a>=b && a>=c && a>=d)
			maxRück = a;
		else if (b>=a && b>=c && b>=d)
			maxRück = b;
		else if (c>=a && c>=b && c>=d)
			maxRück = c;
		else
			maxRück = d;
		
		return maxRück;
	}
}
