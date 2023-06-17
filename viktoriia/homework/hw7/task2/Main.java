package hw7.task2;

public class Main {
    public static void main(String[] args) {
        Liner liner = new Liner(9, 3);
        Plane plane = new Plane(7, 8);
        Car car = new Car(3, "x");
        Boat boat = new Boat(9, 6);
        Motorcycle motorcycle = new Motorcycle(1, 200);
        Bus bus = new Bus(9, "a-t");
        Helicopter helicopter = new Helicopter(5, 6, 600);
        liner.isSailing();
        boat.isSailing();
        plane.fly();
        plane.land();
        helicopter.fly();
        helicopter.land();
        bus.drive();
        motorcycle.drive();
        car.drive();
    }
}
