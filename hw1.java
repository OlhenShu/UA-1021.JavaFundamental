import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.
        System.out.println("Enter radius of flower bed:");
        double r = scanner.nextDouble();
        double perimeter = Math.PI * 2 * r;
        double area = Math.PI * r * r;
        System.out.printf("Flower bed perimeter: %.2f; radius: %.2f", perimeter, area);

        // 2.
        String name;
        String address;
        System.out.println("\nWhats you name?");
        name = scanner.nextLine(); //пропускає цю операцію
        name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        address = scanner.nextLine();
        System.out.println("Your name is " + name + ". Your address is " + address);

        // 3.
        System.out.println("Enter first cost per minute:");
        double c1 = scanner.nextDouble();
        System.out.println("Enter second cost per minute:");
        double c2 = scanner.nextDouble();
        System.out.println("Enter third cost per minute:");
        double c3 = scanner.nextDouble();
        System.out.println("Enter first call duration in minute:");
        int t1 = scanner.nextInt();
        System.out.println("Enter second call duration in minute:");
        int t2 = scanner.nextInt();
        System.out.println("Enter third call duration in minute:");
        int t3 = scanner.nextInt();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double total = cost1 + cost2 + cost3;
        System.out.printf("First call cost: %.2f, second call cost: %.2f, third call cost: %.2f. Total cost: %.2f", cost1, cost2, cost3, total);
        scanner.close();
    }
}
