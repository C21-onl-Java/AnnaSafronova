package ru.teachmeskills.homework09;

public class Vector2D {
    private final String DESCRIBE_VECTOR = "Этот вектор 2D";
    protected int coordinateX;
    protected int coordinateY;

    public Vector2D(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public void calculateVectorLength(Vector2D vector2D) {
        System.out.println("Длина вектора: " + Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2)));
    }

    public void sumVectorLength(Vector2D... vectors) {
        int sumX = 0;
        int sumY = 0;

        for (Vector2D vector : vectors) {
            sumX += coordinateX;
            sumY += coordinateY;
        }

        System.out.println("Сумма векторов: " + sumX + ", " + sumY);
    }

    public String toString() {
        return DESCRIBE_VECTOR + "\nКоординаты вектора: " + coordinateX + ", " + coordinateY;
    }
}
