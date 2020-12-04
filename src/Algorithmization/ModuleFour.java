package Algorithmization;

import java.util.Arrays;

public class ModuleFour {

    /*
    Эти методы будут использоваться в других статических методах
     */
    public static int getFactorial(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = getFactorial(n - 1) * n;
        return result;
    }

    public static int findNOD(int a1, int a2) {
        int result;
        if (a1 % a2 == 0) {
            result = a2;
            return result;
        } else {
            result = findNOD(a2, a1 % a2);
        }
        return result;
    }

    public static int findNOK(int a1, int a2) {
        int nok = a1 * a2 / findNOD(a1, a2);
        return nok;
    }

     /*
    Эти методы будут использоваться в других статических методах
     */

    public static void showResultsOfNOKAndNOD(int firstValue, int secondValue) {
        System.out.println("Наибольший общий делитель для " + firstValue + " и " + secondValue + " равен: " + findNOD(firstValue, secondValue));
        System.out.println("Наименьшее общее кратное для " + firstValue + " и " + secondValue + " равно: " + findNOK(firstValue, secondValue));
    }

    public static void findNODForFourValues(int... userValues) {
        int[] valuesOfUser = userValues;
        if (valuesOfUser.length >= 2) {
            int result = findNOD(valuesOfUser[0], valuesOfUser[1]); // метод взят чуть выше
            for (int i = 2; i < valuesOfUser.length; i++) {
                result = findNOD(result, valuesOfUser[i]);
            }
            System.out.println(result);
        } else {
            System.out.println("Нужно больше значений. По условию должно быть 4 числа...");
        }
    }

    public static void calculateArea(int sizeOfSide) {
        double areaOfTriangle = Math.pow(sizeOfSide, 2) * Math.sqrt(3) / 4;
        double area = areaOfTriangle * 6;
        System.out.println("Площадь шестиугольника с заданной стороной " + sizeOfSide + " равна: " + area);
    }

    public static void findTheBiggestLengthBetweenTwoPoints() {
        int[] coordinatesX = {1, 4, 2, 2, 5};
        int[] coordinatesY = {1, 2, -4, 8, 1};
        int lengthBetweenX;
        int lengthBetweenY;
        int lengthBetweenPoints;
        int maxLength = 0;
        int maxIndexOfPoint1 = 0;
        int maxIndexOfPoint2 = 0;

        for (int i = 0; i < coordinatesX.length; i++) {
            for (int j = i + 1; j < coordinatesX.length; j++) {
                lengthBetweenX = Math.abs(coordinatesX[i] - coordinatesX[j]);
                lengthBetweenY = Math.abs(coordinatesY[i] - coordinatesY[j]);
                lengthBetweenPoints = lengthBetweenX + lengthBetweenY;
                if (lengthBetweenPoints > maxLength) {
                    maxLength = lengthBetweenPoints;
                    maxIndexOfPoint1 = i;
                    maxIndexOfPoint2 = j;
                }
            }
        }
        System.out.println("Максимальное расстояние между точками с координатами: +" +
                "\nТочка \"А(" + (maxIndexOfPoint1 + 1) + ")\" - координаты:" +
                " x = " + coordinatesX[maxIndexOfPoint1] + ", y = " + coordinatesY[maxIndexOfPoint1] +
                "\nТочка \"А(" + (maxIndexOfPoint2 + 1) + ")\" - координаты:" +
                " x = " + coordinatesX[maxIndexOfPoint2] + ", y = " + coordinatesY[maxIndexOfPoint2]);
        System.out.println();
    }

    public static void showSecondMaxValue(int... userValues) {
        int[] arrayOfUserValues = userValues;
        int maxValue = arrayOfUserValues[0];
        int lastButOneValue = 0;
        if (arrayOfUserValues.length < 2) {
            System.out.println("Предпоследнего значения тут нет.");
            return;
        }
        for (int i = 1; i < arrayOfUserValues.length; i++) {
            if (arrayOfUserValues.length == 2) {
                if (arrayOfUserValues[i] > maxValue) {
                    lastButOneValue = maxValue;
                    maxValue = arrayOfUserValues[i];
                }
            } else {
                if (arrayOfUserValues[i] > maxValue) {
                    lastButOneValue = maxValue;
                    maxValue = arrayOfUserValues[i];
                }
            }
        }
        System.out.println("Второе максимальное по величине значение из переданных равно: " + lastButOneValue);
        System.out.println();
    }

    public static void isValuesSimple(int... userValues) {
        int[] valuesOfUser = userValues;
        if (valuesOfUser.length > 2) {
            int result = findNOD(valuesOfUser[0], valuesOfUser[1]); // метод взят чуть выше
            for (int i = 2; i < valuesOfUser.length; i++) {
                result = findNOD(result, valuesOfUser[i]);
            }
            if (result == 1) {
                System.out.println("Данные числа взаимно просты(в совокупности)");
            } else {
                System.out.println("Данные числа не взаимно просты");
            }
        } else {
            System.out.println("Нужно больше значений. По условию должно быть 3 числа...");
        }
        System.out.println();
    }

    public static void calculateSumOfFactorials(int firstBorderValue, int lastBorderValue) {
        int totalSum = 0;
        for (int i = firstBorderValue; i <= lastBorderValue; i++) {
            if (i % 2 != 0) {
                totalSum += getFactorial(i);
            }
        }
        System.out.printf("Сумма факториалов нечетных значений в промежутке от %,d до %,d равна: %,d"
                , firstBorderValue, lastBorderValue, totalSum);
        System.out.println();
    }


    /*
    Мне кажется, что в задании 8 ошибка.
    Если я правильно понял, то правильно должно быть "D[1]+D[2]+D[3];D[2]+D[3]+D[4];D[3]+D[4]+D[5];D[4]+D[5]+D[6]".
    В задании пропущен блок D[2]+D[3]+D[4], либо я сделал не так. Без него не вижу логики...
    Если что не судите строго
     */
    public static void sumOfThreeValues(int... userValues) {
        int[] arrayD = userValues;
        int sum = 0;

        for (int i = 0; i <= arrayD.length - 3; i++) {
            for (int j = i; j < i + 3; j++) {
                sum += arrayD[j];
            }
        }
        System.out.println("Сумма всех последовательно расположенных элементов массива равна: " + sum);
        System.out.println();
    }

    public static void showAreaOfQuadrangle(int x, int y, int z, int t) {
        double area = 0;
        if (x == z && y == t || x == t && y == z) {
            area = x * y;
        } else {
            double areaOfRectangularTriangle = x * y / 2; // площадь прямоугольного треугольника
            double hypotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // находим гипотенузу
            double semiPerimeterOfAnotherTriangle = (z + t + hypotenuse) / 2; // полупериметр треугольника
            double areaOfAnotherTriangle =
                    Math.sqrt(semiPerimeterOfAnotherTriangle * (semiPerimeterOfAnotherTriangle - z) *
                            (semiPerimeterOfAnotherTriangle - t) * (semiPerimeterOfAnotherTriangle - hypotenuse));
            area = areaOfAnotherTriangle + areaOfRectangularTriangle;
        }
        System.out.printf("Площадь четырехугольника равна: %.2f", area);
    }

    public static void main(String[] args) {
//        showResultsOfNOKAndNOD(12, 30);
//        findNODForFourValues(78, 294, 570, 36);
//        calculateArea(4);
//        findTheBiggestLengthBetweenTwoPoints();
//        showSecondMaxValue(15, 56, 66, 4, 29, 87, 54, 59, 88, 66);
//        isValuesSimple(8, 15, 9);
//        calculateSumOfFactorials(1, 9);
//        sumOfThreeValues(1, 2, 3, 4, 5, 6);
        showAreaOfQuadrangle(6, 4, 8, 10);

    }
}
