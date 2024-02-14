package stringprograms;

public class CountOfCharactersInString {

	public static void main(String[] args) {

		String str = "hello my name is shital";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total characters in string: " + count);
	}

}
