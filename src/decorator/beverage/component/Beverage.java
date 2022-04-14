package decorator.beverage.component;

import decorator.beverage.BeverageBehavior;

import java.math.BigDecimal;

public class Beverage implements BeverageBehavior {
    private final String description;
    private final BigDecimal cost;

    public Beverage(String description, BigDecimal cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public BigDecimal getCost() {
        return cost;
    }
}
