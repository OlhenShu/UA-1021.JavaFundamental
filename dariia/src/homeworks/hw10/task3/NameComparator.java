package hw10.task3;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getName() == null || student2.getName() == null ) {
			return 1;
		}
		return student1.getName().compareTo(student2.getName());
	}

}
