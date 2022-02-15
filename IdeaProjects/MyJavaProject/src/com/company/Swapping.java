package com.company;

public class Swapping {
    public static void main (String args[]){
        int a = 30;
        int b = 45;
        System.out.println("Before swapping , a= " +a + "and b = " +b );

        swapFunction(a,b);
        System.out.println("\n**Now, BEfore and after swapping value will be the same here**: ");
        System.out.println("After swapping, a= " +a + "abd n = "+b );
    }
    public static void swapFunction(int a , int b ){
        System.out.println( "Before swapping(Inside), a = " + a + " b = " + b);
        int c= a;
        a = b;
        b =c ;
        System.out.println("After swapping(Inside), a = " + a + " b = " + b);
    }
}
