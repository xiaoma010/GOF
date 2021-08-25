package com.test.mj.singleton;

/**
 * @author Admin
 * @Description: 2021/8/19
 * 15:51
 **/
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton03 instance1 = Singleton03.getInstance();
        Singleton03 instance2 = Singleton03.getInstance();
        System.out.println(instance1 == instance2);
    }
}


//饿汉式
class Singleton03 {
    //构造器私有化，外部不能new
    private Singleton03() {

    }

    private static Singleton03 instance;


    public static Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}