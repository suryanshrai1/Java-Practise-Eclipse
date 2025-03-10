package com.java.AbstractTest;

abstract class Shape {
    int dimension1;
    int dimension2;

    Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        super(length, width);
    }

    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Triangle triangle = new Triangle(10, 8);
        Circle circle = new Circle(7);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}

