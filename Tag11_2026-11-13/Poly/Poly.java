/*
 * Empirische Herleitung gültiger Unterscheidungskriterien
 * für Parameterlisten bei Methoden
 * im Sinne des Polymorphismus:
 * Gültig sind:
 * 1. Länge der Parameterliste
 * 2. Typ des oder der Parameter
 * 3. Reihenfolge der Parameter
 * Ungültig sind:
 * 1. Rückgabewert
 * 2. Name des oder der Parameter
 * 3. Änderung des Zugriffsmodifizierers
 */

public class Poly {

	public static void main(String[] args) {
		m();
		m(17);
		m(true);
		m(1,false);
		m(true,2);
	}

	public static void m () {
		System.out.println
		("Hier Methode \"m()\" ohne Parameter.");
	}
	
//	public static int m () {
//		System.out.println
//		("Hier Methode \"m()\" mit verändertem Rückgabewert.");
//	}	
	
//	private static void m () {
//		System.out.println
//		("Hier Methode \"m()\" mit anderem Zugriffsmodifizierer.");
//	}
	
	public static void m (int i) {
		System.out.println
		("Hier \"m()\" mit einem int-Parameter.");
	}
	
//	public static void m (int j) {
//		System.out.println
//		("Hier \"m()\" mit einem int-Parameter,"
//				+ "aber einem anderen Namen.");
//	}
	
	public static void m (boolean b) {
		System.out.println
		("Hier \"m()\" mit einem bool-Parameter.");
	}
	
	public static void m (int i, boolean b) {
		System.out.println
		("Erst ein int-, dann ein bool-Parameter.");
	}
	
	public static void m (boolean b, int i) {
		System.out.println
		("Umgekehrt: Erst ein bool-, dann ein int-Parameter.");
	}
	

}
