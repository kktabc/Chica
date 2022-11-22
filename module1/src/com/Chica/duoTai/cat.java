package com.Chica.duoTai;

public class cat extends animal{

    @Override
    public void eat(String sth){
        System.out.println(age + "岁的" + color + "颜色的猫" + sth);
    }

    public void catchMouse(){
        System.out.println("cat catch mouse");
    }

}
