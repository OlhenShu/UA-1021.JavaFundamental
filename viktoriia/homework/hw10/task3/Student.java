package hw10.task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
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

    @Override
    public String toString() {
        return "Student name: " + name + ", course: " + course;
    }

    @Override
    public int compareTo(Student s) {
        if (this.getName().equals(s.getName())) {
            return this.getCourse() - s.getCourse();
        } else {
            return this.getName().compareTo(s.getName());
        }
    }

    public static void printStudents(List<Student> students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student stud = iterator.next();
            if(course.equals(stud.getCourse())) {
                System.out.println(stud);
            }
        }
    }
}
