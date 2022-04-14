package decorator.beverage.component;

import decorator.beverage.BeverageBehavior;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super("HouseBlend", new BigDecimal("0.89"));
    }
}
