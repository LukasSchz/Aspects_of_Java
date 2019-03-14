package string.power;

import java.io.IOException;
import java.util.StringJoiner;


public class StringJoinerDemo {

	public static void main(String[] args) {
		
		// StringJoiner hat mehr Power
		// Es vereinfacht das Handling bei zusammengesetzten Strings
		// Beim Erzeugen des StringJoiner muss das Trennmittel festgelegt werden
		// Start- und Endpunkte k�nnen auch in den Konstruktor eingef�gt werden, ist aber optional
		StringJoiner stringjoin = new StringJoiner("], [", "[", "]");
		
		stringjoin.setEmptyValue("EMPTY");
//		stringjoin.add("Alpha");
//		stringjoin.add("Beta");
//		stringjoin.add("Gamma");
		
		// Elemente die hinzugef�gt werden sollen, k�nnen auch verkettet werden.
		stringjoin.add("Alpha").add("Beta").add("Gamma");
		
		System.out.println(stringjoin.toString());
		
		// String formatieren:
		// Hierbei m�ssen Platzhalter eingef�gt werden im String.
		// Es gibt unterschiedliche Platzhalter:
		// %d f�r einfache int-Variablen
		// %.1f f�r float-Variablen, wobei der float-Wert nur auf eine Nachkommastelle gerundet wird.
		float gorden = 2.48232f, ramsey = 12f;
		String age = String.format("Gorden ist: %.1f und Ramsey ist: %.1f Jahre alt.", gorden, ramsey);
		
		System.out.println(age);
		
		// Formatierten Inhalt in Streams einf�gen.
		try{
			FormattetCon.doWrite(2, 15, 17);
		} catch(IOException e) {
			e.getMessage();
		}
	}
}
