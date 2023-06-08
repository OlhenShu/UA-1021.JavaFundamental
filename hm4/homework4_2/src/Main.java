import java.util.Scanner;

class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Введіть 1 число: ");
        int num1 = input.nextInt();

        System.out.print("Введіть 2 число: ");
        int num2 = input.nextInt();

        System.out.print("Введіть 3 число: ");
        int num3 = input.nextInt();


        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));

        System.out.println("Максимальне значення: " + max);
        System.out.println("Мінімальне значення: " + min);
    }
}