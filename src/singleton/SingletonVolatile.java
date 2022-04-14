package singleton;

public class SingletonVolatile {
    // volatile 关键字用于阻止 instance = new SingletonVolatile(); 过程中的重排
    private volatile static SingletonVolatile instance;

    // 外部无法通过 new 关键字对 SingletonVolatile 进行实例化
    private SingletonVolatile() {
    }

    // 双锁定检查锁定降低同步开销
    public static SingletonVolatile getInstance() {
        if (instance == null) {
            synchronized (SingletonVolatile.class) {
                if (instance == null) {
                    instance = new SingletonVolatile();
                }
            }
        }
        return instance;
    }

    public void greeting() {
        System.out.println("Hello");
    }
}
