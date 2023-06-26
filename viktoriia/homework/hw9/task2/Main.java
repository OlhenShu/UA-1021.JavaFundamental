package hw9.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        int[] grade1 = {4, 5, 2, 4, 3};
        int[] grade2 = {3, 5, 1, 3, 2};
        int[] grade3 = {3, 3, 4, 5, 5};
        int[] grade4 = {4, 4, 4, 3, 2};
        int[] grade5 = {3, 4, 3, 3, 4};
        int[] grade6 = {5, 4, 5, 5, 4};
        students.add(new Student("John", "Biology", 2, grade1));
        students.add(new Student("Hannah", "Engineering", 3, grade2));
        students.add(new Student("Max", "Art", 3, grade3));
        students.add(new Student("Tom", "Music", 1, grade4));
        students.add(new Student("Samanta", "Law", 2, grade5));
        students.add(new Student("Julia", "History", 3, grade6));
        for (Student student: students) {
            System.out.println(student);
        }
        Student.removeNotPromoted(students);
        System.out.println("After removing not promoted:"); //Also write new course
        for (Student student: students) {
            System.out.println(student);
        }
        Student.printStudents(students, 4);

    }
}
