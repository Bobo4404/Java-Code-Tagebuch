/*
 * Beispiel für zweiseitig bedingte Anweisung,
 * hergeleitet aus zwei einseitigen
 * Vorteile:
 * 1. kürzerer Quelltext
 * 2. schneller, da nur eine Bedingung
 * 3. übersichtlicher:
 * Auf Anhieb steht fest,
 * dass genau nur eine der beiden Blöcke
 * ausgeführt wird.
 */

public class DivisionDurchNullElse {

	public static void main(String[] args) {
		int divident=12, divisor=3;
		
		// zweiseitig bedingte Anweisung
		if (divisor == 0)
			System.out.println
			("> Fehler! Division durch Null!");		
		else // if (divisor != 0)
			System.out.println(divident/divisor);
	}
}
