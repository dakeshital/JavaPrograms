package basicjavaprograms;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		int num = 253;
		int sum = 0;
		int temp = num, rem;

		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);// for 4 digit num :sum = sum + (rem * rem * rem * rem);
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Given number is Armstrong number: " + temp);
		} else {
			System.out.println("Given number is not Armstrong number: " + temp);
		}
	}
}

//Armstrong number is equal to the sum of its own digits each raised to the power of the number of digits in the number.
//eg 
//The number of digits in 153 is 3.
//Each digit of 153 is raised to the power of 3 (the number of digits): 1^3 + 5^3 + 3^3.
//This equals 1 + 125 + 27, which equals 153.

//Each digit of 1634 is raised to the power of 4 (the number of digits): 1^4 + 6^4 + 3^4 + 4^4.
//This equals 1 + 1296 + 81 + 256, which equals 1634.