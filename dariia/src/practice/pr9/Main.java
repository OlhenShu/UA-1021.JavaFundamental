package pr9;

import java.util.ArrayList;
import java.util.Random;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> myCollection = new ArrayList<Integer>();
		int i = 10;
		Random rand = new Random();
		while (i-- != 0) {
			myCollection.add(rand.nextInt(50));
		}
		ArrayList<Integer> newCollection = new ArrayList<Integer>();

		System.out.println("myCollection = " + myCollection.toString());

		for (int el : myCollection) {
			if (el >= 5) {
				newCollection.add(el);
			}
		}

		System.out.println("newCollection (all more than 5) = " + newCollection.toString());

//		using temporal array
//		ArrayList<Integer> temp = new ArrayList();
//		for (int el : myCollection) {
//			if (el < 20) {
//				temp.add(el);
//			}
//		}
//		myCollection = temp;

//		with iterator

		var iterator = myCollection.iterator();
		while (iterator.hasNext()) {
			var elements = iterator.next();
			if (elements > 20) {
				iterator.remove();
			}
		}

		System.out.println("myCollection (after removing el > 20) = " + myCollection.toString());

//		myCollection.add(2, 1);
//		myCollection.add(8, -3);
//		myCollection.add(5, -4);
//		
//		System.out.println("myCollection (after adding (2,1), (8,-3), (5, -4)) = " + myCollection.toString());
	}

}
