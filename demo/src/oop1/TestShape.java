package oop1;

abstract class Shape {
	private int x, y;

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	abstract int area();

}

class Circle extends Shape {
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	int area() {
		return (int) (Math.PI * this.radius * this.radius);
	}
}

class Square extends Shape {
	private int side;

	public Square(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}

	@Override
	int area() {
		return this.side * this.side;
	}
}

public class TestShape {

	public static void main(String[] args) {
		Shape s;

		s = new Circle(10, 20, 15);
		System.out.println(s.area());

		s = new Square(10, 10, 20);
		System.out.println(s.area());
	}

}
