package com.company;
public class Puppy {
    int puppyAge;
    public String puppyName;

    public Puppy (String name){
        this.puppyName = name;
        System.out.println("Name choosen is : " + name);
    }

    public void setAge(int age){
        this.puppyAge =age;
    }

    public int getAge(){
        System.out.println("Puppy age is : " + puppyAge);
        return puppyAge;
    }

    public static void main(String [] args){
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(5);
        myPuppy.getAge();
        System.out.println("Variable value :" + myPuppy.puppyAge);

    }
}
