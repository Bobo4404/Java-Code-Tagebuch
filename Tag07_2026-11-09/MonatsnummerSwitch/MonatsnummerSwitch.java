/*
 * Beispiel für einen Switch,
 * hervorgeganben aus einer Kaskade
 * Vorteile: 
 * 1. kürzer im Quelltext,
 * da Variablenname, über den geswitcht wird,
 * nur einmal erwähnt werden muss
 * 2. übersichtlicher,
 * da Ausprägungen des Selektors
 * vorne in der Zeile extrahier stehen
 * u. nicht -wie bei der Kaskade-
 * in der Bedingung "versteckt".
 */

public class MonatsnummerSwitch {

	public static void main(String[] args) {
		int monatsnummer = 11;
		
		System.out.print 
		("Der Monat mit der Nummer "+monatsnummer+": ");
			
		switch (monatsnummer) {
			case 1:  System.out.println("Januar");		break;
			case 2:  System.out.println("Februar");		break;
			case 3:  System.out.println("März");			break;
			case 4:  System.out.println("April");		break;
			case 5:  System.out.println("Mai");			break;
			case 6:  System.out.println("Juni");			break;
			case 7:  System.out.println("Juli");			break;
			case 8:  System.out.println("August");		break;
			case 9:  System.out.println("September");	break;
			case 10: System.out.println("Oktober");		break;
			case 11: System.out.println("November");		break;
			case 12: System.out.println("Dezember");		break;
			default: System.out.println("ist kein gültiger Monat!");
		}
	}
	
//		if (monatsnummer == 1)
//			System.out.println("Januar");
//		else if (monatsnummer == 2)
//			System.out.println("Februar");
//		else if (monatsnummer == 3)
//			System.out.println("März");
//		else if (monatsnummer == 4)
//			System.out.println("April");
//		else if (monatsnummer == 5)
//			System.out.println("Mai");
//		else if (monatsnummer == 6)
//			System.out.println("Juni");
//		else if (monatsnummer == 7)
//			System.out.println("Juli");
//		else if (monatsnummer == 8)
//			System.out.println("August");
//		else if (monatsnummer == 9)
//			System.out.println("September");
//		else if (monatsnummer == 10)
//			System.out.println("Oktober");
//		else if (monatsnummer == 11)
//			System.out.println("November");
//		else if (monatsnummer == 12)
//			System.out.println("Dezember");
//		else 
//			System.out.println("ist kein gültiger Monat!");

}
