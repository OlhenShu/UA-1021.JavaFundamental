import java.util.Scanner;

class ArrayOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Введіть 5 чисел:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int secondPositiveIndex = -1;
        int min = numbers[0];
        int minIndex = 0;
        int evenProduct = 1;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                if (secondPositiveIndex == -1) {
                    secondPositiveIndex = i;
                }
            }

            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }

            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                evenProduct *= numbers[i];
            }
        }

        System.out.println("Позиція другого додатного числа: " + secondPositiveIndex);
        System.out.println("Мінімальне значення: " + min);
        System.out.println("Добуток парних чисел: " + evenProduct);
    }
}