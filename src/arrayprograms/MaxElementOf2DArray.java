package arrayprograms;

public class MaxElementOf2DArray {

	public static void main(String[] args) {
		int array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };

		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {

				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		System.out.println("Max Element in 2D array is:  " + max);
	}

}
