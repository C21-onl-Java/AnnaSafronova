package ru.teachmeskills.homework07.task01;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public double area() {
        return 2 * side;
    }
}
