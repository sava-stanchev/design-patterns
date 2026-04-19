package factory.pizzastore;

public class ChicagoPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }

        return null;
    }
}