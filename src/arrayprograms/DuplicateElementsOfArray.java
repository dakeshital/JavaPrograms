package arrayprograms;

public class DuplicateElementsOfArray {

	public static void main(String[] args) {

		int array[] = { 10, 30, 50, 70, 30, 40, 10, 20, 50, 70, 90, 30 };

		int duplicatecount = 0;
		for (int i = 0; i < array.length; i++) {
			duplicatecount = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && array[i] != 0) {
					duplicatecount++;
					array[j] = 0;
				}
			}
			if (duplicatecount > 1 && array[i] != 0) {
				System.out.println("Dulicate elements: " + array[i] + " & count:  " + duplicatecount);
			}
		}
	}
}
