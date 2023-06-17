package hw7.task2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    void land() {
        System.out.println("Plane is landing");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
