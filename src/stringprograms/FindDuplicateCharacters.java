package stringprograms;

public class FindDuplicateCharacters {

	public static void main(String[] args) {

		String str = "hello my name is shital";
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j] && str.charAt(i) != ' ') {
					count++;
					ch[j] = ' ';
				}
			}
			if (count > 1 && ch[i] != ' ') {
				System.out.println("Duplicate characters: " + ch[i] + " & count is: " + count);
			}

		}
	}

}
