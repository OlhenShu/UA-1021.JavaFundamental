package hm1;

import java.util.Scanner;

public class hm1_1_1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ціна першого виклику(за хвилину часу): ");
            byte c1 = scanner.nextByte();
            System.out.print("Тривалість виклику: ");
            byte t1 = scanner.nextByte();
            System.out.print("Ціна другого виклику(за хвилину часу): ");
            byte c2 = scanner.nextByte();
            System.out.print("Тривалість другого виклику: ");
            byte t2 = scanner.nextByte();
            System.out.print("Ціна третього виклику(за хвилину часу): ");
            byte c3 = scanner.nextByte();
            System.out.print("Тривалість третього виклику: ");
            byte t3 = scanner.nextByte();
            double cost1 = c1 * t1;
            double cost2 = c2 * t2;
            double cost3 = c3 * t3;
            double totalCost = cost1 + cost2 + cost3;
            System.out.println("Ціна 1го виклику(сумарно): " + cost1);
            System.out.println("Ціна 2го виклику(сумарно): " + cost2);
            System.out.println("Ціна 3го виклику(сумарно): " + cost3);
            System.out.println("Ціна за 3 виклики загалом: " + totalCost);
        }
    }


