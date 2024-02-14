package arrayprograms;

public class EqualityCheckOfTwo2DArray {

	public static void main(String[] args) {
		int array1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };
		int array2[][] = { { 1, 2, 3, 4 }, { 4, 6, 5, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };

		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {

				if (array1[i][j] != array2[i][j]) {
					count++;
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("Both 2D array are equal");
		} else {
			System.out.println("Both 2D array are not equal");
		}
	}

}
