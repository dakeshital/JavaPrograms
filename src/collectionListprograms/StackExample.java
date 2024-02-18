package collectionListprograms;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in stack: ");

		Stack stack = new Stack();

		while (sc.hasNext()) {//It continues indefinitely until there are no more tokens left to read.
			
			if (sc.hasNextInt()) {   
				int num = sc.nextInt();
				stack.push(num);
				
			} else {
				String input = sc.next();
				System.out.println("Character entered. Exiting loop...");
				break;
			}
		}

		System.out.println("Stack elements are: ");
		Enumeration e = stack.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement());
		}

		/////////// oooorrrrr/////
		// for iteration
		System.out.println("Stack elements are: ");
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}

		sc.close();
	}
}
