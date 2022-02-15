package com.company;

public class This_Example {
    int num = 10;
    This_Example(){
        System.out.println("this is an example program on keyword this");

    }
    This_Example(int num){
        this();
        this.num=num;
    }
    public void greet(){
        System.out.println("Hi welcome to Tutorial: ");
    }
    public void print(){
        int num = 20;
        System.out.println("value of local variable num is : " +num);
        System.out.println("value of instant variable is:"  +this.num);
        this.greet();
    }
    public static void main (String args[]){
        This_Example obj1 = new This_Example();
        obj1.print();
        This_Example obj2 = new This_Example(30);
        obj2.print();
    }

}
