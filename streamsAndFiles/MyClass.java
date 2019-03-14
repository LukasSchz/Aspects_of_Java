package streamsFiles;

public class MyClass implements Comparable<MyClass> /*, Comparator<MyClass>*/{

	public String label, value;
	
	public MyClass() {
		
	}
	
	public MyClass(String label, String value) {
		this.label = label;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return label + "|" + value;
	}
	
	@Override
	public boolean equals(Object o) {
		MyClass m = (MyClass) o;
		return value.equalsIgnoreCase(m.value);
	}
	
	public int compareTo(MyClass other) {
		return value.compareToIgnoreCase(other.value);
	}
	
//	public int compare(MyClass x, MyClass y) {
//		return x.label.compareToIgnoreCase(y.label);
//	}
}
