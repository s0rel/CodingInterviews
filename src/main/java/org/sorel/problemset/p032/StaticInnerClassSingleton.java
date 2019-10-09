package org.sorel.problemset.p032;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {

    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
}
