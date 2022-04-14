package strategy.duck;


import strategy.behavior.fly.FlyBehavior;
import strategy.behavior.quack.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flybehavior;
    protected QuackBehavior quackBehavior;

    public void fly() {
        flybehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }
}
