package com.company;

public abstract class Bike {
    Bike(){
        System.out.println("bike is created");
    }
    public void run(){

    }
    public void changeGare(){
        System.out.println("gare changed");
    }
}
class Honda extends Bike{
    public void run(){
        System.out.println("running safely..");
    }
}

class TestAbstraction2{
    public static void main(String args[])
    {
        Bike obj = new Honda();
        obj.run();
        obj.changeGare();
    }
}