package strategy;

import strategy.duck.Duck;
import strategy.duck.impl.MallardDuck;
import strategy.duck.impl.RubberDuck;

public class SimUDuck {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.quack();
    }
}
