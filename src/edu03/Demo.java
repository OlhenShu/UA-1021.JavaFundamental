package edu03;

import java.awt.Rectangle;

public class Demo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(25, 10);
        System.out.println("Before calling method 'swap': width = " + rectangle.width + ", height = " + rectangle.height);
        swap(rectangle);
        System.out.println("After calling method 'swap': width = " + rectangle.width + ", height = " + rectangle.height);
    }

    public static void swap(Rectangle rect) {
        int temp = rect.width;
        rect.width = rect.height;
        rect.height = temp;
        System.out.println("Inside the method 'swap': width = " + rect.width + ", height = " + rect.height);
    }
}


