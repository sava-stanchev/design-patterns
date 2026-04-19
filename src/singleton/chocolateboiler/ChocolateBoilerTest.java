package singleton.chocolateboiler;

public class ChocolateBoilerTest {
    public static void main(String[] args) {
        ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

        System.out.println(boiler1 == boiler2);

        boiler1.fill();
        boiler2.boil();
        boiler1.drain();
    }
}