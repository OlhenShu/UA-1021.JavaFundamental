package hm3oop;

 import java.util.Scanner;

public class hm3_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("перше число:");
        int n1 = scanner.nextInt();
        System.out.println("друге число:");
        int n2 = scanner.nextInt();
        System.out.println("третє число:");
        int n3 = scanner.nextInt();
        int smallestNumber = findSmallestNumber(n1, n2, n3);
        System.out.println("Найменше число: " + smallestNumber);
    }

    public static int findSmallestNumber(int n1, int n2, int n3) {
        int smallest = n1;
        if (n2 < smallest) {
            smallest = n2;
        }
        if (n3 < smallest) {
            smallest = n3;
        }
        return smallest;
    }
}

