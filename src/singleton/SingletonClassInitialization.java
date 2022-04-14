package singleton;

// 基于类初始化的延迟初始化（只能对静态字段进行初始化）
public class SingletonClassInitialization {
    // 在访问 InstanceHolder 的静态字段时会同步的初始化创建 instance 字段，保证只有一个线程对 InstanceHolder 进行初始化
    private static class InstanceHolder {
        public static SingletonClassInitialization instance = new SingletonClassInitialization();
    }

    // 外部无法通过 new 关键字对 SingletonClassInitialization 进行实例化
    private SingletonClassInitialization() {
    }

    public static SingletonClassInitialization getInstance() {
        return InstanceHolder.instance;
    }

    public void greeting() {
        System.out.println("Hello");
    }
}
