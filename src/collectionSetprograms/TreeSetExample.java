package collectionSetprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(80);
		System.out.println(al);

		TreeSet<Integer> tset = new TreeSet();
		tset.addAll(al);
		System.out.println("Ascending Order: " + tset);

		Iterator<Integer> descitr = tset.descendingIterator();
		System.out.println("TreeSet in descending order: ");
		while (descitr.hasNext()) {
			System.out.println(descitr.next());
		}

	}

}
