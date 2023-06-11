package hw6.task1;

public class Kiwi extends NonFlyingBird {
	private String feathers = "vestigial";
	private int layEggs = 1;
	private String name = "Kiwi";

	public void fly() {
		super.fly();
		System.out.println("running...");
	}

	public void outputInfo() {
		System.out.println("type: non-flying bird" + "\nname: " + this.name + "\nfeathers type: " + this.feathers + "\namount of eggs to lay: "
				+ this.layEggs);
	}
}
