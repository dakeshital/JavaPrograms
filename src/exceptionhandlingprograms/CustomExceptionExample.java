package exceptionhandlingprograms;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

class ValidAgeException extends Exception {
	// Constructor with a message
	public ValidAgeException(String message) {
		super(message);
	}
}

public class CustomExceptionExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age: ");
		int age = sc.nextInt();
		
		try {
			checkVotingAge(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		} catch (ValidAgeException e) {
			e.printStackTrace();
		}
	}

	public static void checkVotingAge(int age) throws InvalidAgeException, ValidAgeException {
		if (age >= 18) {
			throw new ValidAgeException("valid age for voting");
		} else if (age < 18) {
			throw new InvalidAgeException("Invalid age");
		} else {
			System.out.println("You are eligible to vote.");
		}
	}
}
