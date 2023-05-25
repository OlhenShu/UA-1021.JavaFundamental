import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Радіус клумби: ");
        double radius = scanner.nextDouble();

        double pr = 2 * Math.PI * radius;
        double pl = Math.PI * radius * radius;

        System.out.println("Периметр клумби: " + pr);
        System.out.println("Площа клумби: " + pl);
    }
}