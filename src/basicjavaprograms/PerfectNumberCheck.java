package basicjavaprograms;

public class PerfectNumberCheck {

	public static void main(String[] args) {
		// checks the sum of proper divisors is equal to given number
		int num = 6;
		int sum = 0;
		int temp = num;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (temp == sum) {
            System.out.println("Given number is perfect number: " + temp);
        } else {
            System.out.println("Given number is not perfect number: " + temp);
        }
	}

}
