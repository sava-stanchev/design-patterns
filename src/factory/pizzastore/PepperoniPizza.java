package factory.pizzastore;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Regular Crust";
        sauce = "Tomato Sauce";

        toppings.add("Mozzarella Cheese");
        toppings.add("Pepperoni");
    }
}