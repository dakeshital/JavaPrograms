package collectionSetprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesOfArrayUsingSet {

	public static void main(String[] args) {

		int a[] = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		int count = 0;

		for (int i = 0; i < a.length; i++) {

			set.add(a[i]);
		}
		System.out.print(set);
	}

}
