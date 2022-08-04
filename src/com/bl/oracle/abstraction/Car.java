package com.bl.oracle.abstraction;

public abstract class Car {
    Car() {
        System.out.println("Car is done ");
    }

    public abstract void drive();

    public void start() {
        System.out.println("on the way");
    }
}
