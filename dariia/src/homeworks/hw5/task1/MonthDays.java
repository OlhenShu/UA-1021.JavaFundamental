package homeworks.hw5.task1;

public class MonthDays {
	private static String[] monthDays = { "31 (January)", "28 (February)", "31 (March)", "30 (April)", "31 (May)",
			"30 (June)", "31 (July)", "31 (August)", "30 (September)", "31 (October)", "30 (November)",
			"31 (December)" };

	public static String calculateDays(int monthNum) {
		System.out.println("the number of days is: " + monthDays[monthNum - 1]);
		return monthDays[monthNum - 1];
	}
}