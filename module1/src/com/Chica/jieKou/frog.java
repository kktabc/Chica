package com.Chica.jieKou;

public class frog extends animal implements Swim{

    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eat bugs");
    }

    @Override
    public void swim(){
        System.out.println("蛙泳");
    }

}
