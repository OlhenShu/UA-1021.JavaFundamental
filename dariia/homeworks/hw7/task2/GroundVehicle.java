package hw7.task2;

public abstract class GroundVehicle extends Passengers implements Vehicle {
	public GroundVehicle() {
	}
	
	public GroundVehicle(int passengers) {
		super(passengers);
	}

	abstract void drive();
}
