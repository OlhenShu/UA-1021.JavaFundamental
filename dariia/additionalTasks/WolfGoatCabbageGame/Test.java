package WolfGoatCabbageGame;

public class Test {


	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 2; i <= 12; i += 2) {
			if (i%3 == 0) continue;
			if (i==8) break;
			sum += i;
		}
		
		System.out.println("sum = " + sum);
	}
}
