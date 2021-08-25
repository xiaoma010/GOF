package com.test.mj.singleton;

/**
 * @author Admin
 * @Description: 2021/8/19
 * 15:51
 **/
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton04 instance1 = Singleton04.getInstance();
        Singleton04 instance2 = Singleton04.getInstance();
        System.out.println(instance1 == instance2);
    }
}


//饿汉式
class Singleton04 {
    //构造器私有化，外部不能new
    private Singleton04() {

    }

    private static Singleton04 instance;


    public static synchronized Singleton04 getInstance() {
        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;
    }
}