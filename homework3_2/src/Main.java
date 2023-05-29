import java.util.Scanner;

class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть 1 число:");
        int number1 = scanner.nextInt();

        System.out.println("Введіть 2 число:");
        int number2 = scanner.nextInt();

        System.out.println("Введіть 3 число:");
        int number3 = scanner.nextInt();

        int smallestNumber = findSmallestNumber(number1, number2, number3);
        System.out.println("Найменше число: " + smallestNumber);
    }

    public static int findSmallestNumber(int number1, int number2, int number3) {
        int smallest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        return smallest;
    }
}