package collectionSetprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
	String name;
	int age;

	Students(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Students st) {
		if (age < st.age)
			return -1;
		else if (age > st.age)
			return 1;
		else
			return 0;
	}
}

public class ComparableExampleWithList {
	public static void main(String[] args) {

		List<Students> list = new ArrayList<Students>();

		list.add(new Students("shital", 27));
		list.add(new Students("shubham", 30));
		list.add(new Students("raj", 24));

		Collections.sort(list);

		System.out.println("Students List sorted by age:");
		for (Students stud : list) {
			System.out.println(stud.name + " " + stud.age);
		}
		
	}

}
