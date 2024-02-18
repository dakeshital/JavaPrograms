package collectionSetprograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(7);
		System.out.println(h);

		int table = 0;
        Iterator<Integer> itr = h.iterator();
		while (itr.hasNext()) {
			Integer num = itr.next();
			for (int i = 1; i <= 10; i++) {
				table = i * num;
				System.out.println(table);
			}
			System.out.println();
		}

	}

}
