package basicsOfSoftwareCodeDevelopment;

public class ModuleTwo {

    public void getTriangleByTwoCorners(int firstCorner, int secondCorner) {
        if (firstCorner + secondCorner >= 180) {
            System.out.println("Треугольника с такими углами не существует");
            return;
        }
        if (firstCorner == 90 || secondCorner == 90 || firstCorner + secondCorner == 90) {
            System.out.println("Треугольник прямоугольный");
        } else System.out.println("Треугольник непрямоугольный");
    }

    public void findMaxBetweenMin(int a, int b, int c, int d) {
        int maxBetweenMin = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(maxBetweenMin);
    }

    public void isPointsOnOneLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1) {
            System.out.println("Все точки расположены на одной прямой");
        } else System.out.println("Точки расположены не на одной прямой");
    }

    public void isGetInHole(int holeSideA, int holeSideB) {
        int brickSideX = 2;
        int brickSideY = 5;
        int brickSideZ = 3;
        if (brickSideX <= holeSideA && (brickSideY <= holeSideB || brickSideZ <= holeSideB)) {
            System.out.println("Кирпич пролезет через отверстие");
        } else if (brickSideX <= holeSideB && (brickSideY <= holeSideA || brickSideZ <= holeSideA)) {
            System.out.println("Кирпич пролезет через отверстие");
        } else if (brickSideY <= holeSideA && brickSideZ <= holeSideB) {
            System.out.println("Кирпич пролезет через отверстие");
        } else if (brickSideY <= holeSideB && brickSideZ <= holeSideA) {
            System.out.println("Кирпич пролезет через отверстие");
        } else System.out.println("Кирпич не пролезет через отверстие");
    }

    public void solveFunction(double x) {
        double result;
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
            System.out.println(result);
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        ModuleTwo brEx1 = new ModuleTwo();
        brEx1.getTriangleByTwoCorners(30, 60);
        ModuleTwo brEx2 = new ModuleTwo();
        brEx2.findMaxBetweenMin(9, 8, 7, 10);
        ModuleTwo brEx3 = new ModuleTwo();
        brEx3.isPointsOnOneLine(1, 2, 2, 4, 3, 6);
        ModuleTwo brEx4 = new ModuleTwo();
        brEx4.isGetInHole(3, 2);
        ModuleTwo brEx5 = new ModuleTwo();
        brEx5.solveFunction(3);
    }

}
