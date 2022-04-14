package decorator.beverage.decorator;

import decorator.beverage.BeverageBehavior;

import java.math.BigDecimal;

public class Mocha extends DecoratedBeverage {
    public Mocha(BeverageBehavior beverage) {
        super(beverage);
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(new BigDecimal("0.20"));
    }
}
