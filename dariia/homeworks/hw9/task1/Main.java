package hw9.task1;

import java.util.*;

/*
 Declare collection myCollection of 10 integers and fill it (from the console or random).
• 
Use one or more of the next: List, ArrayList, LinkedList
 */

public class Task1 {

	public static void main(String[] args) {
		List<Integer> myCollection = new LinkedList<Integer>();
		Random rd = new Random();
		int count = 10;
		int max = 100;
		int min = -100;
		//
		do {
			// using (max - min) + min formula lets us set two bounds for the range
			int num = rd.nextInt(max - min) + min;
			myCollection.add(num);
		} while (count-- != 0);

		System.out.println("myCollection = " + myCollection.toString());

		// 1
		myCollection = SwapElements.swapElements(myCollection);
		System.out.println(" after swapping maximum and minimum element(max number = " + Collections.max(myCollection)
				+ ", min number = " + Collections.min(myCollection) + "):" + "\nmyCollection = "
				+ myCollection.toString());

		// 2
		InsertBigRandom.insertNum(myCollection);
		System.out.println(
				"after adding a random three-digit number  before the first negative element of the list:\nmyCollection = "
						+ myCollection.toString());
		// 3
		myCollection = InsertZero.insertZero(myCollection);
		System.out.println(
				"after inserting a zero between all neighboring elements collection myCollection with different signs:\nmyCollection = "
						+ myCollection.toString());
		
		// 4
		System.out.println("after coping the first k elements of the myCollection to the list1, in direct order, and the rest to thelist2 in reverse order:");
		TwoLists.devideIntoTwoSublists(myCollection);
		
		// 5
		myCollection = RemoveEven.removeEvenNumbers(myCollection);
		System.out.println(
				"after removing even numbers:\nmyCollection = "
						+ myCollection.toString());
		
		// 6
		myCollection = RemoveAfterMin.removeNum(myCollection);
		System.out.println(
				"after removing number that follows first :\nmyCollection = "
						+ myCollection.toString());
	}

}
