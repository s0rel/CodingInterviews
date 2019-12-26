package org.sorel.problemset.p032;

/**
 * instance = new DclSingleton() 实际分为三部分运行：
 * 1、为 instance 分配内存空间
 * 2、初始化 instance
 * 3、将 instance 指向分配的内存地址
 * 由于 JVM 具有指令重排的特性，执行顺序有可能变成 1 -> 3 -> 2，指令重排在单线程环境下不会出现问题，
 * 但是在多线程环境下会导致一个线程获得还没有初始化的实例，例如，线程 T1 执行了 1 和 3，此时 T2 调用
 * volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行
 */
public class DclSingleton {
    // 必须使用 volatile 修饰
    private static volatile DclSingleton instance = null;

    private DclSingleton() {

    }

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }
}
