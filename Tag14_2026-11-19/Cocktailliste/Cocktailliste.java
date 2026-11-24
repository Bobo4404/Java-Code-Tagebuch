/*
 * Beispiel für ein Feld auf Strings
 */

public class Cocktailliste {

	public static void main(String[] args) {
		final int anzahlCocktails = 10;
		// ***********************
		String[] liste = new String[anzahlCocktails + 1];

		belegeListe(liste);
		ausgabeListe(liste);
	}

	public static void belegeListe(String[] liste) {
		liste[1] = "Zombie";
		liste[2] = "Mai Tai";
		liste[3] = "Pina Colada";
		liste[4] = "Sex on the beach";
		liste[5] = "Swimmingpool";
		liste[6] = "Screwdriver";
		liste[7] = "Orgasmus";
		liste[8] = "Touch down";
		liste[9] = "Mojito";
		liste[10] = "Bloody Mary";
	}
	
	public static void ausgabeListe(String[] liste) {
		System.out.println("Unsere Cocktailkarte:\n");
		
		for (int i=1; i<liste.length; i++)	// i:1..<listenlänge
			System.out.println(i+". "+liste[i]);
	}
}
