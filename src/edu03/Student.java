package edu03;

public class Student /*extends Object*/{
    private String name;
    private int age;

    public static int count = 0;

    public Student() {
        count++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public Student(String name) {
        this.name = name;
        count++;
    }

    public Student(int age) {
        this.age = age;
        count++;
    }

    public void print() {
        System.out.println(name);
    }

    public void print(int age) {
        System.out.println(age + name);
    }

    public void print(String s) {
        System.out.println(s + name);
    }

    public void print(String s, int age) {
        System.out.println(s + age + name);
    }

    public void print(int age, String s) {
        System.out.println(s + age + name);
    }

   @Override
    public String toString() {
        return "Student info is [" +
            "Name='" + name + '\'' +
            ", Age=" + age +
            ']';
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
}

class DemoStudent {
    public static void main(String[] args) {

        Student student1 = new Student(18);
        student1.setName("Alice");


        Student student2 = new Student();
        student2.setName("Bob");
        student2.setAge(21);

        Student student3 = new Student("Anna",19);

        int n = Student.count;

        System.out.println(Student.count);
        //System.out.println("Bob is " + student2.getAge() + " years old");
        System.out.println(student3);
    student3.getClass();
    }
}
