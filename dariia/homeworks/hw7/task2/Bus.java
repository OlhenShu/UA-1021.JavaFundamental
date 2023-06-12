package hw7.task2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Bus extends GroundVehicle {
	private String route;
	private int timeToDrive;

	public Bus() {
		super();
	}

	public Bus(String route, int passengers, int timeToDrive) {
		super(passengers);
		this.route = route;
		this.setTimeToDrive(timeToDrive);
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public int getTimeToDrive() {
		return timeToDrive;
	}

	public void setTimeToDrive(int timeToDrive) {
		this.timeToDrive = timeToDrive;
	}

	@Override
	void drive() {
		if (passengers < 1 || passengers > 40) {
			System.out.println("you need at least one passenger or no more than 40 people in total!");
		} else {
			ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
			System.out.println("driving~");
			executor.schedule(() -> {
				System.out.println("Arrived to the destination!"); // Code to be executed after the specified delay
			}, timeToDrive, TimeUnit.SECONDS); // Schedule the task to run after 10 seconds
		}
	}

}
