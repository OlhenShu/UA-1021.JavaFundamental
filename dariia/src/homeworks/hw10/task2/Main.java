package hw10.task2;

import java.util.*;

public class Main {

	public static void printMap(Map<String, String> map) {
		for (Map.Entry<String, String> element : map.entrySet()) {
			System.out.print("{" + element.getKey() + " " + element.getValue() + "} ");
		}
		System.out.print("\n");
	}

	public static Map<String, String> removeName(Map<String, String> map, String name) {
		Map<String, String> temp = new TreeMap<String, String>();
		for (Map.Entry<String, String> person : map.entrySet()) {
			if (!(person.getValue().equals(name))) {
				temp.put(person.getKey(), person.getValue());
			}
		}
		
		return map = temp;
	}

	public static void main(String[] args) {
		Map<String, String> personMap = new TreeMap<String, String>();
		personMap.put("Anderson", "Emma");
		personMap.put("Patel", "Rohan");
		personMap.put("Johnson", "Rohan");
		personMap.put("Smith", "Ethan");
		personMap.put("Lee", "Sofia");
		personMap.put("Rodriguez", "Gabriel");
		personMap.put("Williams", "Mia");
		personMap.put("Gracia", "Alexander");
		personMap.put("Brown", "Ava");
		personMap.put("Nguyen", "Liam");

		System.out.println("Before chanhing map:");
		printMap(personMap);

		System.out.println("\nAfter deleting all people with name 'Rohan':");
		personMap = removeName(personMap, "Rohan");
		printMap(personMap);

	}

}
