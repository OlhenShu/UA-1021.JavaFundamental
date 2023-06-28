package hw9.task1;

import java.util.*;

// Remove from the list myCollection the element following the first minimum. If the minimum element is the last one, nothing needs to be removed.
public class RemoveAfterMin {
	protected static List<Integer> removeNum(List<Integer> list) {
		int minElemPos = list.indexOf(Collections.min(list));
		if (minElemPos != list.size() - 1) {
			list.remove(minElemPos + 1);
		}
		return list;
	}
}
