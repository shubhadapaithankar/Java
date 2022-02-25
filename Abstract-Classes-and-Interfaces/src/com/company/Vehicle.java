package com.company;

public class Vehicle {
}

class Car implements Vehicle1{

    @Override
    public void cleanVehicle() {
        System.out.println("cleaning the Vehicle  ");
    }

    public static void main (String args[]){
        Car car = new Car();
        car.cleanVehicle();
        car.startVehicle();

    }
}