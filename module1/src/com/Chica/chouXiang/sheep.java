package com.Chica.chouXiang;

public class sheep extends animal{

    public sheep() {
    }

    public sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("eat grass");
    }

}
