import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Person {
	private static Scanner innerSc = new Scanner(System.in);

	private String firstName;
	private String lastName;
	private int birthYear;
	Date date = new Date();
	LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	int year = localDate.getYear();

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	};

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public int getAge() {
		return this.year - this.birthYear;
	}

	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void input() {
		System.out.print("First name: ");
		this.firstName = innerSc.nextLine();
		System.out.print("Last name: ");
		this.lastName = innerSc.nextLine();
		System.out.print("Birth year: ");
		this.birthYear = innerSc.nextInt();
		innerSc.nextLine();
	}

	public void output() {
		System.out.println(
				"First name: " + this.firstName + "\nLast name: " + this.lastName + "\nBirthYear: " + this.birthYear);
	}
}

public class Main{
	public static void main(String args[]) {
		Person person1 = new Person();
		System.out.println("Please, input your data for person 1");
		person1.input();
		Person person2 = new Person();
		System.out.println("Please, input your data for person 2");
		person2.input();
		Person person3 = new Person();
		System.out.println("Please, input your data for person 3");
		person3.input();
		Person person4 = new Person();
		System.out.println("Please, input your data for person 4");
		person4.input();
		Person person5 = new Person();
		System.out.println("Please, input your data for person 5");
		person5.input();
		
	}
}