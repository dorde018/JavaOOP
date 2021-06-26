package bill;

public class Ingredient {

	private String name;
	private double quantityInGrams;
	private double pricePerGram;
	public Ingredient(String name, double quantityInGrams, double pricePerGram) {
		super();
		this.name = name;
		this.quantityInGrams = quantityInGrams;
		this.pricePerGram = pricePerGram;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getQuantityInGrams() {
		return quantityInGrams;
	}
	public void setQuantityInGrams(double quantityInGrams) {
		this.quantityInGrams = quantityInGrams;
	}
	public double getPricePerGram() {
		return pricePerGram;
	}
	public void setPricePerGram(double pricePerGram) {
		this.pricePerGram = pricePerGram;
	}
	public double priceOfTheIngredients() {
		return this.quantityInGrams*this.pricePerGram;
	}
	public void print() {
		System.out.println(this.name + ", price: " + priceOfTheIngredients() + " eur.");
	}
}
