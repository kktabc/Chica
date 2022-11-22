package com.Chica.jieKou;

public class dog extends animal implements Swim{
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eat bones");
    }

    @Override
    public void swim(){
        System.out.println("狗刨");
    }
}
