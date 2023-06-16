package pt6.task2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Truck("some truck", 120, 2015),
                new Truck("other model", 150, 2000),
                new Sedan("some sedan", 190, 2003),
                new Sedan("one sedan", 220, 2009),
                new Truck("truck model", 170, 2020)};
        for (Car car: cars) {
            System.out.println(car.toString());
        }
    }
}