package arrayprograms;

import java.util.Arrays;

public class SecondMinElementOfArray {

	public static void main(String[] args) {

		int array[] = { 10, 30, 50, 70, 30, 40, 10, 20, 50, 70, 90, 30 };

		Arrays.sort(array); 

		int secondMin = array[0];
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[i + 1]) { // array[0]!=array[1]
				secondMin = array[i + 1];
				min = array[i];
				break;
			}
		}
		System.out.println("min element of array is: " + min);

		System.out.print("Second min element of array is: " + secondMin);
	}

}
