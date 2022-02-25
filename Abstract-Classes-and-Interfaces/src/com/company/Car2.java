package com.company;

public class  Car2 {
    private int model;
    private String manufacture;


    public  Car2(int model ,String manufacture){
        this.model=model;
        this.manufacture=manufacture;
    }
    public void printDetails(){
        System.out.println("The Model of .." +model);
        System.out.println("The manufacturer of..." +manufacture);
    }
}

interface IsSedan{
    int bootSpace=420;
    void setBootSpace();
}

class Tesla extends Car2 implements IsSedan{

    private String variant;
    public Tesla(int model,String variant){
        super(model,"Hyundai");
        this.variant=variant;
    }

    @Override
    public void setBootSpace() {
        System.out.println("this is the bootspace of Tesla");
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("the varienr of testa is...."  +variant);
    }
}


class Chaptu{
    public static void main(String args[]){
        Tesla tesla = new Tesla(2019,"sport");
        Tesla eco = new Tesla(2020,"Eco");
        tesla.printDetails();
        tesla.setBootSpace();

        eco.printDetails();
        eco.setBootSpace();
    }
}