import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваше ім'я: ");
        String name = scanner.nextLine();
        System.out.println("Ваша адреса" + " " + name + ":" );
        String addres = scanner.nextLine();
        System.out.println("Ваше ім'я: " + name);
        System.out.println("Ваша адресса: " + addres);
    }
}