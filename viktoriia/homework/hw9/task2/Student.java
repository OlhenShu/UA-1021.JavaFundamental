package hw9.task2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades;

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student " + name + " in group " + group + ", course " + course + ", grades:" + Arrays.toString(grades);
    }

    public int averageGrade() {
        int total = 0;
        for (int grade: grades) {
            total+= grade;
        }
        int average = total / grades.length;
        if(average >= 3) {
            course++;
        }
        return average;
    }
    public static void removeNotPromoted(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().averageGrade() < 3) {
                iterator.remove();
            }
        }
    }
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students who enrolled to " + course + " course:");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).course == course) {
                System.out.println(students.get(i).name);
            }
        }
    }
}
