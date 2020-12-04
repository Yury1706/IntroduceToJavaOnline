package Algorithmization;

import java.util.Arrays;

public class ModuleOne {

    public static void main(String[] args) {
        ModuleOne ex1 = new ModuleOne();
        ex1.findSumOfElements(5, 3, 45, 6, 8, 7, 16, 24);
        ModuleOne ex2 = new ModuleOne();
        ex2.changeValueLessThanZ(10, 15, 16, 20, 31, 5, 22, 17);
        ModuleOne ex3 = new ModuleOne();
        ex3.findPositiveNegativeAndZeroValue(10);
        ModuleOne ex4 = new ModuleOne();
        ex4.changeMinAndMaxValue(10);
        ModuleOne ex5 = new ModuleOne();
        ex5.printValueIfIndexLessThanValue(10);
        ModuleOne ex6 = new ModuleOne();
        ex6.printValueWithPrimeNumberIndex(14);
        ModuleOne ex7 = new ModuleOne();
        ex7.findMaxValue(4);
        ModuleOne ex8 = new ModuleOne();
        ex8.removeMinValue(10);
        ModuleOne ex9 = new ModuleOne();
        ex9.findTheMostRepeatableValue(10);
        ModuleOne ex10 = new ModuleOne();
        ex10.throwFromArraySecondElement(10);
    }

    private void findSumOfElements(int... n) {
        int k = 3;
        int sum = 0;
        int[] arrayN = new int[n.length];
        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = n[i];
            if (arrayN[i] % k == 0) {
                sum += arrayN[i];
            }
        }
        System.out.println("Сумма элементов, кратных k равна: " + sum);
        System.out.println();
    }

    private void changeValueLessThanZ(int... a) {
        int z = 16;
        int count = 0;
        int[] arrayA = new int[a.length];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = a[i];
            if (arrayA[i] > z) {
                arrayA[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(arrayA));
        System.out.println("Количество замен равно: " + count);
        System.out.println();
    }

    private void findPositiveNegativeAndZeroValue(int n) {
        int[] arrayN = new int[n];
        int countPositiveValue = 0;
        int countNegativeValue = 0;
        int countZeroValue = 0;

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = (int) (Math.random() * 21 - 10);
        }

        for (int i = 0; i < arrayN.length; i++) {
            if (arrayN[i] > 0) {
                countPositiveValue++;
            } else if (arrayN[i] < 0) {
                countNegativeValue++;
            } else countZeroValue++;
        }

        System.out.println(Arrays.toString(arrayN));
        System.out.println("Количество положительных элементов в массиве равно: " +
                countPositiveValue);
        System.out.println("Количество отрицательных элементов в массиве равно: " +
                countNegativeValue);
        System.out.println("Количество нулевых элементов в массиве равно: " +
                countZeroValue);
        System.out.println();
    }

    private void changeMinAndMaxValue(int n) {
        int[] arrayN = new int[n];
        int minIndexValue = 0;
        int maxIndexValue = 0;

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = (int) (Math.random() * 101 - 50);
        }
        System.out.println("Первоначально массив выглядит вот так:");
        System.out.println(Arrays.toString(arrayN));

        for (int i = 1; i < arrayN.length; i++) {
            if (arrayN[i] < arrayN[minIndexValue]) {
                minIndexValue = i;
            }
            if (arrayN[i] > arrayN[maxIndexValue]) {
                maxIndexValue = i;
            }
        }

        int someInt = arrayN[minIndexValue];
        arrayN[minIndexValue] = arrayN[maxIndexValue];
        arrayN[maxIndexValue] = someInt;
        System.out.println("Массив после замены максимального значения с минимальным выглядит так:");
        System.out.println(Arrays.toString(arrayN));
        System.out.println();
    }

    private void printValueIfIndexLessThanValue(int n) {
        int[] arrayN = new int[n];

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = (int) (Math.random() * 11);
        }

        System.out.println("Первоначально массив выглядит вот так:");
        System.out.println(Arrays.toString(arrayN));

        for (int i = 0; i < arrayN.length; i++) {
            if (arrayN[i] > i && i != arrayN.length - 1) {
                System.out.print(arrayN[i] + " ");
            }
        }
        System.out.println();
    }

    private void printValueWithPrimeNumberIndex(int n) {
        double[] arrayN = new double[n];
        double sum = 0;

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = Math.random() * 200 - 100;
        }

        System.out.println("Первоначально массив выглядит вот так:");
        System.out.println(Arrays.toString(arrayN));

        for (int index = 2; index < n; index++) {
            int count = 0;
            for (int i = 1; i <= index / i; i++) {
                if (index % i == 0) {
                    count++;
                }
            }
            if (count < 2) {
                sum += arrayN[index];
            }
        }
        System.out.println("\nСумма элементов с индексом простого числа:\n" + sum);
        System.out.println();
    }

    private void findMaxValue(int n) {
        double[] arrayN = new double[n];

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = Math.random() * 20 - 10;
        }

        System.out.println("Первоначально массив выглядит вот так:");
        System.out.println(Arrays.toString(arrayN));

        double maxValue = 0;
        switch (n) {
            case 0:
                System.out.println("Нет максимального значения");
                break;
            case 1:
                maxValue = arrayN[0];
                break;
            case 2:
                maxValue = arrayN[0] + arrayN[1];
                break;
            default:
                if (n % 2 == 0) {
                    maxValue = arrayN[0] + arrayN[arrayN.length - 1];
                    for (int i = 1; i < arrayN.length / 2; i++) {
                        if ((arrayN[i] + arrayN[(arrayN.length - 1) - i]) > maxValue) {
                            maxValue = arrayN[i] + arrayN[(arrayN.length - 1) - i];
                        }
                    }
                }
                if (n % 2 != 0) {
                    maxValue = arrayN[0] + arrayN[arrayN.length - 1];
                    for (int i = 1; i <= arrayN.length / 2; i++) {
                        if (i == (arrayN.length - 1) - i) {
                            if (arrayN[i] > maxValue) {
                                maxValue = arrayN[i];
                            }
                        } else if ((arrayN[i] + arrayN[(arrayN.length - 1) - i]) > maxValue) {
                            maxValue = arrayN[i] + arrayN[(arrayN.length - 1) - i];
                        }
                    }
                }
        }
        System.out.println("Максимальное значение суммы равно: " + maxValue);
        System.out.println();
    }

    private void removeMinValue(int n) {
        int[] arrayN = new int[n];

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = (int) (Math.random() * 6);
        }

        System.out.println("Первоначально массив выглядит вот так:");
        System.out.println(Arrays.toString(arrayN));

        int minValue = arrayN[0];
        for (int i = 1; i < arrayN.length; i++) {
            minValue = Math.min(arrayN[i], minValue);
        }
        int countMinValue = 0;
        for (int i = 0; i < arrayN.length; i++) {
            if (arrayN[i] == minValue) {
                countMinValue++;
            }
        }
        int[] arrayWithoutMinValues = new int[arrayN.length - countMinValue];
        for (int i = 0, j = 0; i < arrayN.length; i++) {
            if (arrayN[i] == minValue) {
                continue;
            }
            arrayWithoutMinValues[j++] = arrayN[i];
        }

        System.out.println("Массив без минимальных значений:");
        System.out.println(Arrays.toString(arrayWithoutMinValues));
        System.out.println();
    }

    private void findTheMostRepeatableValue(int n) {
        int[] arrayN = new int[n];
        int countOfTheMostRepeatableValue = 1;
        int indexOfTheMostRepetableValue = 0;

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = (int) (Math.random() * 11);
        }
        System.out.println("Первоначально массив выглядит вот так:");
        System.out.println(Arrays.toString(arrayN));

        for (int i = 0; i < arrayN.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < arrayN.length; j++) {
                if (arrayN[i] == arrayN[j]) {
                    counter++;
                }
            }
            if (counter == countOfTheMostRepeatableValue) {
                if (arrayN[i] < arrayN[indexOfTheMostRepetableValue]){
                    indexOfTheMostRepetableValue = i;
                }
            }
            if (counter > countOfTheMostRepeatableValue) {
                countOfTheMostRepeatableValue = counter;
                indexOfTheMostRepetableValue = i;
            }
        }
        System.out.println("Самый часто встречающийся элемент массива: "
                + arrayN[indexOfTheMostRepetableValue]);
        System.out.println("Число повторов: " + countOfTheMostRepeatableValue);
        System.out.println();
    }

    private void throwFromArraySecondElement(int n) {
        int[] arrayN = new int[n];

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = (int) (Math.random() * 11);
        }
        System.out.println("Первоначально массив выглядит вот так:");
        System.out.println(Arrays.toString(arrayN));

        for (int i = 0; i < arrayN.length; i++) {
            if (i % 2 != 0) {
                arrayN[i] = 0;
            }
        }

        int j = 0;
        for (int i = 1; i < arrayN.length; i++) {
            if (i % 2 == 0) {
                arrayN[++j] = arrayN[i];
                arrayN[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayN));
    }
}
