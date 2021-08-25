package com.test.mj.singleton;

/**
 * @author Admin
 * @Description: 2021/8/19
 * 15:51
 **/
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance1 == instance2);
    }
}


//饿汉式
class Singleton01 {
    //构造器私有化，外部不能new
    private Singleton01() {

    }

    private final static Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance() {
        return instance;
    }
}