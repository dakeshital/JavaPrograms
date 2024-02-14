package arrayprograms;

public class AverageOf2DArrayElements {

	public static void main(String[] args) {
		int array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
				sum = sum + array[i][j];
			}
			System.out.println();
		}
		int totalElements = array.length * array[0].length;
		System.out.println("TotalElements: " + totalElements);
		avg = sum / totalElements;
		System.out.println("Sum of 2D array is:  " + sum);
		System.out.println("Average of 2D array is:  " + avg);
	}

}
