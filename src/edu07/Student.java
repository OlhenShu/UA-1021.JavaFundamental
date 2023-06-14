package edu07;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
// without <Student>
//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

    @Override
    public int compareTo (Student student){
        if (this.name.compareTo(student.name) != 0) {
            return this.name.compareTo(student.name);
        } else {
            return Integer.compare(this.age, student.age);
        }
    }
}
class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(),s2.getAge());
    }
}