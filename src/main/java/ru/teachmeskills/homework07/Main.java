package ru.teachmeskills.homework07;

public class Main {
    Figure[] figures = new Figure[3];

    Square square = new Square(5);
    figures[0] = new Square(5);
    figures[1] = square;

}
