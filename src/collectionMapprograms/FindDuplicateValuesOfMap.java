package collectionMapprograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateValuesOfMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "shital");
		map.put(20, "shubham");
		map.put(30, "pooja");
		map.put(40, "nikita");
		map.put(50, "lucky");
		map.put(70, "shubham");
		map.put(60, "lucky");

		System.out.println(map);

		Map<String, Integer> valueCountMap = new HashMap<>();

		// Counting duplicate values
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			String value = entry.getValue();
			int count = 1;
			if (valueCountMap.containsKey(value)) {
				valueCountMap.put(value, count + 1);
			} else {
				valueCountMap.put(value, 1);
			}
		}

		// Print the count of duplicate values
		System.out.println("Duplicate Value Count:");
		for (Map.Entry<String, Integer> entry : valueCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Value: " + entry.getKey() + ", Count: " + entry.getValue());
			}
		}
	}
}
