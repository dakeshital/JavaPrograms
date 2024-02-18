package collectionSetprograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class ConvertArrayListToTreeSet {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("golang");
		list.add("Java");
		list.add("Python");
		list.add("Java"); // Duplicate entry
		System.out.println("ArrayList is:" + list);

		TreeSet tset = new TreeSet();
		tset.addAll(list);
		System.out.println("TreeSet is: " + tset);//duplicates removed

	}

}
