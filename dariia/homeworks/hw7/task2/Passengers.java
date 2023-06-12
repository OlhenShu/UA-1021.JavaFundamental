package hw7.task2;

public abstract class Passengers {
	int passengers;

	public Passengers() {
	}

	public Passengers(int passengers) {
		this.passengers = passengers;
	}

	public int getPassengers() {
		return this.passengers;
	};

	void setPassengers(int passengers) {
		this.passengers = passengers;
	};
}
