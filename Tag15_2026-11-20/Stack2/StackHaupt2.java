/*
 * Lösungen konkreter Problemstellungen 
 * - prozedural und objektorientiert implementiert:
 * Projekt "Stack"
 * unter Verwendung aller eingeführter Techniken:
 * Ein Stack wird auf einem Feld implementiert.
 * Dem Benutzer wird ein Satz von Methoden
 * zur Verfügung gestellt,
 * um damit arbeiten zu können.
 * Automatisiertes Auf- u. Abbauen
 * mit Provokation eines Over- u. Underflows
 */

public class StackHaupt2 {

	public static void main(String[] args) {
		System.out.println("Stack s1:");
		Stack s1 = new Stack();
		s1.status();

			// automatisiertes Aufbauen
			// mit Provokation eines overflow:
		for (int i=1; i<=s1.getMaxSize() + 1; i++) {
			System.out.println("Jetzt pushe ich "+i+":");
			s1.push(i);
			s1.status();
		}
		
		System.out.println("****************\n");
		
			// automatisiertes Abbauen
			// mit Provokation eines underflows:
		for (int i=1; i<=s1.getMaxSize() + 1; i++) {
			System.out.print
			("Jetzt rufe ich \"pop()\" auf: ");
			System.out.println(s1.pop());
			s1.status();
		}
	}
}
