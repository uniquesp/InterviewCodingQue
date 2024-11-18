package OOPs;

//Parent Class
class Food {
	public void serve() {
		System.out.println("The food is served.");
	}
}

//Child Class 1: Pizza
class Pizza extends Food {
	public void addToppings() {
		System.out.println("Toppings are added to the Pizza.");
	}
}

//Child Class 2: Salad
class Salad extends Food {
	public void mixIngredients() {
		System.out.println("Ingredients are mixed for the Salad.");
	}
}

//Main Class

public class Inheritance {
	public static void main(String[] args) {
		// Parent class functionality
		Food food = new Food();
		food.serve(); // Outputs: The food is served.

		// Child class 1 functionality
		Pizza pizza = new Pizza();
		pizza.serve(); // Inherited method
		pizza.addToppings(); // Outputs: Toppings are added to the Pizza.

		// Child class 2 functionality
		Salad salad = new Salad();
		salad.serve(); // Inherited method
		salad.mixIngredients(); // Outputs: Ingredients are mixed for the Salad.
	}
}
