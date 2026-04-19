package factory.pizzastore;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Tomato Sauce";

        toppings.add("Mozzarella Cheese");
    }
}