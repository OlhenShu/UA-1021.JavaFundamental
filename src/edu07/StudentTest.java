package edu07;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = {new Student("Oksana", 22),
            new Student("Oksana", 17),
            new Student("Petro", 22),
            new Student("Orest", 19),
            new Student("Polina", 17),
        };
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        Arrays.sort(students, new NameComparator());

        for (Student student : students) {
            System.out.println(student);
        }

    }
    }
