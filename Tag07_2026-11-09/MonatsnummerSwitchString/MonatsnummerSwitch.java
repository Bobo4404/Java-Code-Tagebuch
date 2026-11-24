/*
 * Beispiel für einen Switch,
 * bei dem die vielen Ausgabeanweisungen
 * reduziert werden auf nur eine am Schluß,
 * indem ein String zusammengesetzt 
 * u. in nur einer Ausgabeanweisung
 * am Schluß ausgegeben wird.
 */

public class MonatsnummerSwitch {

	public static void main(String[] args) {
		int monatsnummer = 13;
		
		String s = "Der Monat mit der Nummer "+monatsnummer+": ";
			
		switch (monatsnummer) {
			case 1:  s = s + "Januar";		break;
			case 2:  s = s + "Februar";		break;
			case 3:  s = s + "März";			break;
			case 4:  s = s + "April";		break;
			case 5:  s = s + "Mai";			break;
			case 6:  s = s + "Juni";			break;
			case 7:  s = s + "Juli";			break;
			case 8:  s = s + "August";		break;
			case 9:  s = s + "September";	break;
			case 10: s = s + "Oktober";		break;
			case 11: s = s + "November";		break;
			case 12: s = s + "Dezember";		break;
			default: s = s + "ist kein gültiger Monat!";
		}
		
		System.out.println(s);
	}

}
