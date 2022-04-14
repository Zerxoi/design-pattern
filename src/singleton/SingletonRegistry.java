package singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// 单例注册表
public class SingletonRegistry {
    private static class SingletonHolder {
        public static SingletonRegistry instance = new SingletonRegistry();
    }

    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>(2);

    private SingletonRegistry() {
    }

    public static SingletonRegistry getInstance() {
        return SingletonHolder.instance;
    }

    public Object getSingleton(String name) {
        // ConcurrentHashMap 只能保证单个操作的原子性，并不能保证复杂操作的原子性，使用 synchronized 关键字进行同步
        synchronized (singletonObjects) {
            Object singletonObject = this.singletonObjects.get(name);
            if (singletonObject == null) {
                if (name.equals("volatile")) {
                    singletonObject = SingletonVolatile.getInstance();
                } else if (name.equals("class")) {
                    singletonObject = SingletonClassInitialization.getInstance();
                }
                singletonObjects.put(name, singletonObject);
            }
            return singletonObject;
        }
    }

}
