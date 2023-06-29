package hw10.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 3));
        students.add(new Student("Sarah", 3));
        students.add(new Student("Tom", 3));
        students.add(new Student("Tom", 2));
        students.add(new Student("John", 5));

        System.out.println("Students course 3: ");
        Student.printStudents(students, 3);

        System.out.println("----------------");

        Collections.sort(students);
        System.out.println("Students sorted by name and then by course");
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
