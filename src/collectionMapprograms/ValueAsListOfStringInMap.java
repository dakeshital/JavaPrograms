package collectionMapprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValueAsListOfStringInMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Sc", "GCP,AWS");
		map.put("Sc1", "AWS");
		map.put("yah", "AWS,AZURE");
		map.put("Sc3", "GCP,AZURE");
		map.put("Sc2", "GCP");

		System.out.println("Input Map: " + map);

		Map<String, List<String>> outputMap = new HashMap<>();

		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			// System.out.println("original key " + key);
			String[] values = entry.getValue().split(",");

			for (String value : values) {
				// Retrieve the list of keys from outputMap, or create a new list if it
				// doesn't exist
				// System.out.println("original value " + value);

				List<String> keys = outputMap.get(value);
				if (keys == null) {
					keys = new ArrayList<>();
					outputMap.put(value, keys);
					// System.out.println("outputmap: " + outputMap);
				}

				// Add the current key to the list
				keys.add(key);
			}
		}

		System.out.println("Output Map: " + outputMap);
	}
}
//For each value in the array, we retrieve the list of keys associated with that value from the outputMap.
//If the list doesn't exist (i.e., the value is encountered for the first time), a new list is created and associated with the value in the outputMap.
//The current key is then added to the list of keys associated with the value