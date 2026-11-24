/*
 * Beispiel für die Verschachtelung von Methoden
 * Der Baum beginnt mit der Main-Methode als Wurzel auf Ebene 0.
 * Auf Ebene 1 befinden sich m1() u. m2().
 * Ebenenzugehörigkeit wird durch Einrückung um einen Tab gekennzeichnet.
 * Ein Ebene darunter, auf Ebene 2, befinden sich m1a() u. m1b(),
 * durch zwei Tabs eingerückt.
 * Prinipiell kann beliebig tief geschachtelt werden,
 * so wie es der Umfang des Quelltextes erfordert.
 */

public class Schachtel1 {

	public static void main(String[] args) {
		System.out.println("Hauptprogramm beginnt");
		m1();
		System.out.println("Hauptprogramm geht weiter");
		m2();
		System.out.println("Hauptprogramm endet");
	}

	public static void m1() {
		System.out.println("\tm1() beginnt");
		m1a();
		System.out.println("\tm1() geht weiter");
		m1b();
		System.out.println("\tm1() endet");		
	}
	
	public static void m1a() {
		System.out.println("\t\tm1a() hier");
	}
	
	public static void m1b() {
		System.out.println("\t\tm1b() hier");
	}
	
	public static void m2() {
		System.out.println("\tm2() hier");
	}
}
