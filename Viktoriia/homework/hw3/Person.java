package Viktoriia.homework.hw3;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(){
        int year = Year.now().getValue();
        return year - birthYear;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter the birthday year: ");
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("The first name is " + firstName + ", the last name is " + lastName + ", the age is " + getAge());
    }

    public void changeName(String...name){
        this.firstName = name[0];
        if(name[1] != null) {
            this.lastName = name[1];
        }
    }

    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
        Person three = new Person();
        Person four = new Person();
        Person five = new Person();
        System.out.println("Enter the info for person one:");
        one.input();
        System.out.println("Enter the info for person two:");
        two.input();
        System.out.println("Enter the info for person three:");
        three.input();
        System.out.println("Enter the info for person four:");
        four.input();
        System.out.println("Enter the info for person five:");
        five.input();

        one.output();
        two.output();
        three.output();
        four.output();
        five.output();

    }
}
