package hw6.task1;

public class Swallow extends FlyingBird {
	private String feathers = "pointed-elliptical";
	private int layEggs = 5;
	private String name = "Swallow";

	public void fly() {
		super.fly();
	}

	public void outputInfo() {
		System.out.println("type: flying bird" + "\nname: " + this.name + "\nfeathers type: " + this.feathers
				+ "\namount of eggs to lay: " + this.layEggs);
	}
}
