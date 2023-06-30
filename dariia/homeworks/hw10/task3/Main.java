package hw10.task3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>(List.of(new Student(3, "John"), new Student(1, "Michael"),
				new Student(3, "Emma"), new Student("Sophia", 1), new Student("Daniel", 2)));
		Collections.sort(students, new NameComparator());
		
		System.out.println("Sorted by name: ");
		for (Student student : students) {
			System.out.println(student.getName() + " - " + student.getCourse());
		}
		
		Collections.sort(students, new CourseComparator());
		System.out.println("Sorted by course: ");
		for (Student student : students) {
			System.out.println(student.getName() + " - " + student.getCourse());
		}
	}

}
