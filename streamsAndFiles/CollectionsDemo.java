package streamsFiles;

import java.util.ArrayList;

// Sind mächtiger als Arrays, erfüllen aber den gleichen Zweck.
// Besitzen noch zusätzliche Features, wie Ordnen, Duplikatenvermeidung
public class CollectionsDemo {

	public static void main(String[] args) {
		
		// Ohne Angabe eines Typen beim Generic werd von Objekten innerhalb der Liste ausgegangen
		// Es muss so gecastet werden.
		// Bei Angabe von einem Typ beim Generic muss nicht mehr zwangläufig gecastet werden.
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Foo");
		l1.add("Bar");
		
		System.out.println("Anzahl der Elemente: " + l1.size());
		
		for(String o: l1) {
			System.out.println(o.toString());
		}
		
		String s1 =  l1.get(0);
		//System.out.println(s1);
		
		String[] arstr = l1.toArray(new String[0]);
		
		for(String s: arstr) {
			System.out.println(s);
		}
	}
}
