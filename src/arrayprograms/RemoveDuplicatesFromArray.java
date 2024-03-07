package arrayprograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 2, 3, 4, 4, 5 };

		int j = 0; // Initialize a pointer for the next available position for unique elements

		for (int i = 1; i < array.length; i++) {
			// If the current element is different from the previous element, copy it to the
			// next available position
			if (array[i] != array[j]) {
				j++;
				array[j] = array[i];
			}
		}
		// The length of the array without duplicates is j + 1
		int length = j + 1;

		System.out.println("Array after removing duplicates:");
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\nLength of array without duplicates: " + length);

		//////////////////////////////////////////////////
		int a[] = { 1, 2, 1, 2, 3, 4, 5, 6, 4, 4, 5, 5 };
		int n = a.length;
		Set<Integer> hash_set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			hash_set.add(a[i]);
		}
		System.out.print(hash_set);
	}
}
