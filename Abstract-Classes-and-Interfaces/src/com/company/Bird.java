package com.company;

public abstract class Bird {
    public abstract void eat();

    public void sleep(){
        System.out.println("bird is sleeping");

    }
}
interface canFlay{
    void flying();
}

class Parrot extends Bird implements canFlay{

    @Override
    public void eat() {

    }

    @Override
    public void flying() {
        System.out.println("Parrot is flying   ");

    }
}

class Crow extends Bird implements canFlay{

    @Override
    public void eat() {

    }

    @Override
    public void flying() {
        System.out.println("Flying");

    }

}
class Vinit{
    public static void main (String args[]){

        Parrot parrot = new Parrot();
        Bird crow = new Crow();

        parrot.eat();
        parrot.sleep();
        parrot.flying();
    }
}