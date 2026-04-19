package factory.pizzastore;

public class NYPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            return new NYStyleVeggiePizza();
        }

        return null;
    }
}