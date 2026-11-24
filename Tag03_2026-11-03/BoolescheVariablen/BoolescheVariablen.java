
public class BoolescheVariablen {

	public static void main(String[] args) {
		boolean a=true, b=false;

		System.out.println ("Gegeben sind zwei boolesche Variablen:");
		System.out.println ("a mit "+a+", b mit "+b+".");

		System.out.println ("Die Negation von a ergibt "+!a+",");

		System.out.println ("die und-Verknüpfung von a u. b ergibt "+(a&&b)+",");
		System.out.println ("die oder-Verknüpfung "+(a||b)+".");
	}
}
