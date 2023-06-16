package pt6.task1;
//Task1
//uncomment code
public abstract class Computer {
    public static String brand = "Generic";

    public abstract void turnOn();

    public abstract void shutDown();

    static void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}
