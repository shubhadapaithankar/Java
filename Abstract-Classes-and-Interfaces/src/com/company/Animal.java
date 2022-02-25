package com.company;

public abstract class Animal {
    public abstract void makeSound();

    public void move(){
        System.out.println("Special type of animal is moving : ");
    }
}

class Dog extends Animal{
    int age;


    public static void run(){
        System.out.println("inside static method: " );
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof............." +this.age);
    }
}
class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Meow meow..............");
    }
}

class Sheep extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Baa Baa");
    }
}

class Shubhada{
    public static void main (String args[]){
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal sheep = new Sheep();

        dog.makeSound();
        dog.move();

        cat.makeSound();
        cat.move();

        sheep.makeSound();
        sheep.move();
    }
}