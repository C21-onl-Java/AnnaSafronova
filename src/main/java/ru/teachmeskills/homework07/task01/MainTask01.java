package ru.teachmeskills.homework07.task01;

public class MainTask01 {
    public static void main(String[] args) {

        Figure[] figures = new Figure[3];
        double totalSumAreas = 0;

        figures[0] = new Square(5);
        figures[1] = new Rectangle(2, 4);
        figures[2] = new Circle(2);

        for (Figure figure : figures) {
            totalSumAreas += figure.area();
            System.out.println(figure.area());
        }

        System.out.println(totalSumAreas);
    }
}
