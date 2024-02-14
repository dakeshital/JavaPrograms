package stringprograms;

public class CountVovelsAndConsonents {

	public static void main(String[] args) {
		String str = "hello my name is shital";
		int vovelCount = 0;
		int consonentCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {

					vovelCount++;
					System.out.print(str.charAt(i) + " ");

				} else if (str.charAt(i) > 'a' && str.charAt(i) <= 'z') {
					
					consonentCount++;
					System.out.print(str.charAt(i) + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Total Vovels in string: " + vovelCount);
		System.out.println("Total consonents in string: " + consonentCount);

	}

}
