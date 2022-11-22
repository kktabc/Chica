package com.Chica.chouXiang;

public class test {

    public static void main(String[] args) {
        frog f = new frog("hello",10);
        sheep s = new sheep("lay",93);
        dog d = new dog("wangcai",9);
        f.setAge(39);
        System.out.println(f.getName() +"是只羊，它" + f.getAge()+"岁了" );
        d.eat();
        s.eat();
        f.eat();

    }
}
