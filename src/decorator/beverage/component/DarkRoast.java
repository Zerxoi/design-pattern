package decorator.beverage.component;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("DarkRoast", new BigDecimal("0.99"));
    }
}
