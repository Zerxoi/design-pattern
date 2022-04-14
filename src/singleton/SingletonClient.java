package singleton;

public class SingletonClient {
    public static void main(String[] args) {
        SingletonVolatile singletonVolatile = SingletonVolatile.getInstance();
        singletonVolatile.greeting();

        SingletonClassInitialization singletonClassInitialization = SingletonClassInitialization.getInstance();
        singletonClassInitialization.greeting();

        SingletonRegistry singletonRegistry = SingletonRegistry.getInstance();
        System.out.println(singletonRegistry.getSingleton("volatile") == singletonVolatile);
        System.out.println(singletonRegistry.getSingleton("class") == singletonClassInitialization);
    }
}
