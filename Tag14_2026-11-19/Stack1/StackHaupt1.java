
/*
 * Übergreifendes Projekt,
 * das alle Aspekte der bisher eingeführten Techniken beinhaltet:
 * Ein Stack oder Stapel mit den zentralen Befehlen:
 * push() u. pop(),
 * implementiert auf einem Feld.
 * Unterscheidung, was für Benutzer zugreifbar ist u. was nicht.
 * Hilfmethoden erlauben Benutzer Abfrage des Status,
 * wie ob er voll oder leer ist,
 * was seine maximale oder aktuelle Größe ist.
 */

public class StackHaupt1 {

	public static void main(String[] args) {
		System.out.println
		("Ich erzeuge einen Stapels \"s1\":");
		Stack s1 = new Stack();
		
		System.out.println
		("Ist der Stapel leer? "+s1.isEmpty());
		
		System.out.println
		("Ist der Stapel leer? "+s1.isFull());

		System.out.println
		("Wie groß ist er aktuell? "+s1.getSize());
		
		System.out.println
		("Wie groß ist er maximal? "+s1.getMaxSize());
	}

}
