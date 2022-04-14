package decorator;

import decorator.beverage.BeverageBehavior;
import decorator.beverage.component.DarkRoast;
import decorator.beverage.decorator.Milk;
import decorator.beverage.decorator.Soy;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        BeverageBehavior soyMilkDarkRoast = new Soy(new Milk(new DarkRoast()));
        System.out.println(soyMilkDarkRoast.getDescription());
        System.out.println(soyMilkDarkRoast.getCost());
    }
}
