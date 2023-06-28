package hw9.task1;

import java.util.*;

public class SwapElements {

	protected static List<Integer> swapElements(List<Integer> list) {
		int maxNum = Collections.min(list);
		int minNum = Collections.max(list);
		int minIndex = list.indexOf(minNum);
		int maxIndex = list.indexOf(maxNum);
		
		list.set(minIndex, maxNum);
		list.set(maxIndex, minNum);
		
		return list;
	}

}
