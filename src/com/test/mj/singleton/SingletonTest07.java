package com.test.mj.singleton;

/**
 * @auoth:BertWei
 * @Description: 2021/8/19
 * 17:24
 **/
public class SingletonTest07 {

    public static void main(String[] args) {
        Singleton07 instance01 = Singleton07.INSTANCE;
        Singleton07 instance02 = Singleton07.INSTANCE;

        System.out.println(instance01 == instance02);
    }
}

enum Singleton07 {
    INSTANCE;

    public void say() {
        System.out.println("ok");
    }
}