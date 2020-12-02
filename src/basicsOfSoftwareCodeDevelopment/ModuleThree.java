package basicsOfSoftwareCodeDevelopment;

import java.math.BigInteger;
import java.util.Scanner;

public class ModuleThree {

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

    public void showSymbolAndCode() {
        for (int i = 0; i < 256; i++) {
            System.out.println("Код символа " + (char) i + " = " + i);
        }
    }

    public void findAllDividers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальное число (начало промежутка): ");
        int m = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите конечное число (конец промежутка): ");
        int n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.print("Делители числа " + i + " являются: ");
            int count = 0;
            for (int j = 2; j <= i / j; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    count++;
                    if (i / j != j) {
                        System.out.print(i / j + " ");
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.print("1 и " + i);
            }
            System.out.println();
        }
    }

    public void findRepeatedValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        int[] arrayRepeatValues = new int[10];

        while (x > 0) {
            arrayRepeatValues[x % 10]++;
            x /= 10;
        }

        String resultString = "";
        for (int i = y; i > 0; i /= 10) {
            if (arrayRepeatValues[i % 10] != 0 &&
                    !resultString.contains(Integer.toString(i % 10))) {
               resultString += i % 10 + " ";
            }
        }
        System.out.println(resultString);
    }

    public static void main(String[] args) {
        ModuleThree exercise1 = new ModuleThree();
        exercise1.showSumUntilValue();
        ModuleThree exercise2 = new ModuleThree();
        exercise2.valueOfFunction();
        ModuleThree exercise3 = new ModuleThree();
        exercise3.findSumSquareFirst100Numbers();
        ModuleThree exercise4 = new ModuleThree();
        exercise4.findMultiSquareFirst200Numbers();
        ModuleThree exercise5 = new ModuleThree();
        exercise5.findSumOfNumberSeries();
        ModuleThree exercise6 = new ModuleThree();
        exercise6.showSymbolAndCode();
        ModuleThree exercise7 = new ModuleThree();
        exercise7.findAllDividers();
        ModuleThree exercise8 = new ModuleThree();
        exercise8.findRepeatedValues();
    }
}
