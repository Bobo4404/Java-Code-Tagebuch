/*
 * Beispiel für die die Infix-Notation,
 * angewendet auf Strings,
 * wo "+=" die Konatenation bewirkt,
 * also das Anhängen eines Strings an einen schon vorhandenen
 * Somit wird nur eine Ausgabeanweisung am Ende benötigt
 */

public class ZahlAlsWortInfix {

	public static void main(String[] args) {
		int zahl = 3;
		
		String s ="Programm schreibt die Zahlen\n";
		s += "von 1 bis 5 in Buchstaben!\n";	// Infix-Notation
		s += zahl+": ";
		
		switch(zahl) { 
			case 1: s += "eins";	break;
			case 2: s += "zwei";	break;
			case 3: s += "drei";	break;
			case 4: s += "vier";	break;
			case 5: s += "fünf";	break;
			default:s += "liegt außerhalb des Bereiches!";
		}
		
		System.out.println(s);
	}
}
