/*
 * Klasse zur Herleitung des Polymorphismus (bei Methoden):
 * Es soll das Maximum von 2, 3 oder 4 Ganz- oder Fließkommazahlen 
 * ermittelt werden.
 * Anzahl u. Typ der Parameter werden im Methodennamen codiert:
 * "max3double()" besagt, 
 * es soll von 3 double-Zahlen das Maximum ermittelt werden.
 */

public class MaxOhnePoly {

	public static void main(String[] args) {
		max2int(3,5);
		max3int(3,5,2);
		max4int(3,5,2,7);

		max2double(3.0, 5.5);
		max3double(3.5, 5.7, 2);
		max4double(3.8, 5.3, 2.5, 7.7);
	}

	public static void max2int (int a, int b) {
		int maximum;
		
		if (a>=b)
			maximum = a;
		else
			maximum = b;
		
		System.out.println
		("Das Maximum der zwei int-Zahlen ist "+maximum);
	}
	
	public static void max3int (int a, int b, int c) {
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
	
	public static void max4int (int a, int b, int c, int d) {
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
	
	public static void max2double (double a, double b) {
		double maximum;
		
		if (a>=b)
			maximum = a;
		else
			maximum = b;
		
		System.out.println
		("Das Maximum der zwei double-Zahlen ist "+maximum);
	}
	
	public static void max3double (double a, double b, double c) {
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
	
	public static void max4double (double a, double b, double c, double d) {
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
