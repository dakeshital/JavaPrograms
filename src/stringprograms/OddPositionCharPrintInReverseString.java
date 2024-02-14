package stringprograms;

public class OddPositionCharPrintInReverseString {

	public static void main(String[] args) {
		// String str = "cravita";
		StringBuilder sb = new StringBuilder("cravita");
		sb.reverse();
		System.out.println("Reverse string: " + sb);

		for (int i = 0; i < sb.length(); i++) {
			if (i % 2 != 0) {
				System.out.println(sb.charAt(i));
			}
		}
	}

}
