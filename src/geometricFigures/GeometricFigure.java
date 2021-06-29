package geometricFigures;

public abstract class GeometricFigure {
	
	public abstract double area();
	public abstract double circumference();
	public void print() {
		System.out.println("The area is: " + this.area() + "m2");
		System.out.println("The circumference is: " + this.circumference() + "m");
	}
}
