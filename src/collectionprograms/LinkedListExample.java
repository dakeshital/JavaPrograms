package collectionprograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(102);
		list.add(101);
		list.add(234);
		list.add(null);
		list.add(212);
		list.add("sskfj");
		System.out.println("LinkedList is: " + list);

//		ListIterator itr = list.listIterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println("************");

		ListIterator itr = list.listIterator(list.size());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
