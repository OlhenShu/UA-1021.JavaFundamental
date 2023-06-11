package hw6.task1;

public class Eagle extends FlyingBird {
	private String name = "Eagle";
	private String feathers = "broad-winged";
	private int layEggs = 3;

	public void fly() {
		super.fly();
	}

	public void outputInfo() {
		System.out.println("type: flying bird" + "\nname: " + this.name + "\nfeathers type: " + this.feathers
				+ "\namount of eggs to lay: " + this.layEggs);
	}

}
