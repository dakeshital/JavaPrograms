package basicjavaprograms;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 232;
		int rev = 0;
		int rem, temp = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("Given number is Palindrome: " + temp);
		} else {
			System.out.println("Given number is not Palindrome: " + temp);

		}
	}

}
