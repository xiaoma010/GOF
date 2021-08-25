package com.test.mj.singleton;

/**
 * @author Admin
 * @Description: 2021/8/19
 * 15:51
 **/
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton04 instance1 = Singleton04.getInstance();
        Singleton04 instance2 = Singleton04.getInstance();
        System.out.println(instance1 == instance2);
    }
}


//饿汉式
class Singleton02 {
    //构造器私有化，外部不能new
    private Singleton02() {

    }

    private static Singleton02 instance;

    static {
        instance = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return instance;
    }
}