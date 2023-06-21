package hw8;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Ted", "Miller"), 19, 2);
        Student student2 = new Student(new FullName("Emma", "Smith"), 21, 4);
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());
        try {
            Student student3 = (Student) student1.clone();
            student3.setCourse(5);
            student3.fullName.setLastName("Garrison");  //Check for right cloning
            System.out.println(student3.info());
            System.out.println(student1.info());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
