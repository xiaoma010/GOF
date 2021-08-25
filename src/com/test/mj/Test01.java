package com.test.mj;

/**
 * @author Admin
 * @auoth:BertWei
 * @Description: 2021/8/19
 * 10:44
 **/
public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

interface IReceiver {
    String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮箱";
    }
}

class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return "微信";
    }
}

class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}