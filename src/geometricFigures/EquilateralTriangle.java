package geometricFigures;

public class EquilateralTriangle extends GeometricFigure {
	private double sideOfTheEquilateralTriangle;

	public EquilateralTriangle(double sideOfTheEquilateralTriangle) {
		super();
		this.sideOfTheEquilateralTriangle = sideOfTheEquilateralTriangle;
	}

	public double getSideOfTheEquilateralTriangle() {
		return sideOfTheEquilateralTriangle;
	}

	public void setSideOfTheEquilateralTriangle(double sideOfTheEquilateralTriangle) {
		this.sideOfTheEquilateralTriangle = sideOfTheEquilateralTriangle;
	}

	@Override
	public double area() {
		return (sideOfTheEquilateralTriangle * sideOfTheEquilateralTriangle) * 1.73205 / 4;
	}

	@Override
	public double circumference() {
		return 3 * sideOfTheEquilateralTriangle;
	}
	
}
