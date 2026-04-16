package decorator.starbuzz;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
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