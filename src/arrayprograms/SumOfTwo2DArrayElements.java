package arrayprograms;

public class SumOfTwo2DArrayElements {

	public static void main(String[] args) {
		int array1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };
		int array2[][] = { { 1, 2, 3, 4 }, { 4, 6, 5, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };

		int sum[][] = new int[array1.length][array2.length];

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {

				sum[i][j] = array1[i][j] + array2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();

		}
	}

}
