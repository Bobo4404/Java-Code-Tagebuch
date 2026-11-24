/*
 * Erstes Beispiel für einseitig bedingte Anweisungen:
 * Laufzeitfehler durch Division durch Null
 * wird verhindert.
 */

public class DivisionDurchNullIf {

	public static void main(String[] args) {
		int divident=12, divisor=0;
		
		// erste einseitg bedingte Anweisung
		if (divisor == 0)
			System.out.println
			("> Fehler! Division durch Null!");
		
		// zweite einseitig bed. Anw.
		// Führe nur dann Division aus,
		// wenn die Zahl, durch die dividiert wird,
		// ungleich Null ist
		if (divisor != 0)
			System.out.println(divident/divisor);
	}
}
