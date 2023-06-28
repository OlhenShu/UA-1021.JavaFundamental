package hw9.task2;

import java.util.*;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Student st1 = new Student("Alice", 1, 3);
		Student st2 = new Student("Bob", 1, 4);
		Student st3 = new Student("Caroline", 2, 3);
		List<Student> students = new ArrayList<Student>(List.of(st1, st2, st3));
		
		st1.addGrades("Algebra", 1);
		st1.addGrades("Geometry", 2);
		st1.addGrades("History", 2);
		
		st2.addGrades("Algenra", 5);
		st2.addGrades("Geometry", 8);
		st2.addGrades("History", 10);
		
		st3.addGrades("Algebra", 9);
		st3.addGrades("Geometry", 10);
		st3.addGrades("History", 9);
		
		
		for (Student student : students) {
			System.out.println("============================================");
			student.printInfo();
			System.out.println("--------------------------------------------");
			student.getGrades();
		}
		System.out.println("============================================");
		
		System.out.println("list of students before checking grades:");
		for (Student st : students) {
			System.out.print(st.getName() + " ");
		}
		
		students = Student.checkList(students);
		
		System.out.println("\nlist of students after checking grades:");
		for (Student st : students) {
			System.out.print(st.getName() + " ");
		}
		
		System.out.println("\n============================================");
		
		Student.printCourseStudents(students, 1);	// 0
		Student.printCourseStudents(students, 4);	// 1: Bob
		Student.printCourseStudents(students, 3);	// 2: Alice and Caroline
	}

}
