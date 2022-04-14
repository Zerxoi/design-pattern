package decorator.beverage.decorator;

import decorator.beverage.BeverageBehavior;

import java.math.BigDecimal;

public class Milk extends DecoratedBeverage {
    public Milk(BeverageBehavior beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(new BigDecimal("0.10"));
    }
}
