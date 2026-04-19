package factory.pizzastore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new NYStyleCheesePizza(ingredientFactory);
            pizza.name = "NY Style Cheese Pizza";
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new NYStyleVeggiePizza(ingredientFactory);
            pizza.name = "NY Style Veggie Pizza";
        }

        return pizza;
    }
}