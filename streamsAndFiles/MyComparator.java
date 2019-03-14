package streamsFiles;

import java.util.Comparator;

public class MyComparator implements Comparator<MyClass>{

	public int compare(MyClass x, MyClass y) {
		return x.label.compareToIgnoreCase(y.label);
	}
}
