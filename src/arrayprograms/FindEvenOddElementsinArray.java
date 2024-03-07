package arrayprograms;

import java.util.Arrays;

public class FindEvenOddElementsinArray {

	public static void main(String[] args) {

		int[] array = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int evencount = 0;
		int oddcount = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
		}

		int[] evenElement = new int[evencount];
		int[] oddElement = new int[oddcount];

		int evenIndex = 0;
		int oddIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenElement[evenIndex++] = array[i];
			} else {
				oddElement[oddIndex++] = array[i];
			}
		}

		System.out.println("Even elements count: " + evencount);
		System.out.println("Even elements: " + Arrays.toString(evenElement));
//		for (int num : evenElement) {
//			System.out.print(num + " ");
//		}
//		System.out.println();

		System.out.println("Odd elements count: " + oddcount);
		System.out.println("Odd elements: " + Arrays.toString(oddElement));
//		for (int num : oddElement) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
	}
}
