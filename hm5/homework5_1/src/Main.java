import java.util.Scanner;

class MonthDaysCalculator {
    public static void main(String[] args) {
        int[] daysInEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);

        System.out.print("Назва місяця: ");
        int monthNumber = input.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Неправильне значення");
        } else {
            int daysInMonth = daysInEachMonth[monthNumber - 1];
            System.out.println("Ксть днів в цьому місяці: " + daysInMonth);
        }
    }
}

