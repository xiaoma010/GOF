package com.test.mj.singleton;

/**
 * @auoth:BertWei
 * @Description: 2021/8/19
 * 17:13
 **/
public class SingletonTest06 {

    public static void main(String[] args) {
        Singleton06 instance1 = Singleton06.getInstance();
        Singleton06 instance2 = Singleton06.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton06 {
    private Singleton06() {

    }

    private static class SingletonInstance {
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    public static synchronized Singleton06 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}