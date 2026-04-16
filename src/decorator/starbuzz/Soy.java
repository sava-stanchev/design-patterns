package decorator.starbuzz;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return switch (getSize()) {
            case TALL -> beverage.cost() + 0.10;
            case GRANDE -> beverage.cost() + 0.15;
            case VENTI -> beverage.cost() + 0.20;
        };
    }
}