package com.bl.oracle.polymorphism.methodoverriding;

public class Circle extends Shape {
    public void draw() {
        System.out.println("CIRCLE ");
    }

    public void numberOfSides() {
        System.out.println("side = 0 ");
    }
}
