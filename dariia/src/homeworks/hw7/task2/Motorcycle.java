package hw7.task2;

public class Motorcycle extends GroundVehicle {

	private int maxSpeed;

	public Motorcycle() {
		super();
	}

	public Motorcycle(int maxSpeed, int passengers) {
		super(passengers);
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	void drive() {
		if (passengers < 1 || passengers > 2) {
			System.out.println("you need at least one passenger or no more than two people in total!");
		} else {
			System.out.println("driving~");
		}
	}

}
