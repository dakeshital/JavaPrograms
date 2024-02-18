package collectionListprograms;

import java.util.ArrayList;

public class ConversionOfArrayListToArray {

	public static void main(String[] args) {
		// Convert ArrayList to Array
		ArrayList<String> al = new ArrayList<String>();
		al.add("Shital");
		al.add("nikita");
		al.add("Shubham");
		al.add("jay");

//		String[] array = al.toArray(new String[0]);
//		for (String s : array) {
//			System.out.println(s);
//		}

		Object[] array = al.toArray();
		// Print the array
		for (Object s : array) {
			System.out.println(s);
		}
	}

}
