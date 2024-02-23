package collectionMapprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompareKeyFromMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "shital");
		map.put(20, "shubham");
		map.put(30, "pooja");
		map.put(40, "nikita");
		map.put(50, "lucky");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter key ");
		int key = sc.nextInt();

		if (map.containsKey(key)) {
			System.out.println("Input key available in map" + key);
		} else {
			System.out.println("Invalid key");
		}
//		boolean found = false;
//		for (Map.Entry<Integer, String> m1 : map.entrySet()) {
//
//			if (m1.getKey().equals(key)) {
//				System.out.println("Input key available in map" + key);
//				found = true;
//				break;
//			}
//		}
//		if (!found) {
//			System.out.println("Invalid key");
//		}
	}

}
