
public class Dreieck {
	int a=0, b=0, c=0;
	boolean istSchraffiert=false;
	
	public void eigenschaften(String name) {
		p ("\nDreieck "+name+":  ");
		schreibeDreieck();
		pLn ("Ist es gültig?          "+istGueltig());
		
			// Prüfen auf weitere Eigenschaften nur für gültige D.
		if (istGueltig()) {
			pLn ("Ist es gleichseitig?    "+istGleichseitig());
			pLn ("Ist es gleichschenklig? "+istGleichschenklig());
			pLn ("Ist es rechtwinklig?    "+istRechtwinklig());
		}
	}
	
	public boolean istGueltig() {
		// Ein Dreieck ist gültig,
		// wenn die Summe von 2 Seiten größer als die dritte ist
		// für alle möglichen Kombinationen
		return a+b>c && a+c>b && b+c>a;
	}
	
	public boolean istGleichseitig() {
		return a==b && b==c;
	}
	
	public boolean istGleichschenklig() {
		return a==b || b==c || a==c;
	}
	
	public boolean istRechtwinklig() {
		int aq=a*a, bq=b*b, cq=c*c;
		
		return aq+bq==cq || aq+cq==bq || bq+cq==aq;
	}

	public void schreibeDreieck() {
		System.out.println(a+", "+b+", "+c);		
	}

		// Verkürzung für "System.out.print(...)";
		// "p" wie "print"
	public void p(String s) {	
		System.out.print  (s);
	}
	
		// Verkürzung für "System.out.println(...)";
		// "p" wie "print", "Ln" wie "line"
	public void pLn(String s) {	
		System.out.println  (s);
	}
}
