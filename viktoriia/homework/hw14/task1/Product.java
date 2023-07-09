package hw14.task1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class Product {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private int price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, int price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    static int compareByPrice(Product p1, Product p2) {
        return p1.getPrice() - p2.getPrice();
    }

    @Override
    public String toString() {
        return "Manufacture category: " + manufactureCategory +", date of manufacture: " + dateOfManufacture + ", price: " + price;
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Laptop",LocalDate.of(2020, 10, 5), 3000),
                new Product("Tablet", LocalDate.of(2022, 4, 30), 2500),
                new Product("Tablet", LocalDate.of(2020, 7, 23), 2000),
                new Product("Phone", LocalDate.of(2023, 3, 4), 4000),
                new Product("Laptop", LocalDate.of(2023, 9, 17), 3500),  // 5
                new Product("Laptop", LocalDate.of(2022, 5, 20), 5500),
                new Product("Tablet", LocalDate.of(2021, 11, 5), 2000),
                new Product("Phone", LocalDate.of(2023, 1, 19), 3500),
                new Product("Phone", LocalDate.of(2020, 3, 31), 4000),
                new Product("Phone", LocalDate.of(2022, 6, 28), 3500),   // 10
                new Product("Phone", LocalDate.of(2021, 7, 8), 2500),
                new Product("Laptop", LocalDate.of(2021, 2, 22), 4000),
                new Product("Tablet", LocalDate.of(2020, 4, 15), 2500),
                new Product("Laptop", LocalDate.of(2023, 10, 29), 4500),
                new Product("Laptop", LocalDate.of(2022, 8, 8), 3000),  //15
                new Product("Phone", LocalDate.of(2020, 5, 24), 3500),
                new Product("Phone", LocalDate.of(2020, 10, 12), 2500),
                new Product("Laptop", LocalDate.of(2021, 11, 2), 3500),
                new Product("Tablet", LocalDate.of(2021, 4, 9), 4500),
                new Product("Tablet", LocalDate.of(2023, 2, 16), 3000));  // 20

        List<Product> filtredList = products.stream()
                .filter(x -> x.getManufactureCategory().equals("Phone"))
                .filter(x -> x.getPrice() > 3000)
                .filter(x -> x.getDateOfManufacture().plus(1, ChronoUnit.YEARS).isBefore(LocalDate.now()))
                .sorted(Product::compareByPrice)
                .toList();
        System.out.println("Filtered and sorted list: ");
        filtredList.forEach(System.out::println);
    }
}
