package com.Chica.jieKou;

public class test {
    public static void main(String[] args) {
        frog g = new frog("wawaa",1);
        rabbit r = new rabbit("baibai",5);
        dog d = new dog("wangcai",2);
        d.swim();
        g.swim();
        System.out.println(r.getAge() + "岁的小白兔" + r.getName() );
    }
}
