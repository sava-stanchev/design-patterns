package factory.pizzastore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if (type.equalsIgnoreCase("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            return new NYStyleVeggiePizza();
        }

        return null;
    }
}