package hw7.task2;

public class Boat extends WaterVehicle {

	private int volume;

	public Boat() {
		super();
	}

	public Boat(int volume, int passengers) {
		super(passengers);
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	void isSailing() {
		if (passengers != 1) {
			System.out
					.println("boat can't sail without sailor or with more then 1 person! change amount of passengers.");
		}
		System.out.println("boat is sailing~");
	}

}
