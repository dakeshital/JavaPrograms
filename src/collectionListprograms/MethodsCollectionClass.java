package collectionListprograms;

import java.util.ArrayList;
import java.util.Collections;

public class MethodsCollectionClass {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Shital");
		al.add("nikita");
		al.add("Shubham");
		al.add("jay");
		al.add(10);
		al.add(null);
		al.add("Shubham");

		System.out.println("Original List : \n" + al);

		Collections.shuffle(al);
		System.out.println("Shuffled List : \n" + al);

		Collections.reverse(al);
		System.out.println("Reversed List : \n" + al);

		// Collections.sort(al);//not possible here

		Collections.rotate(al, 4);
		System.out.println("Rotated List : \n" + al);

		System.out.println("Frequency of shubham is " + Collections.frequency(al, "Shubham"));

	}

}
