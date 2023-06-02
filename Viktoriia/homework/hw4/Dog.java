package Viktoriia.homework.hw4;

import java.util.Scanner;

enum Breeds {
    SHEPHERD("shepherd"), BULLDOG("bulldog"), RETRIEVER("retriever"), HUSKY("husky"), CORGI("corgi");
    private String name;

    Breeds(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Dog {
    private String name;
    private Breeds breed;
    private int age;
    private static int count = 0;

    public Dog() {
        count++;
        Scanner scanner = new Scanner(System.in);
        String dogName;
        Breeds dogBreed;
        int dogAge;
        System.out.println("Input a name of the dog number " + count + ":");
        dogName = scanner.nextLine();
        System.out.println("Input age of " + dogName + ":");
        while ((dogAge = scanner.nextInt()) < 0) {
            System.out.println("Please, input correct age:");
        }
        System.out.println("Input breed of " + dogName + ":");
        scanner.nextLine();
        String name = "";
        boolean correct = false;
        while(!correct){
            switch (name = (scanner.nextLine().toUpperCase())) {
                case "SHEPHERD", "BULLDOG", "RETRIEVER", "HUSKY", "CORGI":
                    correct = true;
                    break;
                default:
                    correct = false;
                    System.out.println("Please input correct name of breed:");
            }
        }
        dogBreed = Breeds.valueOf(name);
        this.name = dogName;
        this.breed= dogBreed;
        this.age = dogAge;
    }
    public Dog(String name, Breeds breed, int age) {
        count++;
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog first = new Dog();
        Dog second = new Dog();
        Dog third = new Dog();
        if (first.name.equals(second.name) || first.name.equals(third.name) || second.name.equals(third.name)) {
            System.out.println("There are two dogs with the same name");
        } else {
            System.out.println("There are not two dogs with the same name");
        }
        Dog oldest = first;
        if(oldest.age < second.age) {
            oldest = second;
        }
        if (oldest.age < third.age) {
            oldest = third;
        }
        System.out.println("Name of the oldest dog is " + oldest.name + " and its breed is " + oldest.breed.getName());
    }
}
