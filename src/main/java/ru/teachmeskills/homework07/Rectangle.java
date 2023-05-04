package ru.teachmeskills.homework07;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double perimeter() {
        return 2 * (firstSide + secondSide);
    }

    public double area() {
        return firstSide * secondSide;
    }

}
