package decorator.beverage.decorator;

import decorator.beverage.BeverageBehavior;

import java.math.BigDecimal;

public class Whip extends DecoratedBeverage {
    public Whip(BeverageBehavior beverage) {
        super(beverage);
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(new BigDecimal("0.10"));
    }
}
