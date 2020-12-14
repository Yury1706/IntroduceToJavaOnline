package ProgrammingWithClasses;

public class Triangle {

    private int[] coordinateOfPointA = new int[2];
    private int[] coordinateOfPointB = new int[2];
    private int[] coordinateOfPointC = new int[2];

    public int getCoordinateXOfPointA() {
        return coordinateOfPointA[0];
    }

    public int getCoordinateYOfPointA() {
        return coordinateOfPointA[1];
    }

    public void setPointA(int coordinateX, int coordinateY) {
        this.coordinateOfPointA[0] = coordinateX;
        this.coordinateOfPointA[1] = coordinateY;
    }

    public int getCoordinateXOfPointB() {
        return coordinateOfPointB[0];
    }

    public int getCoordinateYOfPointB() {
        return coordinateOfPointB[1];
    }

    public void setPointB(int coordinateX, int coordinateY) {
        this.coordinateOfPointB[0] = coordinateX;
        this.coordinateOfPointB[1] = coordinateY;
    }

    public int getCoordinateXOfPointC() {
        return coordinateOfPointC[0];
    }

    public int getCoordinateYOfPointC() {
        return coordinateOfPointC[1];
    }

    public void setPointC(int coordinateX, int coordinateY) {
        this.coordinateOfPointC[0] = coordinateX;
        this.coordinateOfPointC[1] = coordinateY;
    }

    public static void findCoordinateOfMedian(Triangle triangle) {

        double medianCoordinateX = (double) ((triangle.getCoordinateXOfPointA() + triangle.getCoordinateXOfPointB() + triangle.getCoordinateXOfPointC())) / 3;
        double medianCoordinateY = (double) ((triangle.getCoordinateYOfPointA() + triangle.getCoordinateYOfPointB() + triangle.getCoordinateYOfPointC())) / 3;

        System.out.printf("Координаты точки пересечения медиан равны - X(%.2f) Y(%.2f)", medianCoordinateX, medianCoordinateY);
    }

    public static void findPerimeterAndSquareOfTriangleBySides(Triangle triangle) {
        double sideAB = Math.sqrt(Math.pow(Math.abs(triangle.getCoordinateXOfPointA() - triangle.getCoordinateXOfPointB()), 2)
                + Math.pow(Math.abs(triangle.getCoordinateYOfPointA() - triangle.getCoordinateYOfPointB()), 2));
        double sideAC = Math.sqrt(Math.pow(Math.abs(triangle.getCoordinateXOfPointA() - triangle.getCoordinateXOfPointC()), 2)
                + Math.pow(Math.abs(triangle.getCoordinateYOfPointA() - triangle.getCoordinateYOfPointC()), 2));
        double sideBC = Math.sqrt(Math.pow(Math.abs(triangle.getCoordinateXOfPointB() - triangle.getCoordinateXOfPointC()), 2)
                + Math.pow(Math.abs(triangle.getCoordinateYOfPointB() - triangle.getCoordinateYOfPointC()), 2));
        double perimeter = sideAB + sideAC + sideBC;

        double square = Math.sqrt(perimeter/2 * (perimeter/2 - sideAB) * (perimeter/2-sideAC) * (perimeter/2 - sideBC));
        System.out.printf("Периметр треугольника по значениям трех сторон равен %.2f", perimeter);
        System.out.println();
        System.out.printf("Площадь треугольника по значениям трех сторон равна %.2f", square);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setPointA(2, 4);
        triangle.setPointB(5, 5);
        triangle.setPointC(8, 3);

        findCoordinateOfMedian(triangle);
        System.out.println();
        findPerimeterAndSquareOfTriangleBySides(triangle);
    }
}
