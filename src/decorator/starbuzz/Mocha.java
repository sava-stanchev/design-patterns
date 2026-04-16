package decorator.starbuzz;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return switch (getSize()) {
            case TALL -> beverage.cost() + 0.15;
            case GRANDE -> beverage.cost() + 0.20;
            case VENTI -> beverage.cost() + 0.25;
        };
    }
}