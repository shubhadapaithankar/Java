package com.company;

public class Main implements InterfaceA,InterfaceB {


    public static void main(String[] args) {
        // write your code here
        Main main = new Main();
        main.printSomething();

        Dog dog = new Dog();
        dog.makeSound();
        Dog.run();
    }

    @Override
    public void printSomething() {
        InterfaceA.super.printSomething();
       // InterfaceB.super.printSomething();
    }



}