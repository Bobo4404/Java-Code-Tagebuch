
public class Stack {
	public final int maxSize = 5;
	private char[] pali = new char[maxSize];
	private int size = 0;
	
		// angepasster push-Befehl:
		// pushen u. ausgeben
	public void pushCustom(char c) {
		push(c);
		System.out.print  (c);
	}
	
	public void push(char c) {
		if (isFull())
			System.out.println
			("> Fehler! \"push()\" auf vollem Stack!");
		else
			pali[size++] = c;
	}
	
		// angepasster pop-Befehl:
		// pop aufrufen u. Ergebnis ausgeben
	public void popCustom() {
		System.out.print  (pop());
	}
	
	public char pop() {
		char returnValue;
		
		if (isEmpty()) {
			System.out.println
			("> Fehler! \"pop()\" auf leerem Stapel!");
			returnValue = ' ';	// dummy
		} else
			returnValue = pali[--size];
		
		return returnValue;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == maxSize;
	}
}
