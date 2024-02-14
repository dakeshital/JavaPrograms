package patternprograms;

public class NumberPatternReverseInSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 6;
		for (int i = 1; i <= row; i++) {
			// prints spaces before the numbers in each row upto value of i
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// prints numbers in each row in reverse sequence
			for (int k = 1; k <= row - i; k++) { //1 k<=5,2 k<=4,3 k<=3,4 k<=2, 5 K<=1
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
