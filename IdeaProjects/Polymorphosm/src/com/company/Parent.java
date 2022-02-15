package com.company;

class Parent {
    public void Print(){
        System.out.println("Parent Class: ");
    }
}
class Subclass1 extends Parent{
    public void Print(){
        System.out.println("Subclass1: ");
    }
}
class Subclass2 extends Parent{
    public void Print(){
        System.out.println("Subclass2: ");
    }
}

class GFG2{
    public static void main(String args[]){
        Parent a = new Subclass1();
        Parent b = new Subclass2();
        a.Print();
        b.Print();
    }
}