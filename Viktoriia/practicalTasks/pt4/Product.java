package Viktoriia.practicalTasks.pt4;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of the product:");
        this.name = scanner.nextLine();
        System.out.println("Input price of " + this.name + ":");
        this.price = scanner.nextDouble();
        System.out.println("Input quantity of " + this.name + ":");
        this.quantity = scanner.nextInt();
    }

    public static void main(String[] args) {
        Product one = new Product();
        Product two = new Product();
        Product three = new Product();
        Product four = new Product();
        Product mostExpensive = one;
        if (mostExpensive.price < two.price) {
            mostExpensive = two;
        }
        if (mostExpensive.price < three.price) {
            mostExpensive = three;
        }
        if (mostExpensive.price < four.price) {
            mostExpensive = four;
        }
        System.out.println("The most expensive item is '" + mostExpensive.name + "' and its quantity is " + mostExpensive.quantity);

        Product biggestQuantity = one;
        if (biggestQuantity.quantity < two.quantity) {
            biggestQuantity = two;
        }
        if (biggestQuantity.quantity < three.quantity) {
            biggestQuantity = three;
        }
        if (biggestQuantity.quantity < four.quantity) {
            biggestQuantity = four;
        }
        System.out.println("'" + biggestQuantity.name + "' has the biggest quantity");
    }
}
