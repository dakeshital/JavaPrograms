package patternprograms;

public class LeftTrianglePatternProgram {

	public static void main(String[] args) {

		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = row - i; j >= 1; j--) {// for (int j = row ; j >= i; j--)
				System.out.print("  "); // print 2 space
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		////////////// oooorrrrr

		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}


	}

}
