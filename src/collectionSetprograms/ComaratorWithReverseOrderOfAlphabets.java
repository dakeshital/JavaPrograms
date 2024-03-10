package collectionSetprograms;

import java.util.Comparator;
import java.util.TreeSet;

class MyStringComparator implements Comparator<Object> {

	public int compare(Object o1, Object o2) {

		String str1 = (String) o1;
		String str2 = o2.toString();
		// return str1.compareTo(str2);
		return str2.compareTo(str1);

		// byusing length
//		Integer i1 = str1.length();
//		Integer i2 = str2.length();
//
//		if (i1 < i2) {
//			return 1;
//		} else if (i1 > i2) {
//			return -1;
//		} else {
//			return str2.compareTo(str1);
//		}
	}
}

public class ComaratorWithReverseOrderOfAlphabets {

	public static void main(String[] args) {

		TreeSet<String> t = new TreeSet<>(new MyStringComparator());
		t.add("shital");
		t.add("shubham");
		t.add("nikita");
		t.add("arnav");
		t.add("pooja");
		t.add("lucky");
		// System.out.println("Default order: " + t);//str1.compareTo(str2);
		System.out.println("Reverse order: " + t);

	}

}
