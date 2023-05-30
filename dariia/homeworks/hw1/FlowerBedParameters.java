package hw1;

import java.util.Scanner;
import java.lang.Math;

class FlowerBedParameters{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        double pi = Math.PI;
        System.out.println("please, input radius of the flower bed to calculate its area and radius:");
        int radius = sc.nextInt();
        double area = (double) 2*pi*radius;
        double perimeter= (double) pi*(radius^2);
        System.out.printf("perimeter equals %.2f\n", perimeter);
        System.out.printf("area equals %.2f", area);
    }
}