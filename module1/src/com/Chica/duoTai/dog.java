package com.Chica.duoTai;

public class dog extends animal{
    @Override
    public void eat(String sth) {
        System.out.println(age + "岁的" + color + "颜色的狗" + sth);

    }

    public void lookHome(){
        System.out.println("dog look home");
    }
}
