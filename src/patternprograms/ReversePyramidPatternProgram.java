package patternprograms;

public class ReversePyramidPatternProgram {
	public static void main(String[] args) {

		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = row - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		int row1 = 4;
		for (int i = row1; i >= 1; i--) {
			for (int j = row1 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
