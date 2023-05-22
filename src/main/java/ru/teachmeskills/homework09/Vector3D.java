package ru.teachmeskills.homework09;

public class Vector3D extends Vector2D {
    private final String DESCRIBE_VECTOR = "Этот вектор 3D";
    private int coordinateZ;

    public Vector3D(int coordinateX, int coordinateY, int coordinateZ) {
        super(coordinateX, coordinateY);
        this.coordinateZ = coordinateZ;
    }

    public void calculateVectorLength(Vector3D vector3D){
        System.out.println("Длина вектора: " + Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2) + Math.pow(coordinateZ, 2)));
    }

    public void sumVectorLength(Vector3D... vectors) {
        int sumX = 0;
        int sumY = 0;
        int sumZ = 0;

        for (Vector3D vector : vectors) {
            sumX += coordinateX;
            sumY += coordinateY;
            sumZ += coordinateZ;
        }

        System.out.println("Сумма векторов: " + sumX + ", " + sumY + ", " + sumZ);
    }

    public String toString() {
        return DESCRIBE_VECTOR + "\nКоординаты вектора: " + coordinateX + ", " + coordinateY + ", " + coordinateZ;
    }
}
