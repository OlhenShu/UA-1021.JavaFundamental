package hw7.task2;

public class Liner extends WaterVehicle {
	private int floors;

	public Liner() {
		super();
	}

	public Liner(int floors, int passengers) {
		super(passengers);
		this.floors = floors;

	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	@Override
	void isSailing() {
		if (passengers <= 600 && passengers > 0) {
			System.out.println("liner is sailing~");
		} else {
			System.out.println("liner can't sail: to many passengers! number cannot exceed 600.");
		}
	}

}
