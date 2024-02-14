package arrayprograms;

public class OuterBoundryElementOfMatrix {

	public static void main(String[] args) {
		int array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 4, 6 }, { 2, 5, 8, 7 } };

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {

				if (i == 0 || j == 0 || i == array.length - 1 || j == array.length - 1) {
					System.out.print(array[i][j] + " ");
					sum = sum + array[i][j];
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("Sum of OuterBoundry Element in 2D array :  " + sum);
	}

}
