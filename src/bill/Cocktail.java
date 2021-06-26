package bill;

public class Cocktail extends Beverage{

	public Cocktail(String name) {
		super(name);
	}

	@Override
	public double priceOfTheBeverage() {
		return 1.9 * priceOfAllIngredients();
	}

	@Override
	public void print() {
		System.out.println("Cocktail: " + this.getName() + ", price: " + super.priceOfAllIngredients() + " eur.");
		System.out.println("\nIngredints: ");
		for (int i = 0; i < super.getListOfTheIngredients().size(); i++) {
				super.getListOfTheIngredients().get(i).print();
		}
		System.out.println("----------------------------------------------");
	}
	
}
