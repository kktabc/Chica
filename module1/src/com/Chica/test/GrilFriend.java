package com.Chica.test;

public class GrilFriend {
    private String name;
    private int age;

    // constructor
    public GrilFriend(){
        System.out.println("construct a new object!");
    }

    public GrilFriend(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){

            this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if (age>=18 && age <= 50){
            this.age = age;
        }
        else{
            System.out.println("illegal!");
        }
    }

    public int getAge(){
        return this.age;
    }
}
