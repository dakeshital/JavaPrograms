package patternprograms;

public class AlphabetPattern {

	public static void main(String[] args) {
		int row = 5;
		char ch = 'a';
		while (ch <= 'z') {
			for (int i = 1; i <= row; i++) {
				for (int j = row - i; j >= 1; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print(ch + " ");
					ch++;
				}
				System.out.println();
			}
			break;
		}

	}

}
