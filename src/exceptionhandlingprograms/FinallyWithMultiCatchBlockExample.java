package exceptionhandlingprograms;

public class FinallyWithMultiCatchBlockExample {
	
	public static void divide(int a, int b) {
		try {
			int result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Exception caught: " + e.getMessage());
		} finally {
			System.out.println("Finally block is executed.");
		}
	}

	public static void main(String[] args) {
		divide(10, 0);

		try {
			System.out.println("Inside try block");
			System.exit(0); // JVM will terminate here, finally block won't execute
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		} finally {
			System.out.println("Finally block is executed."); // This won't be executed
		}
	}

}
