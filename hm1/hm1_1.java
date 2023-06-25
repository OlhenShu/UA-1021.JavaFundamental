package hm1;

import java.util.Scanner;

public class hm1_1 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Як тебе звуть?");
            String name = scanner.nextLine();

            System.out.println("Де мешкаєш, " + name + "?");
            String address = scanner.nextLine();

            System.out.println("інформація:");
            System.out.println("Ім'я: " + name);
            System.out.println("Адреса : " + address);
        }
    }


