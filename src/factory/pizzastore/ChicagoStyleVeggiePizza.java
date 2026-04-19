package factory.pizzastore;

import factory.pizzastore.ingredients.*;

public class ChicagoStyleVeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}