package collectionSetprograms;

import java.util.HashSet;

public class HashSetToArrayConversion {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();
		hset.add("Red");
		hset.add("Green");
		hset.add("Black");
		hset.add("White");
		hset.add("Pink");
		hset.add("Yellow");
		System.out.println("Original Hash Set: " + hset);
		
		String[] array = new String[hset.size()];
		hset.toArray(array);

		System.out.println("Array elements: ");
		for (String element : array) {
			System.out.println(element);
		}

	}

}
