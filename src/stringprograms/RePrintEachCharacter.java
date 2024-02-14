package stringprograms;

public class RePrintEachCharacter {

	public static void main(String[] args) {

		String str = "siya";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(str.charAt(i));
			}
		}
	}

}
