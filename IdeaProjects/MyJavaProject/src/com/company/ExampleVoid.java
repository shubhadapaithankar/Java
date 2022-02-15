package com.company;

public class ExampleVoid {
    public static void main (String args []){
        methodRankPoints(255.7);

    }
    public static void methodRankPoints(double points){
        if (points>= 202.5){
            System.out.println("Rank A");
        }else if (points >= 122.4){
            System.out.println("Rank B");
        }else {
            System.out.println("Rank C");
        }
    }
}
