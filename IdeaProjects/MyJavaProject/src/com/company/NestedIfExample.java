package com.company;

public class NestedIfExample {
    public static void main(String args[]){
        int age=25;
        int weight=48;
        if(age>=18){
            if(weight>50){
                System.out.println("u can donate the blood");
            }
            else{
                System.out.println("u are not eligible to donate blood" );
            }
        }
        else{
            System.out.println("age must be greater then 18");
        }
    }
}
