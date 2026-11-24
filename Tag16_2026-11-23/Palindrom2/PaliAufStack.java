/*
 * Zweite Version mit angepassten push- u. pop-Befehlen
 */

public class PaliAufStack {

	public static void main(String[] args) {
		Stack pali = new Stack();
		
		System.out.print  ("Das Wort\n\"");
		
			// Stapel aufbauen
		pali.pushCustom('r');
		pali.pushCustom('e');
		pali.pushCustom('g');
		pali.pushCustom('a');
		pali.pushCustom('l');
		
		System.out.print  
		("\"\ngespiegelt ergibt:\n\"");
		
			// Stapel abbauen u. dabei spiegeln
		for (int i=1; i<=pali.maxSize; i++)	// i:1..maxSize
			pali.popCustom();
		
		System.out.println("\"");
	}

}
