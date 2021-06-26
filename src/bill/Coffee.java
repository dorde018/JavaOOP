package bill;

public class Coffee extends Beverage {
	private double caffeinePercentage;

	public Coffee(String name, double caffeinePercentage) {
		super(name);
		this.caffeinePercentage = caffeinePercentage;
	}

	public double getCaffeinePercentage() {
		return caffeinePercentage;
	}

	public void setCaffeinePercentage(double caffeinePercentage) {
		this.caffeinePercentage = caffeinePercentage;
	}

	@Override
	public double priceOfTheBeverage() {
		return ( this.caffeinePercentage * 30 ) + priceOfAllIngredients();
	}

	@Override
	public void print() {
		System.out.println(getName() + ", caffein percentage: " + caffeinePercentage + " %, price: " + priceOfTheBeverage());
		System.out.println("\nIngredints: ");
		for (int i = 0; i < super.getListOfTheIngredients().size(); i++) {
			super.getListOfTheIngredients().get(i).print();
		}
		System.out.println("----------------------------------------------------------");
	}
	
}
