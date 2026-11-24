/*
 * Beispiel für eine Stapel,
 * dieses Mal zur Abwechslung auf Buchstaben:
 * Die Buchstaben eines Palindroms werden "gepusht".
 * Danach werden sie in gespiegelter Reihenfolge
 * durch mehrfaches Aufrufen von "pop()" ausgegben.
 * Noch störend:
 * Beim Aufbauen des Stapels sind jeweils zwei Befehle 
 * pro Buchstaben notwendig:
 * Einmal zum "pushen", einmal zum Ausgaben.
 * Verbesserung in Folgeversion,
 * wo "push()" u. "pop()" "customized" werden,
 * zu Deutsch: angepasst,
 * indem eine Methode mit erweitertere Funktionalität
 * "darübergestülpt" wird 
 */

public class PaliAufStack {

	public static void main(String[] args) {
		Stack pali = new Stack();
		
		System.out.print  ("Das Wort\n\"");
		
			// Stapel aufbauen
		pali.push ('r');
		System.out.print  ('r');	
		pali.push ('e');
		System.out.print  ('e');		
		pali.push ('g');
		System.out.print  ('g');		
		pali.push ('a');
		System.out.print  ('a');		
		pali.push ('l');
		System.out.print  ('l');
		
		System.out.print  
		("\"\ngespiegelt ergibt:\n\"");
		
			// Stapel abbauen u. dabei spiegeln
		for (int i=1; i<=pali.maxSize; i++)	// i:1..maxSize
			System.out.print  (pali.pop());
		
		System.out.println("\"");
	}

}
