package streamsFiles;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSupport {

	public static void main(String[] args) {
		
		String s1 = "apple, apple and orange please";
		String s2 = s1.replaceAll("ple\\b", "ricot"); // Ersetzt Teile des Strings
		String s4 = s1.replaceFirst("ple\\b", "petite");
		String[] s3 = s1.split("\\b"); // Spaltet den String nach den Angaben auf.
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
//		for(String s: s3) {
//			if(s.matches("\\w+")) { // Prüft, ob mehr als ein Zeichen im String enthalten ist.
//				System.out.println(s);
//			}
//		}
		
		// Durch Pattern und Matchers werden die Daten nur ein Mal kompiliert -> weniger Aufwand
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(s1);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
