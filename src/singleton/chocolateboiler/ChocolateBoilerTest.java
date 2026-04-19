package singleton.chocolateboiler;

public class ChocolateBoilerTest {
    public static void main(String[] args) {
        ChocolateBoiler boiler1 = new ChocolateBoiler();
        ChocolateBoiler boiler2 = new ChocolateBoiler();

        boiler1.fill();
        boiler2.fill();
    }
}