package org.sorel.problemset.p032;

public class LazySingleton {
    // 没有 final 修饰符，因为使用了延迟初始化
    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
