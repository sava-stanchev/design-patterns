package factory.pizzastore;

public class Main {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName());
    }
}