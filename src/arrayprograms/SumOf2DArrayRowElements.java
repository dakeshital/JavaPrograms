package arrayprograms;

public class SumOf2DArrayRowElements {

	public static void main(String[] args) {
		int array1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };

		int totalSum = 0;
		for (int i = 0; i < array1.length; i++) {

			int sum = 0;
			for (int j = 0; j < array1[i].length; j++) {

				System.out.print(array1[i][j] + " ");
				sum = sum + array1[i][j];
			}
			System.out.println();
			System.out.println("sum of row: " + sum);
			totalSum = totalSum + sum;
		}
		System.out.println("Total sum of row elements: " + totalSum);

	}

}
