package exceptionhandlingprograms;

public class FinallyBlockExample {
	public static int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
			return -1; 
		} finally {
			System.out.println("Finally block is executed.");
		}
	}

	public static void main(String[] args) {
		int result = divide(10, 0);
		System.out.println("Result: " + result);
	}
}