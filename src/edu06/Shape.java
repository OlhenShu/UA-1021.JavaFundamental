package edu06;

public abstract class Shape {    // because this is an abstract method 
    // the body will be blank
    public abstract double getArea();
}

abstract class Square extends Shape {
// class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }
    public int getPerimeter() {
        return (int) (4 * side);
    }

//    @Override
//    public double getArea() {
//        return Math.pow(side, 2);
//    }
}

class Parallelogram extends Shape {
    private final int width;
    private final int height;
    private final int angle;

    public Parallelogram(int width, int height, int angle) {
        this.width = width;
        this.height = height;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return (width * height * Math.sin(angle * Math.PI / 180));
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getAngle() {
        return angle;
    }
}
