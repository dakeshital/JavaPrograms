package arrayprograms;

public class MaxElementOfArray {

	public static void main(String[] args) {
		int[] array = { 12, 39, 45, 23, 4, 56, 98 };
		int max = Integer.MIN_VALUE;
		//int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Max element of array: " + max);
	}

}
