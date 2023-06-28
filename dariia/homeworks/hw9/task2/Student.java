package hw9.task2;

import java.util.*;

public class Student {

	private String name;
	private int group;
	private int course;
	private Map<String, Integer> grades = new TreeMap<String, Integer>();

	public Student(String name, int group, int course) {
		this.name = name;
		this.group = group;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void printInfo() {
		System.out.println("Name: " + name + "\nGroup: " + group + "\nCourse:" + course);
	}

	public void addGrades(String subject, int grade) {
		grades.put(subject, grade);
	}

	public void getGrades() {
		System.out.println("Grades: ");
		for (Map.Entry<String, Integer> data : grades.entrySet()) {
			System.out.println(data.getKey() + ": " + data.getValue());
		}
	}

	private static int checkGrades(Student student) {
		 if (student.grades.isEmpty()) {
	            return 0;
	        } else {
	            int sum = 0;
	            for (int grade : student.grades.values()) {
	                sum += grade;
	            }
	            return sum / student.grades.size();
	        }
	}

	public static List<Student> checkList(List<Student> list) {
		List<Student> newList = new ArrayList<Student>();
		for (Student st : list) {
			if (checkGrades(st) != 0 && checkGrades(st) > 3) {
				newList.add(st);
			}
		}
		return newList;
	}
	
	public static void printCourseStudents(List<Student> list, int courseID) {
		int count = 0;
		System.out.println("Students of the course " + courseID + ":");
		for (Student student : list) {
			if (student.course == courseID) {
				System.out.println(student.name);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("(no students of this course found)");
		}
	}
}
