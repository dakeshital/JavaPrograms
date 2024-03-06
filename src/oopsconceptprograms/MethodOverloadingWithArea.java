package oopsconceptprograms;

public class MethodOverloadingWithArea {
	public double calculateArea(double radius) {
		return (3.14 * radius * radius); // Math.PI
	}

	public double calculateArea(double length, double width) {
		return length * width;
	}

	public int calculateArea(int sideLength) {
		return sideLength * sideLength;
	}

	public static void main(String[] args) {
		MethodOverloadingWithArea shape = new MethodOverloadingWithArea();

		double circleArea = shape.calculateArea(5.0);
		System.out.println("Area of Circle: " + circleArea);

		double rectangleArea = shape.calculateArea(4.0, 6.0);
		System.out.println("Area of Rectangle: " + rectangleArea);

		int squareArea = shape.calculateArea(4);
		System.out.println("Area of Square: " + squareArea);
	}

}
