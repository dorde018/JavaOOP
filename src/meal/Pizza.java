package meal;

import java.util.ArrayList;

public class Pizza {
	private String theNameOfThePizza;
	private ArrayList<Ingredient> listOfTheIngredients;
	
	public Pizza(String theNameOfThePizza) {
		listOfTheIngredients = new ArrayList<Ingredient>();
		this.theNameOfThePizza = theNameOfThePizza;
	}
	public String getTheNameOfThePizza() {
		return theNameOfThePizza;
	}
	public void addIngredient(Ingredient ingredientName) {
		this.listOfTheIngredients.add(ingredientName);
	}
	
	public void removeIngredient(String ingredientName) {
		for (int i = 0; i < this.listOfTheIngredients.size(); i++) {
			if(this.listOfTheIngredients.get(i).getName().equals( ingredientName)) {
				listOfTheIngredients.remove(i);
			}
		}	
	}
	
	public double countPriceOfThePizza() {
		double priceOfAllTheIngredients = 0;
		for (int i = 0; i < listOfTheIngredients.size(); i++) {
			priceOfAllTheIngredients += listOfTheIngredients.get(i).getPrice();
		}
		return priceOfAllTheIngredients + 5;
	}
	
	public void detailsOfThePizza() {
		System.out.println("Pizza " + theNameOfThePizza + " ingredients list: \n");
		for (int i = 0; i < listOfTheIngredients.size(); i++) {
			listOfTheIngredients.get(i).ingredientDetails();
		}
		System.out.println("\nThe price of the Pizza " + theNameOfThePizza + " is: " + countPriceOfThePizza() + " eur.");
		System.out.println("-------------------------------------------------------");
		System.out.println("-------------------------------------------------------");
	}
}
