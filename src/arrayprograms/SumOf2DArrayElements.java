package arrayprograms;

public class SumOf2DArrayElements {

	public static void main(String[] args) {
		int array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum = sum + array[i][j];
			}
		}

		System.out.println("Sum of 2D array is:  " + sum);
	}

}
