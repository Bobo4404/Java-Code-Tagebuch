/*
 * Gesucht sind die Vielfachen einer Zahl,
 * die kleiner sind als eine Obergrenze
 * 
 * Wir verwenden eine while- u. keine for-Schleife,
 * weil -ohne zu rechnen- nicht klar ist,
 * wie viele Vielfache es gibt.
 */

public class VielfacheWhile {

	public static void main(String[] args) {
		int zahl = 798, obergrenze = 100000;
		// **********************************
		int vielfaches = zahl;
		
		System.out.println("Die Vielfachen der Zahl "+zahl+",");
		System.out.println("die kleiner sind als "+obergrenze+":\n");

		while (vielfaches < obergrenze) {
			System.out.println(vielfaches);
			// vielfaches = vielfaches + zahl;
			vielfaches += zahl;
		}
	}

}
