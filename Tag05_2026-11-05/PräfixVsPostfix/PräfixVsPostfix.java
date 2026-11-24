/*
 * Vergleich: Prä- u. Postfix-Notation
 * Präfix:  ++i, --i	
 * Postfix: i++, i--
 * Unterschiedliche Semantik nur dann,
 * wenn Notation innerhalb einer Berechnung angewendet wird
 * Bei Präfix-Notation wird <zuerst> die Variable hoch- oder heruntergezählt.
 * Danach mit dem veränderten Wert gerechnet.
 * Bei Postfix-Notation wird die Veränderung an der Variablen erst <nach>
 * der Berechnung vorgenommen.
 */

public class PräfixVsPostfix {

	public static void main(String[] args) {
		int a, b;
		
		// Präfix-Notation
		a=5;
		b = ++a * 2;	// erst hochzählen, dann mult: b=12: (a+1) * 2
		System.out.println("Präfix:  b: "+b);

		// Postfix-Notation
		a=5;
		b = a++ * 2;	// erst mult., dann hochzähle: b=11: (a*2)
		System.out.println("Postfix: b: "+b);
	}

}
