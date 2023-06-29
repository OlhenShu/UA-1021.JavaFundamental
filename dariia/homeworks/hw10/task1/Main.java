package hw10.task1;

import java.util.*;

/*
 * Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), 
 * realizing the operations of union and intersection of two sets. Test the operation 
 * of these techniques on two pre-filled sets.
 */

public class Main {

	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> union = new TreeSet<Integer>(set1);
		union.addAll(set2);
		return union;
	}
	
	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> intersect = new TreeSet<Integer>(set1);
		intersect.retainAll(set2);
		return intersect;
	}

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5, 11 }));
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] { 3, 2, 6, 8, 1, 9 }));
		System.out.println("set1: " + set1 + "\nset2:" + set2);
		
		Set<Integer> union = union(set1, set2);
		System.out.println("union of two sets: " + union.toString());
		Set<Integer> intersect = intersect(set1, set2);
		System.out.println("intersection of two sets: " + intersect.toString());
	}

}
