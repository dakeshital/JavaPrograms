package basicjavaprograms;

public class OuterElementsPrint {

	public static void main(String[] args) {

		int k[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 2 }, { 5, 6, 8, 3 } };

		int min = k[0][0];
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[0].length; j++) {

				if (k[i][j] < min) {
					min = k[i][j];
				}
			}
		}
		System.out.println("Minimum element of array:" + min);

	}

}
