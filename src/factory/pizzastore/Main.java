package factory.pizzastore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza nyPizza = nyStore.orderPizza("veggie");
        System.out.println("Ordered a " + nyPizza.getName());
        System.out.println();

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoStore.orderPizza("veggie");
        System.out.println("Ordered a " + chicagoPizza.getName());
        System.out.println();
        Pizza chicagoPepperoni = chicagoStore.orderPizza("pepperoni");
        System.out.println("Ordered a " + chicagoPepperoni.getName());
    }
}