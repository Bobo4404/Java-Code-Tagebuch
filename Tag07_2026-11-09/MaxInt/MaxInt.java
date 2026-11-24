/*
 * Programm zur empirischen Ermittlung
 * der größten im int-Bereich darstellbaren Zahl:
 * "MAX_INT":
 * Wir deklarieren i außerhalb der Schleife,
 * damit der Wert nach Verlassen der Schleife
 * erhlaten bleibt.
 * Wir laufen in einer theoretischen Endlosschleife
 * bei 0 beginnend in den negativen Bereich
 * bei der Bedingung: i <= 0.
 * Der gesamte negative Bereich wird durchlaufen bis MIN_INT.
 * Wird von der kleinesten negativen Zahl noch 1 abgezogen,
 * landen wir bei "MAX_INT", 
 * der größten darstellbaren Zahl.
 * Für diese trifft die Bedingung: i<=0 nicht mehr zu.
 * Die Schleife terminiert.
 * Danach wird die Zahl ausgegeben.
 */

public class MaxInt {

	public static void main(String[] args) {
		int i;
		
		for (   i=0; i<=0; i--)	//i:0..-unendlich
			;

		System.out.println("MaxInt: "+i);
	}

}
