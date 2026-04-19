package factory.pizzastore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if (type.equalsIgnoreCase("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }

        return null;
    }
}