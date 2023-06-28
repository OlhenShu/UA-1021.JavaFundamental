package hw9.task1;

import java.util.*;

public class InsertBigRandom {
	protected static List<Integer> insertNum(List<Integer> list) {
		// finding first negative number
		int negativeIndex = 0;
		for (int num : list) {
			if (num < 0) {
				negativeIndex = list.indexOf(num);
				break;
			}
		}
		// generating three digit number
		Random rd = new Random();
		int num = 0;
		int max = 999;
		int min = -999;
		while (true) {
			num = rd.nextInt(max - min) - min;
			if (num >= 100) {
				// inserting it before the first negative number in th list
				list.add(negativeIndex, num);
				break;
			}
		}
		
		return list;
	}
}
