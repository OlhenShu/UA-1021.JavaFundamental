package hw7.task2;

public class Helicopter extends FlyingVehicle {
	private int weight;
	private int maxHeight;
	private int currHeight = 0;

	public Helicopter() {
		super();
	}

	public Helicopter(int weight, int maxHeight, int passengers) {
		super(passengers);
		this.weight = weight;
		this.maxHeight = maxHeight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	@Override
	void fly() {
		if (currHeight >= maxHeight) {
			System.out.println("max height reached");
			land();
		} else {
			if (weight <= 700 && (passengers > 0 && passengers <= 3)) {
				while (currHeight < maxHeight) {
					System.out.println("lifting up~");
					currHeight += 50;
				}
				System.out.println("max height reached");
			} else {
				System.out.println("max weight to lift is 700 kg and passengers must be from 1 to 3."
						+ "\nplease remove something and reduce weight of the helicopter or change amount of passengers.");
			}
		}
	}

	@Override
	void land() {
		if (currHeight <= 0) {
			System.out.println("you are on the ground now~");
		} else {
			while (currHeight > 0) {
				System.out.println("lifting down...");
				currHeight -= 50;
			}
		}

	}

}
