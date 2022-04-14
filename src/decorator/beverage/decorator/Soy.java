package decorator.beverage.decorator;

import decorator.beverage.BeverageBehavior;

import java.math.BigDecimal;

public class Soy extends DecoratedBeverage {
    public Soy(BeverageBehavior beverage) {
        super(beverage);
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(new BigDecimal("0.15"));
    }
}
