package com.bl.oracle.polymorphism.methodoverloading;

public class CircleArea {
    public double area(double x) {
        return 3.14 * x;
    }

    public int area(int x) {
        return x * x;
    }

    public int area(int x, int y) {
        return x * y;
    }

    public double area(double y, double x) {
        return (y * x) / 2;
    }
}

