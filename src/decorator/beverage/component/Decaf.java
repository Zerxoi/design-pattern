package decorator.beverage.component;

import decorator.beverage.BeverageBehavior;

import java.math.BigDecimal;

public class Decaf extends Beverage {
    public Decaf() {
        super("Decaf", new BigDecimal("1.05"));
    }
}
