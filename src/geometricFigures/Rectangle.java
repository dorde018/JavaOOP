package geometricFigures;

public class Rectangle extends GeometricFigure {
	private double sideA;
	private double sideB;
	public Rectangle(double sideA, double sideB) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
	}
	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	@Override
	public double area() {
		return sideA * sideB;
	}
	@Override
	public double circumference() {
		return (2 * sideA) + (2 * sideB);
	}
	
}
