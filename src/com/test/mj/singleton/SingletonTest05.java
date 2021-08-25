package com.test.mj.singleton;

/**
 * @auoth:BertWei
 * @Description: 2021/8/19
 * 16:50
 **/
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton05 instance1 = Singleton05.getInstance();
        Singleton05 instance2 = Singleton05.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton05 {

    private static volatile Singleton05 instance;

    private Singleton05() {

    }

    //双重检查，解决懒加载和线程安全
    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                if (instance == null) {

                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }

}