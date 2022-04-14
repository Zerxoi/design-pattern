package strategy.duck.impl;

import strategy.behavior.fly.impl.FlyNoWay;
import strategy.behavior.quack.impl.Squeak;
import strategy.duck.Duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flybehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
