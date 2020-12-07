package Algorithmization;

import java.math.BigInteger;
import java.util.Arrays;

public class ModuleFour {

    public static void main(String[] args) {
//        showResultsOfNOKAndNOD(12, 30);
//        findNODForFourValues(78, 294, 570, 36);
//        calculateArea(4);
//        findTheBiggestLengthBetweenTwoPoints();
//        showSecondMaxValue(15, 56, 66, 4, 29, 87, 54, 59, 88, 66);
//        isValuesSimple(8, 15, 9);
//        calculateSumOfFactorials(1, 9);
//        sumOfThreeValues(1, 2, 3, 4, 5, 6);
//        showAreaOfQuadrangle(6, 4, 8, 10);
//        showNumbersOfValue(4798765);
//        whichOneIsMore(12345, 123456);
//        buildArray(9, 100);
//        findTwinsNumbers(2, 315);
//        getArmstrongValues(5_000_000);
//        showNumbersWithIncreasingSequence(10000);
//        showSumOfValuesWithOddNumbers(1510);
        countOperations(51);
    }

    /*
    Эти методы будут использоваться в других статических методах
     */

    public static BigInteger getFactorial(int n) {          // Перевел в BigInteger, т.к. в задании 13 нужны большие значения... Сперва был Long
        BigInteger result;
        if (n == 1) {
            return BigInteger.valueOf(1);
        }
        result = getFactorial(n - 1).multiply(BigInteger.valueOf(n));
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

    public static int getDegree(int number) {
        int degreeN = 0;
        for (int i = number; i > 0; i /= 10) {
            degreeN++;
        }
        return degreeN;
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
        BigInteger totalSum = new BigInteger("0");
        for (int i = firstBorderValue; i <= lastBorderValue; i++) {
            if (i % 2 != 0) {
                totalSum = totalSum.add(getFactorial(i));
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

    public static void showNumbersOfValue(int userValue) {
        int count = 0;
        for (int i = userValue; i > 0; i /= 10) {
            count++;
        }

        int[] numberOfUserValue = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            int item = userValue % 10;
            numberOfUserValue[i] = item;
            userValue /= 10;
        }
        System.out.println("Вот все цифры из вашего введенного числа: " + Arrays.toString(numberOfUserValue));
        System.out.println();
    }

    public static void whichOneIsMore(int firstValue, int secondValue) {
        int countFirst = 0;
        int countSecond = 0;

        for (int i = firstValue; i > 0; i /= 10) {
            countFirst++;
        }

        for (int i = secondValue; i > 0; i /= 10) {
            countSecond++;
        }

        if (countFirst == countSecond) {
            System.out.println("В введенных числах одинаковое количество цифр.");
        } else if (countFirst > countSecond) {
            System.out.println("У первого числа больше цифр чем у второго");
        } else {
            System.out.println("У второго числа больше цифр чем у первого");
        }
        System.out.println();
    }

    public static void buildArray(int k, int n) {
        int[] arrayOfNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            arrayOfNumbers[i] = i + 1;
        }

        int count = 0;
        for (int i = arrayOfNumbers.length - 1; i > count; i--) {
            int result = 0;
            for (int j = arrayOfNumbers[i]; j > 0; j /= 10) {
                result += j % 10;
            }
            if (result == k) {
                int temp = arrayOfNumbers[i];
                arrayOfNumbers[i] = arrayOfNumbers[count];
                arrayOfNumbers[count] = temp;
                count++;
                i++;
            }
        }

        int[] hits = new int[count];
        for (int i = 0; i < count; i++) {
            hits[i] = arrayOfNumbers[i];
        }

        for (int i = 0; i < hits.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < hits.length; j++) {
                if (hits[j] < hits[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = hits[minIndex];
            hits[minIndex] = hits[i];
            hits[i] = temp;
        }
        System.out.println(Arrays.toString(hits));
        System.out.println();
    }

    public static void findTwinsNumbers(int n, int n2) {
        int[] array = new int[n2 - n + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            n++;
        }

        for (int i = 0; i < array.length; i++) {
            BigInteger result = getFactorial(array[i] - 1).add(BigInteger.ONE).multiply(BigInteger.valueOf(4)).add(BigInteger.valueOf(array[i]));
            BigInteger denominator = BigInteger.valueOf(array[i] * (array[i] + 2));
            if (result.mod(denominator) == BigInteger.ZERO) {
                System.out.printf("\nПара - близнецы: %,d и %,d", array[i], array[i + 2]);
            }
        }
        System.out.println();
    }

    public static void getArmstrongValues(int k) {
        int[] arrayOfNumbers = new int[k];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = i + 1;
        }

        int count = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int result = 0;
            int degreeN = getDegree(arrayOfNumbers[i]);
            for (int j = arrayOfNumbers[i]; j > 0; j /= 10) {
                result += Math.pow(j % 10, degreeN);
            }
            if (result == arrayOfNumbers[i]) {
                System.out.printf("|%,d| ", arrayOfNumbers[i]);
            }
        }
        System.out.println();
    }

    public static void showNumbersWithIncreasingSequence(int lastValue) {
        for (int i = 1; i <= lastValue; i++) {
            int degree = getDegree(i);          //Использовал этот метод, хотя лучше было бы сделать метод countNumbersOfValue, но реализация была бы такая же
            int hitsOnTarget = 0;
            int input = i;
            for (int j = 0; j < degree && input / 10 > 0; j++) {
                if ((input % 10) - ((input / 10) % 10) == 1) {
                    hitsOnTarget++;
                }
                input /= 10;
            }
            if (hitsOnTarget == degree - 1) {   //degree - 1, т.к. мы не сравниваем самую левую цифру с "0", если надо убрать из списка от 1-9, то добавим условие (&& hitsOnTarget > 0)
                System.out.printf("|%,d|", i);
            }
        }
        System.out.println();
    }

    public static void showSumOfValuesWithOddNumbers(int lastValue) {
        int sum = 0;
        for (int i = 1; i <= lastValue; i++) {
            int degree = getDegree(i);          //Использовал этот метод, хотя лучше было бы сделать метод countNumbersOfValue, но реализация была бы такая же
            int hitsOnTarget = 0;
            for (int input = i; input > 0; input /= 10) {
                if ((input % 10) % 2 != 0) {
                    hitsOnTarget++;
                }
            }

            if (hitsOnTarget == degree) {
                sum += i;
            }
        }
        System.out.printf("\nСумма всех чисел, содержащих нечетные цифры, равна: %,d", sum);

        int countEvenNumbers = 0;
        for (int i = sum; i > 0; i /= 10) {
            if ((i % 10) % 2 == 0 && i % 10 != 0) {
                countEvenNumbers++;
            }
        }
        System.out.printf("\nКоличество четных цифр в найденной сумме равно %d", countEvenNumbers);
        System.out.println();
    }

    /*
    Задача 17
     */

    public static void countOperations(int userValue) {
        int count = 0;
        for (int input = userValue; input != 0; input -= calculateSumOfNumbers(input)) {
            count++;
        }
        System.out.printf("Число вычитаний для получения нуля равно - %,d", count);
    }

    public static int calculateSumOfNumbers(int value) {
        int sum = 0;
        for (int i = value; i > 0; i /= 10) {
            sum += (i % 10);
        }
        return sum;
    }

    /*
    Задача 17
     */
}
