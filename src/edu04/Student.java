package edu04;

import java.util.Objects;

public class Student {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ira", 25);
        Student student2 = new Student("Ira", 25);

        String str1 = new String("Java");
        String str2 = new String("Java");

//        System.out.println(student1 == student2);
//        System.out.println(student1.equals(student2));
        System.out.println(str1 == str2);
       // System.out.println(student1.equals(student2));
    }
}

