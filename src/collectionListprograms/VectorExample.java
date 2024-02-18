package collectionListprograms;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter element");
		int input = sc.nextInt();

		Vector v = new Vector();
		for (int i = 1; i <= 20; i++) {
			v.add(i);
		}
		// System.out.println(v);

		Enumeration e = v.elements();
		boolean inputAvailable = false;

		while (e.hasMoreElements()) {
			Integer num = (Integer) e.nextElement();
			if (input == num) {
				inputAvailable = true;
				break;
			}
		}
		if (inputAvailable) {
			System.out.println("Input number is available in vector: " + input);
		} else {
			System.out.println("Input number not available in vector: " + input);
		}
	}
}
