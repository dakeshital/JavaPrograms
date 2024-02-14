package stringprograms;

public class ReverseString {

	public static void main(String[] args) {

		String str = "shital";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("reverse string : " + rev);

		StringBuilder sb = new StringBuilder("helloo");
		sb.reverse();
		System.out.println("reverse string using stringbuilder : " + sb);
	}

}
