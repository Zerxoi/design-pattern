package decorator.beverage.decorator;

import decorator.beverage.BeverageBehavior;

public abstract class DecoratedBeverage implements BeverageBehavior {
    protected BeverageBehavior beverage;

    public DecoratedBeverage(BeverageBehavior beverage) {
        this.beverage = beverage;
    }
}
