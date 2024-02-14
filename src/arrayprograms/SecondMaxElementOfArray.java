package arrayprograms;

import java.util.Arrays;

public class SecondMaxElementOfArray {

	public static void main(String[] args) {
		int array[] = { 10, 30, 50, 70, 30, 40, 10, 20, 70, 70, 90, 30 };

		Arrays.sort(array); // Sort the array in ascending order

		int max = array[array.length - 1]; // Get the maximum element (last element)
		int secondMax = array[array.length - 2]; // Get the second maximum element

		// Find the second maximum element
		for (int i = array.length-1; i >= 0; i--) {
			if (array[i] < max) {
				secondMax = array[i];
				break;
			}
		}
		System.out.println("max element of array is: " + max);

		System.out.print("Second max element of array is: " + secondMax);

		/////////////////// oooooooorrrrrrrr

//		int array[] = {10, 30, 50, 70, 30, 40, 10, 20, 50, 70, 90, 30};
//
//		int max = array[0];
//		int secondMax = array[0];
//
//		// Iterate the array
//		for (int i = 0; i < array.length; i++) {
//		    // If current element is greater than max
//		    if (array[i] > max) {
//		        // Update both max and secondMax
//		        secondMax = max;
//		        max = array[i];
//		    } else if (array[i] > secondMax && array[i] != max) {
//		        // If current element is not greater than max but greater than secondMax
//		        // Update secondMax
//		        secondMax = array[i];
//		    }
//		}
//
//		if (secondMax == array[0]) {
//		    System.out.println("There is no distinct second maximum element in the array.");
//		} else {
//		    System.out.println("Second max element of array is: " + secondMax);
//		}

	}

}
