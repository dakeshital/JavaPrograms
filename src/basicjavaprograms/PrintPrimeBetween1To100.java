package basicjavaprograms;

public class PrintPrimeBetween1To100 {

	public static void main(String[] args) {

		for (int num = 1; num <= 100; num++) {
			int count = 0;
			for (int divisor = 1; divisor <=num; divisor++) {
				if (num % divisor == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(num);
			}
		}
	}

}
