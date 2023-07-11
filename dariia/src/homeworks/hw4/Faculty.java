package hw4;

import java.util.Scanner;

//4.* Create a class called Faculty and input the information about the number of students (using the console) and the current season (using enum). 
// 		Each season must have a name in English (use the constructor). 
// 		In main() method, check the correct operation of the code.
enum Season {
	WINTER("Winter"), SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn"), UNDEFINED("Undefined");

	private String season;

	private Season(String season) {
		this.season = season;
	}

	public String getSeason() {
		return season;
	}
}

public class Faculty {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		try {
			System.out.print("please, insert the number of students in faculty: ");
			int numSt = sc.nextInt();
			sc.nextLine();
			System.out.print("insert current season: ");
			String seasonName = sc.nextLine().toLowerCase();
			Season season = switch (seasonName) {
			case "winter" -> Season.WINTER;
			case "summer" -> Season.SUMMER;
			case "autumn" -> Season.AUTUMN;
			case "spring" -> Season.SPRING;
			default -> Season.UNDEFINED;
			};
			System.out.println(
					"faculty data: \nnumber of sudentos: " + numSt + "\ncurrent season: " + season.getSeason());
		} catch (Exception e) {
			System.out.println("Exception occured: " + e);
		}
	}
}