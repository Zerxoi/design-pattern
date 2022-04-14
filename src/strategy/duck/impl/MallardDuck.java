package strategy.duck.impl;

import strategy.behavior.fly.impl.FlyNoWay;
import strategy.behavior.fly.impl.FlyWithWings;
import strategy.behavior.quack.impl.Quack;
import strategy.duck.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flybehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
