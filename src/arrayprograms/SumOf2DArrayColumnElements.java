package arrayprograms;

public class SumOf2DArrayColumnElements {

	public static void main(String[] args) {
		int array1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };

		int totalSum = 0;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < array1.length; i++) {
			int sum = 0;
			for (int j = 0; j < array1.length; j++) {
				sum = sum + array1[j][i];
			}
			System.out.println("sum of columns: " + sum);
			totalSum = totalSum + sum;
		}
		System.out.println("Total sum of column elements: " + totalSum);
	}

}
