package collectionSetprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ConvertArrayToTreeSet {

	public static void main(String[] args) {
		String[] names = { "shital", "shubham", "anil", "sunil", "pooja" };

		TreeSet<String> tset = new TreeSet<>();
		Collections.addAll(tset, names);
		System.out.println("Treeset using collection.addAll() method :" + tset);

		/////// ooooorrrrrr

		TreeSet<String> treeset = new TreeSet<>();
		for (String str : names) {
			treeset.add(str);
		}
		System.out.println("Treeset using forEach Loop:" + tset);


	}

}
