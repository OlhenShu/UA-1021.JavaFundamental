package hw4;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//5.* Create a class called Dog that has the following fields: name, breed, age.
//	• Declare enum for field breed.
//	• In main() method create three instances of type Dog.
//	o Check if there are no two dogs with the same name;
//	o Output the name and the breed of the oldest dog.
enum DogBreeds {
	GERMAN_SHEPHERD("German shepherd"), GOLGEN_RETRIEVER("Golden Retriever"), BULLDOG("Bulldog"), BEAGLE("Beagle"),
	POODLE("Poodle"), ROTTWEILER("Rottweiler");

	private String breed;

	DogBreeds(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}
}

class Dog {

	private String name;
	private DogBreeds breed;
	private int age;

	public Dog() {
	}

	public Dog(String name, DogBreeds breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public DogBreeds getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(DogBreeds breed) {
		this.breed = breed;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class MyDogs {
	static Scanner sc = new Scanner(System.in);

	static void checkNames(String name1, String name2, String name3) {
		if (name1.equals(name2)) {
			System.out.println("first name " + name1 + " is the same as the second name " + name2);
		} else if (name1.equals(name3)) {
			System.out.println("first name " + name1 + " is the same as the third name " + name3);
		} else if (name1.equals(name3)) {
			System.out.println("second name " + name2 + " is the same as the third name " + name3);
		} else {
			System.out.println("no matching names");
		}
	}

	static void findOldest(int age1, int age2, int age3) {

	}

	public static void main(String args[]) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("Goofy", DogBreeds.GERMAN_SHEPHERD, 7);
		Dog dog3 = new Dog("Bobby", DogBreeds.GOLGEN_RETRIEVER, 10);

		System.out.println("insert yours dog data\nname:");
		String name = sc.nextLine();
		dog1.setName(name);
		System.out.println("age:");
		int age = sc.nextInt();
		dog1.setAge(age);
		System.out.println("now choose your breed:");
		int count = 1;
		for (DogBreeds breed : DogBreeds.values()) {
			System.out.println(count + " " + breed.getBreed());
			count++;
		}
		int option = sc.nextInt();
		DogBreeds breed = switch (option) {
		case 1 -> DogBreeds.GERMAN_SHEPHERD;
		case 2 -> DogBreeds.GOLGEN_RETRIEVER;
		case 3 -> DogBreeds.BULLDOG;
		case 4 -> DogBreeds.BEAGLE;
		case 5 -> DogBreeds.POODLE;
		case 6 -> DogBreeds.ROTTWEILER;
		default -> throw new IllegalArgumentException("Unexpected value: " + option);
		};
		dog1.setBreed(breed);

		Dog oldestDog = null;
		int maxAge = 0;
		checkNames(dog1.getName(), dog2.getName(), dog3.getName());

		List<Dog> dogs = new ArrayList<Dog>(List.of(dog1, dog2, dog3));
		System.out.println("all dogs:");
		for (Dog dog : dogs) {
			System.out.println(dog.getName() + " | " + dog.getAge() + " " + " (" + dog.getBreed() + ")");
		}
		
		for (Dog dog : dogs) {
			if (dog.getAge() >= maxAge) {
				oldestDog = dog;
			}
		}
		if (oldestDog != null) {
			System.out.println("\nOldest Dog: " + oldestDog.getName() + " (" + oldestDog.getBreed() + ")");
		} else {
			System.out.println("No dogs found.");
		}
	}
}