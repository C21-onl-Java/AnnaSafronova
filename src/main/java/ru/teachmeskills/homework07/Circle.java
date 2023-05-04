package ru.teachmeskills.homework07;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return Math.PI * radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

}
