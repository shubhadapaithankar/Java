package com.company;

public class MultiLevelVehicle {
    private int topSpeed;

    public void setTopSpeed(int speed){
        this.topSpeed=speed;
        System.out.println("The top speed is set to: " +topSpeed);
    }
}
class Car3 extends MultiLevelVehicle{
    public void openTrunk(){
        System.out.println("The car trunk is open now!");
    }
}

class Prius extends Car3{
    public void turnOnHybrid(){
        System.out.println("The mode is turn on !: ");
    }
}

class Chaptu{
    public static void main(String args[]){
        Prius priusPrime = new Prius();
        priusPrime.setTopSpeed(100);
        priusPrime.openTrunk();
        priusPrime.turnOnHybrid();
    }
}