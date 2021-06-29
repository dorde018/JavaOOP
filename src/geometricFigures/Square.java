package geometricFigures;

public  class Square extends GeometricFigure {
	private double sideOfTheSquare;
	public Square(double sideOfTheSquare) {
		super();
		this.sideOfTheSquare = sideOfTheSquare;
	}
	public double getSideOfTheSquare() {
		return sideOfTheSquare;
	}
	public void setSideOfTheSquare(double sideOfTheSquare) {
		this.sideOfTheSquare = sideOfTheSquare;
	}
	@Override
	public double area() {
		return  sideOfTheSquare * sideOfTheSquare;
	}
	@Override
	public double circumference() {
		return 4 * sideOfTheSquare;
	}

}
