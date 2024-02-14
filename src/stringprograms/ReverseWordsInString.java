package stringprograms;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String str = "hello my name is shital";
		String[] words = str.split(" ");
		StringBuilder reverseWord = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			StringBuilder sb = new StringBuilder(words[i]);
			sb.reverse();
			reverseWord.append(sb).append(" ");
		}
		System.out.println(reverseWord);

		///////// or
//		for (String word : words) {
//			StringBuilder sb = new StringBuilder(word);
//			sb.reverse();
//			reverseWord.append(sb).append(" ");
//		}
//		System.out.println(reverseWord);

	}

}
