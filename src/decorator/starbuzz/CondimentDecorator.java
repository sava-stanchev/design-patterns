package decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    public abstract String getDescription();
}