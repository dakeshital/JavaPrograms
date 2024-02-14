package basicjavaprograms;

public class FibonacceSeriesCheck {

	public static void main(String[] args) {

		int val = 10;
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		
		System.out.print("Fibonacci series: " + num1 + ", " + num2);
		
		for (int i = 2; i < val; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
			System.out.print(", " + sum);
		}
	}

}
