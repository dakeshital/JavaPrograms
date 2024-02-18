package collectionListprograms;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Shital");
		al.add(101);
		al.add("Shubham");
		al.add(null);
		al.add(2.4f);
		al.add(4.5);
		System.out.println("ArrayList is: " + al);

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter elements:");
//		int num = sc.nextInt();
//		ArrayList<Integer> a = new ArrayList<>();
//
//		for (int i = 0; i < num; i++) {
//			a.add(sc.nextInt());
//		}
//		for (int i = 0; i < a.size(); i++) {
//			System.out.println(a.get(i));
//		}
	}

}
