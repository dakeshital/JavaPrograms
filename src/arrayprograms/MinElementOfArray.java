package arrayprograms;

public class MinElementOfArray {

	public static void main(String[] args) {
		int[] array = { 12, 39, 45, 23, 4, 56, 98 };
		int min = Integer.MAX_VALUE;
		//int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Min element of array: " + min);
	}

}
