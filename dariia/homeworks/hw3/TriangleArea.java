import java.util.Scanner;
import java.lang.Math;

class Triangle {
	private int side1;
	private int side2;
	private int side3;

	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getArea() {
		// find half-perimeter p
		// S = sqrt(p*(p - a)*(p - b)*(p-c)), where a = side1, b = side2, c = side3
		double area;
		double halfPerimeter = (double)(this.side1 + this.side2 + this.side3) / 2;

		area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
		return area;
	}
}

class TriangleArea{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println("Please, input sides of triangle to calculate it's area: ");
		System.out.println("first side = ");
		int side1 = sc.nextInt();
		System.out.println("second side = ");
		int side2 = sc.nextInt();
		System.out.println("third side = ");
		int side3 = sc.nextInt();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		double triangleArea = triangle.getArea();
		
		System.out.printf("Area of the triangle equals %.2f", triangleArea);
	}
}