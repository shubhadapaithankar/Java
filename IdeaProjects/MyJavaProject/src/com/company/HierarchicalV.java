package com.company;

public class HierarchicalV {
    protected int topSpeed;

    public void setTopSpeed(int speed) {
        this.topSpeed=speed;
        System.out.println("The top speed of "+getClass().getSimpleName()+" is set to: "+ topSpeed);
    }

}

class Car4 extends HierarchicalV { // Derived from Vehicle Base for Prius
    public void setTopSpeed(int speed) {
        this.topSpeed=speed;
        System.out.println("The top2 speed of "+getClass().getSimpleName()+" is set to: "+ topSpeed);
    }
    //implementation of Car class
}

class Truck extends HierarchicalV {// Derived from Prius can be base to any further class

    //implementation of Truck class
}

class Khushi {

    public static void main(String[] args) {
        Car4 corolla = new Car4();
        corolla.setTopSpeed(220);

        Truck volvo = new Truck();
        volvo.setTopSpeed(120);
    }

}

