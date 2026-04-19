package factory.pizzastore;

import factory.pizzastore.ingredients.*;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Veggie Pizza";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }
}