package collectionSetprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}

class AgeComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.age < s2.age)
			return 1;
		else if (s1.age > s2.age)
			return -1;
		else
			return 0;
	}
}

class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return -s1.name.compareTo(s2.name);
	}
}

public class ComparatorExample {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("shital", 27));
		list.add(new Student("shubham", 30));
		list.add(new Student("shubhra", 24));

		System.out.println("Students List sorted by age:");
		Collections.sort(list, new AgeComparator());

		for (Student stud : list) {
			System.out.println(stud);
		}

		System.out.println("\nStudents List sorted by Name:");
		Collections.sort(list, new NameComparator());

		for (Student stud : list) {
			System.out.println(stud);
		}
	}

}
