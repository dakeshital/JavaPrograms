package collectionMapprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateKeyCountOfMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(10, "shital");
		map.put(20, "shubham");
		map.put(30, "pooja");
		map.put(40, "nikita");
		map.put(50, "lucky");
		map.put(10, "shree");

		System.out.println(map);

		HashMap<Integer, Integer> duplicateMap = new HashMap<>();

		for (Integer key : map.keySet()) {
			int count = 0;
			for (Integer originalKey : map.keySet()) {
				if (key.equals(originalKey)) {
					count++;
				}
			}
			duplicateMap.put(key, count);
		}
		for (Map.Entry<Integer, Integer> entry : duplicateMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Duplicate Count: " + entry.getValue());
		}

	}
}