package com.Chica.neibu;



public class car {
    String carName;
    int carAge;
    String carColor;
    public void show(car this){
        System.out.println(this.carName);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }
    class Engine{
        String engineName;
        int engineAge;
        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }

    }
}

