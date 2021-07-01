package meal;

public class Main {

	public static void main(String[] args) {
		Ingredient mozzarella = new Ingredient("Mozzarella", 1.3);
		Ingredient oregano = new Ingredient("Oregano", 0.55);
		Ingredient tomato = new Ingredient("Tomato", 0.75);
		Ingredient ham = new Ingredient("Ham", 1.7);
		Ingredient salmon = new Ingredient("Salmon", 3.4);
		Ingredient egg = new Ingredient("Egg", 0.9);
		Ingredient arugola = new Ingredient("Arugola", 0.55);
		Ingredient pepperoni = new Ingredient("Pepperoni", 1.8);
		Ingredient hotSauce = new Ingredient("Hot sauce", 0.9);
		Ingredient mushrooms = new Ingredient("Mushrooms", 0.9);
		Ingredient olives = new Ingredient("Olives", 0.75);
		Ingredient prosciutto = new Ingredient("Prosciutto", 2.9);
		Ingredient garlic = new Ingredient("Garlic", 0.65);
		Ingredient artichoke = new Ingredient("Artichoke", 0.75);
		
		Pizza p1 = new Pizza("Capricciosa");
		p1.addIngredient(ham);
		p1.addIngredient(artichoke);
		p1.addIngredient(oregano);
		p1.addIngredient(mozzarella);
		p1.addIngredient(mushrooms);
		p1.addIngredient(olives);
		p1.addIngredient(tomato);
		p1.detailsOfThePizza();
		
		Pizza p2 = new Pizza("Pepperoni");
		p2.addIngredient(pepperoni);
		p2.addIngredient(hotSauce);
		p2.addIngredient(mozzarella);
		p2.addIngredient(oregano);
		p2.addIngredient(egg);
		p2.addIngredient(tomato);
		p2.addIngredient(garlic);
		p2.detailsOfThePizza();
		
		Pizza p3 = new Pizza("Margherita");
		p3.addIngredient(mozzarella);
		p3.addIngredient(tomato);
		p3.addIngredient(olives);
		p3.addIngredient(artichoke);
		p3.addIngredient(arugola);
		p3.addIngredient(oregano);
		p3.detailsOfThePizza();
		
		Pizza p4 = new Pizza("Prosciutto");
		p4.addIngredient(prosciutto);
		p4.addIngredient(mozzarella);
		p4.addIngredient(tomato);
		p4.addIngredient(oregano);
		p4.addIngredient(mushrooms);
		p4.addIngredient(garlic);
		p4.detailsOfThePizza();
		
		Pizza p5 = new Pizza("Salmon");
		p5.addIngredient(salmon);
		p5.addIngredient(mozzarella);
		p5.addIngredient(artichoke);
		p5.addIngredient(arugola);
		p5.addIngredient(tomato);
		p5.addIngredient(olives);
		p5.detailsOfThePizza();
		
	}

}
