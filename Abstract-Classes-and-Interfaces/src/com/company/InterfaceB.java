package com.company;

public interface InterfaceB {
    default void printSomething(){
        System.out.println("I am inside B interface ");
    }
    static void printSomething2() {
        System.out.println("I am inside interface ");
    }
}
