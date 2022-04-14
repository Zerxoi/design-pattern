package strategy.behavior.quack.impl;

import strategy.behavior.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<Silence>");
    }
}
