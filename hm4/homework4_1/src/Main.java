import java.util.Scanner;

class NumberRangeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть 1 число: ");
        float number1 = scanner.nextFloat();

        System.out.print("Введіть 2 число: ");
        float number2 = scanner.nextFloat();

        System.out.print("Введіть 3 число: ");
        float number3 = scanner.nextFloat();

        if (isInRange(number1) && isInRange(number2) && isInRange(number3)) {
            System.out.println("Усі числа в заданому діапазоні!");
        } else {
            System.out.println("Щось пішло не так!!!");
        }
    }

    public static boolean isInRange(float number) {
        return number >= -5.0f && number <= 5.0f;
    }
}