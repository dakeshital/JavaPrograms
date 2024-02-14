package patternprograms;

public class StarPatternProgram {

	public static void main(String[] args) {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			//prints spaces before the stars in each row
			for (int j = row - i; j >= 1; j--) {//for (int j = row ; j >= i; j--)
				System.out.print(" ");
			}
			//stars printed in each row depends on the value of i
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
