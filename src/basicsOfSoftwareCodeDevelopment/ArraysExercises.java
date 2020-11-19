package basicsOfSoftwareCodeDevelopment;

import java.util.Scanner;

public class ArraysExercises {

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
    }

    public void valueOfFunction() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите значение начала отрезка: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение конца отрезка: ");
        int b = scanner.nextInt();
        System.out.print("Введите шаг");
    }

    public static void main(String[] args) {
        ArraysExercises exercise1 = new ArraysExercises();
        exercise1.showSumUntilValue();
    }
}
