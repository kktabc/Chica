package com.Chica.duoTai;

public class test {
    public static void main(String[] args) {
        person keeper = new person();
        keeper.setName("laowang");
        keeper.setAge(30);

        dog d = new dog();
        d.color = "black";
        d.age = 2;
        System.out.println(keeper.age + "岁的" + keeper.name + "养了一只" + d.color+ "颜色的" + d.age + "岁的狗");
        keeper.keepPet(d,"两只前腿死死的抱住骨头猛吃");

        cat c = new cat();
        c.age = 3;
        c.color = "grey";

        person p2 = new person();
        p2.setAge(25);
        p2.setName("laoli");
        System.out.println(p2.age + "岁的" + p2.name + "养了一只" + c.color+ "颜色的" + c.age + "岁的猫");
        p2.keepPet(c,"眯着眼睛测着头吃鱼");

        String s = "hello";
        System.out.println(s);



    }
}
