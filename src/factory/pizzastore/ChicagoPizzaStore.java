package factory.pizzastore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.name = "Chicago Style Cheese Pizza";

        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.name = "Chicago Style Veggie Pizza";
        }

        return pizza;
    }
}