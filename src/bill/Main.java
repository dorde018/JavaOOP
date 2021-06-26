package bill;

public class Main {

	public static void main(String[] args) {
		Ingredient lemon = new Ingredient("Lemon", 95, 0.002);
		Ingredient milk = new Ingredient("Milk", 100, 0.01);
		Ingredient whippedCream = new Ingredient("Whipped cream", 15, 0.019);
		Ingredient rum = new Ingredient("Rum" , 100, 0.23);
		Ingredient vodka = new Ingredient("Vodka", 100, 0.17);
		Ingredient squeezedOrange = new Ingredient("Squeezed orange", 110, 0.125);
		Ingredient pressedTomato = new Ingredient("Pressed tomato", 110, 0.125);
		Ingredient pepper = new Ingredient("pepper", 10, 0.016);
		
		Coffee whippedCoffee = new Coffee("Whipped coffee", 0.0891);
		whippedCoffee.addIngredient(milk);
		whippedCoffee.addIngredient(whippedCream);
		whippedCoffee.print();
		
		Coffee irishCoffee = new Coffee("Irish coffee", 0.173);
		irishCoffee.addIngredient(milk);
		irishCoffee.addIngredient(rum);
		irishCoffee.addIngredient(whippedCream);
		irishCoffee.print();
		
		Coffee coffeeAmericano = new Coffee ("Coffee americano", 0.075);
		coffeeAmericano.print();
		
		Cocktail whiteRussian = new Cocktail("White Russian");
		whiteRussian.addIngredient(milk);
		whiteRussian.addIngredient(vodka);
		whiteRussian.addIngredient(rum);
		whiteRussian.print();
		
		Cocktail sexOnTheBeach = new Cocktail("Sex on the Beach");
		sexOnTheBeach.addIngredient(vodka);
		sexOnTheBeach.addIngredient(squeezedOrange);
		sexOnTheBeach.print();
		
		Cocktail bloodyMary = new Cocktail("Bloody Mary");
		bloodyMary.addIngredient(vodka);
		bloodyMary.addIngredient(pressedTomato);
		bloodyMary.addIngredient(pepper);
		bloodyMary.print();
		
	}

}
