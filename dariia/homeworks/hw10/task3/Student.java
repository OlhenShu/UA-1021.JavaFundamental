package hw10.task3;

import java.util.*;

public class Student {
	private String name;
	private int course;

	public Student() {
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public Student(int course, String name) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public static void printStudents(List<Student> students, int course) {
		int count = 0;
		for (Student student : students) {
			if (student.getCourse() == course) {
				System.out.print(student.getName());
				count++;
			}
		}

		if (count == 0) {
			System.out.println("No students found");
		}
	}

	
}
