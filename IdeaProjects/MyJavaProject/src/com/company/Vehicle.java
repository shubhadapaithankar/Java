package com.company;

public class Vehicle {
    private  String make;
    private String colour;
    private int year;
    private String model;

    public Vehicle(String make, String colour , int year, String model){
        this.make=make;
        this.colour=colour;
        this.year=year;
        this.model=model;
    }

    public void printDetails(){
        System.out.println("manufacture: "  +make);
        System.out.println("Colour: "  +colour);
        System.out.println("Year:"  +year);
        System.out.println("Model:"  +model);
    }

}
class Car extends Vehicle{
    private String bodyStyle;

    public Car(String make, String colour, int year, String model){
        super(make, colour, year, model);
        this.bodyStyle=bodyStyle;
    }

    public void carDetails(){
        printDetails();
        System.out.println("Body Style: "  +bodyStyle);

    }
}

class Shubhada {

    public static void main (String args []){
        Car sedan = new Car("Maruti","Red",2019,"Sedan");
        sedan.carDetails();
    }
}