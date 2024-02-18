package collectionListprograms;

import java.util.ArrayList;

public class MethodsInArrayList {

	@SuppressWarnings("removal")
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Shital");
		al.add("nikita");
		al.add("Shubham");
		al.add("jay");
		al.add(10);
		al.add(30.4f);
		al.add(2.7);
		al.add(null);
		al.add(null);
		al.add("Shubham");

		System.out.println("Original Arraylist: " + al);
		// remove(int index)
		al.remove(5);
		al.remove(7);
		if (al.contains("jay")) {
			al.remove(3);
		}
		System.out.println("Modified Arraylist: " + al);
		System.out.println(al.get(2));
	}

}
