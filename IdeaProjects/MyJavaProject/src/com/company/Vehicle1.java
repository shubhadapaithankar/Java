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

    git clone https://github.com/edenhill/kcat.git
        Cloning into 'kcat'...
        remote: Enumerating objects: 1550, done.
        remote: Counting objects: 100% (280/280), done.
        remote: Compressing objects: 100% (177/177), done.
        remote: Total 1550 (delta 157), reused 195 (delta 93), pack-reused 1270
        Receiving objects: 100% (1550/1550), 627.54 KiB | 620.00 KiB/s, done.
        Resolving deltas: 100% (935/935), done.


