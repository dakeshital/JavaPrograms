package basicjavaprograms;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 4532;
		int sum = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
