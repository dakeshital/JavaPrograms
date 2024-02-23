package collectionSetprograms;

import java.util.Iterator;
import java.util.TreeSet;

public class ReverseTreeset {

	public static void main(String[] args) {
		TreeSet<Integer> h = new TreeSet<>();
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(7);
		System.out.println(h);

		Iterator itr = h.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
