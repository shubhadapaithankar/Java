package com.company;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(){
        this.length=0;
        this.width=0;
    }
    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    public int getArea(){
        return this.length*this.width;
    }
}
class Demo{
    public static void main (String args []){
        Rectangle obj = new Rectangle(4,4);
        System.out.println(obj.getArea());
    }
}
