package com.bl.oracle.polymorphism.methodoverloading;

public class Overloading {
    public static void main(String args[]) {

        CircleArea c = new CircleArea();

        System.out.println("Circle area = " + c.area(1));
        System.out.println("Square area = " + c.area(2));
        System.out.println("Rectangle area = " + c.area(3, 4));
        System.out.println("Triangle area = " + c.area(6.5, 3.5));
    }
}
