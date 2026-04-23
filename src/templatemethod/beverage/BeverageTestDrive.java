package templatemethod.beverage;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        CoffeeWithHook coffee = new CoffeeWithHook();

        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}