package Algorithmization;

public class ModuleThree {

    public static void uniteArrays() {
        int k = 4;
        int i1 = 0;
        int i2 = 0;
        int[] arrayOne = {5, 8, 4, 9, 10};
        int[] arrayTwo = {45, 6, 79, 55};

        int[] sum = new int[(arrayOne.length + arrayTwo.length)];
        for (int i = 0; i < sum.length; i++) {
            if (i < k) {
                sum[i] = arrayOne[i1++];
            } else if (i2 < arrayTwo.length) {
                sum[i] = arrayTwo[i2++];
            } else
                sum[i] = arrayOne[i1++];
        }

        for (int value : sum) {
            System.out.print(value + "| ");
        }
        System.out.println();
    }

    public static void buildSequence() {
        int[] arrayOfEvenValues = {1, 3, 5, 7, 9, 11, 13};
        int[] arrayOfOddValues = {0, 2, 4, 6, 8, 10};

        int[] sequence = new int[(arrayOfEvenValues.length + arrayOfOddValues.length)];
        int indexOfSequence = 0;

        if (arrayOfEvenValues.length <= arrayOfOddValues.length) {
            for (int i = 0; i < arrayOfEvenValues.length; i++) {
                if (arrayOfEvenValues[i] < arrayOfOddValues[i]) {
                    sequence[indexOfSequence++] = arrayOfEvenValues[i];
                    sequence[indexOfSequence++] = arrayOfOddValues[i];
                } else {
                    sequence[indexOfSequence++] = arrayOfOddValues[i];
                    sequence[indexOfSequence++] = arrayOfEvenValues[i];
                }
            }
            for (int i = arrayOfEvenValues.length; i < arrayOfOddValues.length; i++) {
                sequence[indexOfSequence++] = arrayOfOddValues[i];
            }
        } else {
            for (int i = 0; i < arrayOfOddValues.length; i++) {
                if (arrayOfEvenValues[i] < arrayOfOddValues[i]) {
                    sequence[indexOfSequence++] = arrayOfEvenValues[i];
                    sequence[indexOfSequence++] = arrayOfOddValues[i];
                } else {
                    sequence[indexOfSequence++] = arrayOfOddValues[i];
                    sequence[indexOfSequence++] = arrayOfEvenValues[i];
                }
            }
            for (int i = arrayOfOddValues.length; i < arrayOfEvenValues.length; i++) {
                sequence[indexOfSequence++] = arrayOfEvenValues[i];
            }
        }

        for (int item : sequence) {
            System.out.print(item + "| ");
        }
        System.out.println();
    }

    public static void selectionSort() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }

        for (int value : array) {
            System.out.print(value + "| ");
        }
        System.out.println();
    }

    public static void bubbleSort() {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    count++;
                }
            }
        }

        for (int value : array) {
            System.out.print(value + "| ");
        }
        System.out.println("\nКоличество перестановок: " + count);
        System.out.println();
    }

    public static void insertingSort() {
        int[] array = {110, 3, 50, 7, 90, 11, 13, 4};

        for (int i = 1; i < array.length; i++) {
            changePlaces(array, i);
        }

        for (int value : array) {
            System.out.print(value + "| ");
        }
    }

    public static void changePlaces(int[] array, int i) {

        int currentValue = array[i];
        int j = i - 1;
        for (; j >= 0 && array[j] < currentValue; j--) {
            array[j + 1] = array[j];
        }
        array[j + 1] = currentValue;
    }

    public static void shellSort() {
        double[] array = {12.2, 15.4, 10, 18.7, 20.9};

        int d = 1;
        while (d < array.length / 3) {
            d = 3 * d + 1;
        }

        while (d >= 1) {
            for (int i = d; i < array.length; i++) {
                for (int j = i; j >= d && array[j] < array[j - d]; j -= d) {
                    double temp = array[j];
                    array[j] = array[j - d];
                    array[j - d] = temp;
                }
            }
            d = d / 3;
        }

        for (double value : array) {
            System.out.print(value + "| ");
        }
    }

    public static void findEnterValuesInSequence() {
        double[] arrayOfValuesA = {1.0, 3.0, 5.0, 7.0, 9.0, 11.0};
        double[] arrayOfValuesB = {2.0, 2.1, 6.0, 7.8, 10.0, 15.0};

        int j = 0;
        for (int i = 0; i < arrayOfValuesA.length; i++) {
            while (j < arrayOfValuesB.length) {
                if (arrayOfValuesA[i] > arrayOfValuesB[j]) {
                    System.out.println("Объект b(" + (j + 1) + ") нужно разместить между объектами a(" + i + ") и a(" + (i + 1) + ")");
                    j++;
                } else if (i == arrayOfValuesA.length - 1 && j < arrayOfValuesB.length) {
                    System.out.println("Остальные объекты b нужно разместить после объекта a(" + (i + 1) + ")");
                    break;
                } else break;
            }
        }
        System.out.println();
    }

    /*
    Задача 8, модуль 3
     */
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

    public static void showTheSolutionOfTheProblem() {
        int[] arrayOfP = {5, 8, 6, 4, 9};
        int[] arrayOfQ = {5, 7, 8, 9, 15};

        int totalNOK = findNOK(arrayOfQ[0], arrayOfQ[1]);
        for (int i = 2; i < arrayOfQ.length; i++) {
            totalNOK = findNOK(totalNOK, arrayOfQ[i]);
        }
        System.out.println("Наименьший общий знаменатель равен: " + totalNOK);

        // Находим дополнительный множитель и приводим дроби к исходному виду
        for (int i = 0; i < arrayOfQ.length; i++) {
            arrayOfP[i] *= totalNOK / arrayOfQ[i];
        }

        //Сортируем по числителю
        for (int i = 0; i < arrayOfP.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrayOfP.length; j++) {
                if (arrayOfP[j] < arrayOfP[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arrayOfP[minIndex];
            arrayOfP[minIndex] = arrayOfP[i];
            arrayOfP[i] = temp;
        }

        System.out.println("Отсортированные дроби по возрастанию с общим знаменателем выглядят так:");
        for (int value : arrayOfP) {
            System.out.println(value + "/" + totalNOK);
        }
        System.out.println();
    }
    /*
    Задача 8, модуль 3
    */

    public static void main(String[] args) {
        uniteArrays();
        buildSequence();
        selectionSort();
        bubbleSort();
        insertingSort();
        shellSort();
        findEnterValuesInSequence();
        showTheSolutionOfTheProblem();
    }
}
