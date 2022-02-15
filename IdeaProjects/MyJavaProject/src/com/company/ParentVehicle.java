package com.company;

public class ParentVehicle {
    public void display(){
        System.out.println("I am from the Vehicle Class");
    }
}
class ChildCar extends ParentVehicle{
    public void display() {
        System.out.println("I am from the car class: ");
    }

    public void printOut(){
        System.out.println("The display() call with super: ");
        super.display();
        System.out.println("The display() call without super: ");
        display();
    }
}

class Om {
    public static void main(String[] args) {
        ChildCar car2 = new ChildCar();
        car2.printOut();
}
}