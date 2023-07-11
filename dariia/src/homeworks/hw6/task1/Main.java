package hw6.task1;

public class Main {
	public static void main(String[] args) {
		
		Eagle eagle = new Eagle();
		Swallow swallow = new Swallow();
		Penguin penguin = new Penguin();
		Kiwi kiwi = new Kiwi();
		
		Bird[] birds = {eagle, swallow, penguin, kiwi};
		
		for (Bird bird : birds) {
			bird.outputInfo();
			bird.fly();
			System.out.println();
		}
	}

}
