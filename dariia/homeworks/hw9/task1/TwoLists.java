package hw9.task1;

import java.util.*;

// Copy the first k elements of the myCollection to the list1, in direct order, and the rest to thelist2 in reverse order.
public class TwoLists {
	protected static void devideIntoTwoSublists(List<Integer> list) {
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		int middle = list.size() / 2;

		int count = 0;
		while (count != middle) {
			list1.add(list.get(count++));
		}
		while (count < list.size()) {
			list2.add(list.get(count++));
		}
		
		Collections.reverse(list2);

		System.out.println("list1 = " + list1.toString() + "\nlist2 = " + list2.toString());

	}

}
