import java.util.Scanner;

class SumOrProductCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Введіть 10 чисел: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int result;

        if (numbers[0] >= 0 && numbers[1] >= 0 && numbers[2] >= 0 && numbers[3] >= 0 && numbers[4] >= 0) {
            result = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        } else {
            result = numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
        }

        System.out.println("Резульат: " + result);
    }
}