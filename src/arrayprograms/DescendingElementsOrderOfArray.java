package arrayprograms;

public class DescendingElementsOrderOfArray {

	public static void main(String[] args) {
		int array[] = { 10, 30, 50, 70, 30, 40, 10, 20, 50, 70, 90, 30 };

		int temp;
		System.out.print("Descending order is: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.print(array[i] + " ");
		}
	}

}
