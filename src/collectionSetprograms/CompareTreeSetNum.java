package collectionSetprograms;

import java.util.Iterator;
import java.util.TreeSet;

public class CompareTreeSetNum {

	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<Integer>();

		for (int i = 0; i <= 10; i++) {
			tset.add(i);
		}
		System.out.println(tset);
		
		TreeSet<Integer> newset = new TreeSet<Integer>();
        newset = (TreeSet<Integer>) tset.headSet(7); // Assigning the subset to newset

		Iterator iterator = newset.iterator();
		System.out.println("Tree set data: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}

}
