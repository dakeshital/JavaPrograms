package arrayprograms;

import java.util.Arrays;

public class SecondMaxElementOfArray {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				secondMax = max;
				max = array[i];
			} else if (array[i] > secondMax && array[i] != max) {
				secondMax = array[i];
			}
		}

		System.out.println("max element of array is: " + max);
		System.out.print("Second max element of array is: " + secondMax);

		/////////////////// oooooooorrrrrrrr

//		int array[] = { 10, 30, 50, 70, 30, 40, 10, 20, 70, 70, 90, 30 };
//
//		Arrays.sort(array); // Sort the array in ascending order
//
//		int max = array[array.length - 1]; // Get the maximum element (last element)
//		int secondMax = array[array.length - 2]; // Get the second maximum element
//
//		// Find the second maximum element
//		for (int i = array.length - 1; i >= 0; i--) {
//			if (array[i] < max) {
//				secondMax = array[i];
//				break;
//			}
//		}
//		System.out.println("max element of array is: " + max);
//
//		System.out.print("Second max element of array is: " + secondMax);

	}

}
