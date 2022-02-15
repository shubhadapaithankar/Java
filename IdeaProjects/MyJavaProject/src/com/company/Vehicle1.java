package com.company;

public class Vehicle1 {
    int fuelCap =90;
}
class Car1 extends  Vehicle1{
    int fuelCap =50;

    public void display(){
        System.out.println("Fuel capacity of the Vechile2 class" + super.fuelCap);
        System.out.println("Fuel capacity of the Car"  +fuelCap);
    }
}
class Vinit1  {
    public static void main (String args[]){
        Car1 corolla = new Car1();
        corolla.display();
    }
}