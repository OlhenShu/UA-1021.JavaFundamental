package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private int engineCapacity;
    static Scanner scanner = new Scanner(System.in);

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String toString() {
        return ("Type: " + type + ". Year of production: " + yearOfProduction + ". Engine capacity: " + engineCapacity + ".");
    }

    public static void main(String[] args) {
        Car[] cars = {new Car("sedan", 2001, 100),
                new Car("crossover", 2010, 180),
                new Car("suv", 2003, 90),
                new Car("crossover", 2010, 110)};
        System.out.println("Enter year of production of car you want to get info about:");
        int searchYear = scanner.nextInt();
        for (Car car: cars) {
            if (car.getYearOfProduction() == searchYear) {
                System.out.println(car.toString());
            }
        }
        for(int i = 0; i < cars.length; i++) {
            for(int j = i+1; j < cars.length; j++) {
                if(cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        System.out.println("Cars sorted by year of production: ");
        for (Car car: cars) {
            System.out.println(car.toString());
        }
    }
}
