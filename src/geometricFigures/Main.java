package geometricFigures;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		EquilateralTriangle e1 = new EquilateralTriangle(5);
		EquilateralTriangle e2 = new EquilateralTriangle(7);
		EquilateralTriangle e3 = new EquilateralTriangle(9);
		Rectangle r1 = new Rectangle(3, 5);
		Rectangle r2 = new Rectangle(2, 5);
		Rectangle r3 = new Rectangle(4, 7);
		Square s1 = new Square(5);
		Square s2 = new Square(7);
		Square s3 = new Square(8);
		
		ArrayList <GeometricFigure> theListOfTheFigures =  new ArrayList<GeometricFigure>();
		theListOfTheFigures.add(e1);
		theListOfTheFigures.add(e2);
		theListOfTheFigures.add(e3);
		theListOfTheFigures.add(r1);
		theListOfTheFigures.add(r2);
		theListOfTheFigures.add(r3);
		theListOfTheFigures.add(s1);
		theListOfTheFigures.add(s2);
		theListOfTheFigures.add(s3);
		
		double sumOfTheAreas = 0;
		double sumOfTheCircumferences = 0;
		for (int i = 0; i < theListOfTheFigures.size(); i++) {
			sumOfTheAreas += theListOfTheFigures.get(i).area();
			sumOfTheCircumferences += theListOfTheFigures.get(i).circumference();
			theListOfTheFigures.get(i).print();
			System.out.println("---------------------------------");
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("The sum of the areas of all the figures is: " + sumOfTheAreas + "m2");
		System.out.println("The sum of the circumferences of all the figures is: " + sumOfTheCircumferences + "m");
		System.out.println("------------------------------------------------------------");
	
	}
}
