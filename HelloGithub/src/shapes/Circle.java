package Shapetest;

public class Circle implements ShapeInterface {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * (radius * radius);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

}
