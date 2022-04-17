package adapter;

import adapter.adapter.DuckAdapter;
import adapter.adapter.TurkeyAdapter;
import adapter.duck.Duck;
import adapter.duck.impl.MallardDuck;
import adapter.turkey.Turkey;
import adapter.turkey.impl.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Turkey duckAdapter = new DuckAdapter(duck);
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        testTurkey(duckAdapter);
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
