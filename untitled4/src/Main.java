import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вартість 1 за хвилину: ");
        int c1 = scanner.nextInt();
        System.out.println("Вартість 2 за хвилину: ");
        int c2 = scanner.nextInt();
        System.out.println("Вартість 3 за хвилину: ");
        int c3 = scanner.nextInt();

        System.out.println("Тривалість 1: ");
        int t1 = scanner.nextInt();
        System.out.println("Тривалість 2: ");
        int t2 = scanner.nextInt();
        System.out.println("Тривалість 3: ");
        int t3 = scanner.nextInt();

        int price1 = c1 * t1;
        int price2 = c2 * t2;
        int price3 = c3 * t3;

        int price_all = price1 + price2 + price3;

        System.out.println("Ціна за 1 дзвінок: " + price1);
        System.out.println("Ціна за 2 дзвінок: " + price2);
        System.out.println("Ціна за 3 дзвінок: " + price3);
        System.out.println("Загальна ціна: " + price_all);
    }
}