package arrayprograms;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5 };

		// Check if the array is empty
		if (nums.length == 0) {
			System.out.println("Array is empty");
			return;
		}

		int j = 0; // Initialize a pointer for the next available position for unique elements

		// Iterate through the array
		for (int i = 1; i < nums.length; i++) {
			// If the current element is different from the previous element, copy it to the
			// next available position
			if (nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];
			}
		}

		// The length of the array without duplicates is j + 1
		int length = j + 1;

		// Print the modified array
		System.out.println("Array after removing duplicates:");
		for (int i = 0; i < length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println(); // Print a newline for better output formatting

		System.out.println("Length of array without duplicates: " + length);
	}
}
