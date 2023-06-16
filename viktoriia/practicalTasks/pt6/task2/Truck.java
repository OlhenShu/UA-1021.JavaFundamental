package pt6.task2;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void run() {
        System.out.println("Truck runs");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }

    @Override
    public String toString() {
        return "Truck info: model " + model + ", max speed: " + maxSpeed + ", year of production: " + yearOfProduction +
                '.';
    }
}
