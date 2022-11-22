package com.Chica.duoTai;

public class person {
    String name;
    int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(animal a, String sth){
        if(a instanceof dog){
            dog d = (dog)a;
            d.eat(sth);

        }
        else{
            cat c = (cat)a;
            c.eat(sth);
        }



    }



}
