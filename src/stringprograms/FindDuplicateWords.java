package stringprograms;

public class FindDuplicateWords {

	public static void main(String[] args) {

		String str = "hello i am very very happy";
		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equals(words[j])) {
					count++;
					words[j] = " ";
				}
			}
			if (count > 1 && words[i] != " ") {
				System.out.println("Duplicate words in string: " + words[i] + " & count is: " + count);
			}
		}

	}

}
