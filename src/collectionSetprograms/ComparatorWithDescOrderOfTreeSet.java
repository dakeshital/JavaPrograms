package collectionSetprograms;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Object> {

	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < i2) {
			return 1;
		} else if (i1 > i2) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class ComparatorWithDescOrderOfTreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<>(new MyComparator());
		t.add(10);
		t.add(50);
		t.add(20);
		t.add(90);
		t.add(40);
		t.add(70);
		System.out.println("Descending order of treeset using comparator: " + t);

	}

}
