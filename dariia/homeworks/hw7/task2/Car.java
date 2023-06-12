package hw7.task2;

public class Car extends GroundVehicle {
	private String model;
	private int amountOfSits;

	public Car() {
		super();
	}

	public Car(String model, int amountOfSits, int passengers) {
		super(passengers);
		this.model = model;
		this.amountOfSits = amountOfSits;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public int getAmountOfSits() {
		return amountOfSits;
	}

	public void setAmountOfSits(int amountOfSits) {
		this.amountOfSits = amountOfSits;
	}

	@Override
	void drive() {
		if (passengers < 1 || passengers > 5) {
			if (amountOfSits == 2) {
				System.out.println("you need at least one passenger or no more than two people in total!");				
			} else if (amountOfSits == 5) {
				System.out.println("you need at least one passenger or no more than five people in total!");	
			} else {
				System.out.println("invalid number of sits. fix the data given");	
			}
		} else {
			System.out.println("driving~");
		}
	}
}
