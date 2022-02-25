package com.company;

public abstract class Shape{
    public abstract void draw();
}
class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("drawing Rectangle:  ");
    }
}

class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Circle: ");
    }
}
class TestShape{
    public static void main(String args[]){
     Shape shape = new Rectangle();
     shape.draw();
    }
}