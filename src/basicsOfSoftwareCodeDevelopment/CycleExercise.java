package basicsOfSoftwareCodeDevelopment;

import java.math.BigInteger;
import java.util.Scanner;

public class CycleExercise {

    public void showSumUntilValue() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int userValue = scanner.nextInt();
        for (int i = 1; i <= userValue; i++) {
            result += i;
        }
        System.out.println("Результат суммирования всех целых чисел до введенной цифры равен: "
                + result);
        System.out.println();
    }

    public void valueOfFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение начала отрезка: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите значение конца отрезка: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите шаг: ");
        int h = scanner.nextInt();
        scanner.nextLine();

        for (int x = a; x <= b; x += h) {
            if (x <= 2) {
                System.out.print("y = " + -x + " ");
            } else System.out.print("y = " + x + " ");
        }
        System.out.println();
    }

    public void findSumSquareFirst100Numbers() {
        double result = 0.0;
        for (int i = 1; i < 101; i++) {
            result += Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов первых ста чисел равна: " + result);
        System.out.println();
    }

    public void findMultiSquareFirst200Numbers() {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i < 201; i++) {
            res = res.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println("Произведение квадратов первых двухста чисел равна: " + res);
        System.out.println();

// Это мой вариант решения, но он в результате пишет Infinity, решение сверху найдено в инете
//        double result = 1;
//        for (int i = 2; i < 201; i++) {
//            result *= (i * i);
//        }
    }

    public void findSumOfNumberSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в числовом ряду: ");
        int numberOfValues = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите число e: ");
        double e = scanner.nextDouble();
        double sum = 0.0;
        for (int n = 1; n <= numberOfValues; n++) {
            double a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println("Сумма членов ряда, модуль которых больше или равнен заданному е, равен: "
                + sum);
        System.out.println();
    }

    public static void main(String[] args) {
//        ArraysExercises exercise1 = new ArraysExercises();
//        exercise1.showSumUntilValue();
//        ArraysExercises exercise2 = new ArraysExercises();
//        exercise2.valueOfFunction();
//        ArraysExercises exercise3 = new ArraysExercises();
//        exercise3.findSumSquareFirst100Numbers();
//        CycleExercise exercise4 = new CycleExercise();
//        exercise4.findMultiSquareFirst200Numbers();
        CycleExercise exercise5 = new CycleExercise();
        exercise5.findSumOfNumberSeries();
    }
}
