import java.util.Scanner;

class SumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String choice;

        do {
            System.out.print("Введіть 1 число: ");
            int num1 = input.nextInt();

            System.out.print("Введіть 2 число: ");
            int num2 = input.nextInt();

            int sum = num1 + num2;
            System.out.println("Сума: " + sum);

            System.out.print("Хочете повторити операцію? (yes/no): ");
            choice = input.next();
        } while (choice.equalsIgnoreCase("yes"));
    }
}