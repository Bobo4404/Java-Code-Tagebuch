
public class Stack {
	public final int maxSize = 5;
	private int[] stack = new int[maxSize];
	private int size = 0;
	
	public void push(int ele) {
		if (isFull())	// Fehlerfall
			System.out.println
			("> Fehler! \"push()\" auf vollem Stapel!");
		else
		// getrennte Schreibweise:
//		stack[size] = ele;
//		size++;
		// zusammengefasst: Postfix:
			stack[size++] = ele;
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println
			("\n> Fehler! \"pop()\" auf leerem Stapel!");
			return 0; 	// dummy
		} else
		// getrennte Schreibweise:
//		size--;
//		return stack[size];
		// zusammengefasst: Präfix-Schreibweise:
			return stack[--size];
	}
	
	public void status () {
		printStack();
		System.out.println
		("Wie groß ist er aktuell? "+getSize());
		System.out.println
		("Wie groß ist er maximal? "+getMaxSize());
		System.out.println
		("Ist er leer? "+isEmpty());
		System.out.println
		("Ist er voll? "+isFull());	
		System.out.println();
	}
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == maxSize;
	}

	public void printStack() {
			// trennende Leerzeile davor
		System.out.println();
			// Inhalt abwärts
		schreibeInhalt();	
			// Bodenplatte:
		schreibeBodenplatte();
			// trennende Leerzeile danach
		System.out.println();
	}
	
	public void schreibeInhalt() {
		for (int i=size-1; i>=0; i--)
			System.out.println("\t"+stack[i]);		
	}
	
	public void schreibeBodenplatte() {
		int tabweite = 8;
		for (int i=1; i<=(2*tabweite + 1); i++)
			System.out.print  ("-");
		System.out.println();		
	}
}
