package collectionListprograms;

import java.util.ArrayList;
import java.util.HashSet;

public class CountDuplicateFromHashSet {

	public static void main(String[] args) {

		int[] nums = { 1, 7, 2, 5, 7, 3, 3 };
		System.out.println("Original array: " + nums);

		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> newList = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int count = 1; // Initialize count for each element
			if (set.contains(num)) { // If the element is not added to set, it means it's a duplicate
				count++;
				newList.add(num); // Add the duplicate element to the new list
			} else {
				set.add(num);
			}

			if (count > 1) { // If count is greater than 0, it's a duplicate
				System.out.println("duplicates number is: " + num + " & count is: " + count);
			}
		}
		System.out.println("Duplicate Elements: "+newList);
		System.out.println("Sorted HashSet Elements "+set);

	}
}
