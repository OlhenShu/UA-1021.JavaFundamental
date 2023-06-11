package hw6.task1;

public class Penguin extends NonFlyingBird {
	private String feathers = "flipper-like";
	private int layEggs = 2;
	private String name = "Penguin";

	public void fly() {
		super.fly();
		System.out.println("swimming...");
	}

	public void outputInfo() {
		System.out.println("type: non-flying bird" + "\nname: " + this.name + "\nfeathers type: " + this.feathers
				+ "\namount of eggs to lay: " + this.layEggs);
	}
}
