package collectionListprograms;

import java.util.ArrayList;
import java.util.Collections;

public class FindFrequencyOfEachObject {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Shital");
		list.add("nikita");
		list.add("Shubham");
		list.add("jay");
		list.add("Shital");
		list.add("nikita");
		list.add("Shubham");

		System.out.println("Original list: " + list);

		ArrayList<String> duplicates = new ArrayList<>();
		ArrayList<String> newList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			int count = 1;
			String element = list.get(i);
			if (newList.contains(element)) {
				count++;
				duplicates.add(element);
			} else {
				newList.add(element);
			}
			if (count > 1) {
//				int frequency = Collections.frequency(list, element);
//				System.out.println("Duplicate element: " + element + ", frequency: " + frequency);
				System.out.println("Duplicate element: " + element + ", count: " + count);
			}
		}
		System.out.println("Duplicate list: " + duplicates);
		System.out.println("New list: " + newList);

	}
}
