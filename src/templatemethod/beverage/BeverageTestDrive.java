package templatemethod.beverage;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

        System.out.println("\nMaking coffeeWithHook...");
        coffeeWithHook.prepareRecipe();
    }
}