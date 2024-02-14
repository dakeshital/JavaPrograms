package patternprograms;

public class RightTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		int row1 = 5;
		for (int i = row1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
