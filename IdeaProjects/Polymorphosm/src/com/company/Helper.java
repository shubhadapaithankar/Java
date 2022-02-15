package com.company;

public class Helper {
    public static int Multiply(int a,int b){
        return a*b;
    }
    public static double Multiply(double a , double b){
        return a*b;
    }
}

class GFG{
    public static void main (String args[]){
        System.out.println(Helper.Multiply(2,3));
        System.out.println(Helper.Multiply(5.5,3.6));
    }
}
