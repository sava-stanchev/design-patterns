package factory.pizzastore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.name = "NY Style Cheese Pizza";
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.name = "NY Style Veggie Pizza";
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.name = "NY Style Clam Pizza";
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.name = "NY Style Pepperoni Pizza";
        }

        return pizza;
    }
}