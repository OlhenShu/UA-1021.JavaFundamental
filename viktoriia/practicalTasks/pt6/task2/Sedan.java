package pt6.task2;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void run() {
        System.out.println("Sedan runs");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopped");
    }
    @Override
    public String toString() {
        return "Sedan info: model " + model + ", max speed: " + maxSpeed + ", year of production: " + yearOfProduction +
                '.';
    }
}
