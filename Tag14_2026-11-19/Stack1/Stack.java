
public class Stack {
		// Maximale Größe des Stapels:
	public final int maxSize = 5;
		// Datenstruktur für Benutzer verborgen
	private int[] stack = new int[maxSize]; 
		// Hilfsvariable für aktuelle Größe
	private int size = 0;
	
	public int getSize() {
		return size;
	}
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == maxSize;
	}
}
