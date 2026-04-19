package factory.pizzastore;

public class Main {
    public static void main(String[] args) {
        PizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);

        Pizza nyPizza = nyStore.orderPizza("veggie");
        System.out.println("Ordered a " + nyPizza.getName());
        System.out.println();

        PizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);

        Pizza chicagoPizza = chicagoStore.orderPizza("veggie");
        System.out.println("Ordered a " + chicagoPizza.getName());
    }
}