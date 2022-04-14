package decorator.beverage.component;

import decorator.beverage.BeverageBehavior;

import java.math.BigDecimal;

public class Espresso extends Beverage {
    public Espresso() {
        super("Espresso", new BigDecimal("1.99"));
    }
}
