package collectionListprograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class GetElementsFromLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(102);
		list.add(101);
		list.add(234);
		list.add(null);
		list.add(212);
		list.add("sskfj");
		System.out.println("Original LinkedList is: " + list);

		ListIterator itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("LinkedList in Reverse : ");

		// ListIterator itr = list.listIterator();
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

		System.out.println("Clearing the list.......");
		list.clear();
		System.out.println("After clearing list is " + list);
		list.add(102);
		list.add(101);
		list.add(234);
		list.add(212);
		System.out.println("New list " + list);

		///// ooooorrrrrr

		System.out.println("\nGet List Elements using get() method");
		LinkedList<String> ll = new LinkedList<>();
		ll.add("shital");
		ll.add("shubham");
		ll.add("dake");
		System.out.println(ll);

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

	}

}
