package com.Chica.test;

public class User {
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;

    public User(){

    }

    public User(String name, String password, String email, String gender, int age){
        this.email = email;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(String password){
        return this.password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email ;

    }

}
