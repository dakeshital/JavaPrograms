package stringprograms;

public class CountWordsInString {

	public static void main(String[] args) {

		String str = "hello my name is shital";
		String[] words = str.split(" ");

		int count = words.length;
		System.out.println("Total words in string: " + count);

		///// ooooorrrr///
		int countWord = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && i == 0 || str.charAt(i) != ' ' && str.charAt(i - 1) == ' ') {
				countWord++;
			}
		}
		System.out.println("Total words in string: " + countWord);


	}

}
