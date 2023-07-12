package hw7.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
	public FlyingVehicle() {
	}
	
	public FlyingVehicle(int passengers) {
		super(passengers);
	}
	
	abstract void fly();
	abstract void land();
}