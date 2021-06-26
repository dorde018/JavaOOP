package bill;

import java.util.ArrayList;

public abstract class Beverage {
	private String name;
	private ArrayList<Ingredient> listOfTheIngredients;
	
	public Beverage(String name) {
		super();
		this.name = name;
		this.listOfTheIngredients = new ArrayList<Ingredient>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Ingredient> getListOfTheIngredients() {
		return listOfTheIngredients;
	}

	public void setListOfTheIngredients(ArrayList<Ingredient> listOfTheIngredients) {
		this.listOfTheIngredients = listOfTheIngredients;
	}

	public void addIngredient(Ingredient name) {
		getListOfTheIngredients().add(name);
	}
	public double priceOfAllIngredients() {
		double sumOfThePricesOfTheAllIngredients = 0;
		for (int i = 0; i < listOfTheIngredients.size(); i++) {
			sumOfThePricesOfTheAllIngredients += listOfTheIngredients.get(i).priceOfTheIngredients();
		}
		return sumOfThePricesOfTheAllIngredients;
	}
	public abstract double priceOfTheBeverage();
	public abstract void print();
}
