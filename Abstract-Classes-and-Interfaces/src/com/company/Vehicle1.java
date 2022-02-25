package com.company;

public interface Vehicle1 {
    void cleanVehicle();

    default void startVehicle() {
        System.out.println("Vehicle is starting   ");
    }
}
