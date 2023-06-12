package hw7.task2;

public class Plane extends FlyingVehicle {
	private int maxDistance;
	private int currDistance;

	public Plane() {
		super();
	}

	public Plane(int maxDistance, int passengers) {
		super(passengers);
		this.maxDistance = maxDistance;
	}

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	@Override
	void fly() {
		if (passengers < 1 || passengers > 60) {
			System.out
					.println("in the plane there cannot be nobody or more than 60 people in total before lifting up!");
		} else {
			if (currDistance >= maxDistance) {
				System.out.println("max distance reached, landing...");
				land();
			} else {
				System.out.println("going up in the air~");
				while (currDistance < maxDistance) {
					currDistance += 50;
				}
			}
		}
	}

	@Override
	void land() {
		if (currDistance <= 0) {
			System.out.println("landed~");
		} else {
			while (currDistance > 0) {
				System.out.println("landing...");
				currDistance -= 50;
			}
		}
	}

}
