package hw9.task1;

import java.util.*;

// Insert a zero between all neighboring elements collection myCollection with different signs
public class InsertZero {
	protected static List<Integer> insertZero(List<Integer> list) {
		
		List<Integer> modifiedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            modifiedList.add(list.get(i));

            if (i < list.size() - 1) {
                int currentElement = list.get(i);
                int nextElement = list.get(i + 1);

                if (Math.signum(currentElement) != 0 && Math.signum(nextElement) != 0 &&
                    Math.signum(currentElement) != Math.signum(nextElement)) {
                    modifiedList.add(0);
                }
            }
        }
		return modifiedList;
	}
}
