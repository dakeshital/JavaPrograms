package collectionListprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ConversionOfArrayToArrayList {

	public static void main(String[] args) {

		String[] names = { "shital", "shubham", "anil", "sunil", "pooja" };

//		List<String> al = Arrays.asList(names);
//		System.out.println(al);

		ArrayList<String> list = new ArrayList<String>();
		for (String str : names) {
			list.add(str);
		}
		System.out.println("ArrayList: " + list);

		Object[] array = list.toArray();
		// Print the array
		for (Object s : array) {
			System.out.println(s);
		}

	}

}
