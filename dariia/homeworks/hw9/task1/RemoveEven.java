package hw9.task1;

import java.util.*;

// In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message.
public class RemoveEven {
	protected static List<Integer> removeEvenNumbers(List<Integer> list){
		int count = 0;
		List<Integer> newList = new LinkedList<Integer>();
		
		for (int num : list) {
			if (num % 2 == 0) {
				count++;
				continue;
			} else {
				newList.add(num);
			}
			
			if (count == 0) {
				System.out.println("No even numbers found");
			}
		}
		return newList;
	}
}
