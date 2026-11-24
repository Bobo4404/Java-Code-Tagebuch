/*
 * Gewünschte Ausgabe:
 * "Das Konto ist mit ...€ im Habe"
 * 		"				   ausgeglichen"
 * 		"				   im Soll"
 * 
 * Beispiel für eine Kaskade,
 * eine geschachtelte if-else-Anweisung
 * Die letzte Bedingung muss nicht geprüft werden,
 * weil es nur die drei Fälle gibt: größer, gleich oder kleiner.
 * Wenn die ersten beiden Fälle nicht zutreffen,
 * bleibt nur noch der dritte übrig
 */

public class Kontostand {

	public static void main(String[] args) {
		int kontostand = -100;

		System.out.print  ("Das Konto ist mit "+kontostand+"€ ");
		
		if (kontostand>0)
			System.out.println("im Haben");
		else if (kontostand==0)
			System.out.println("ausgeglichen");
		else //if (kontostand<0)
			System.out.println("im Soll");
	}

}
