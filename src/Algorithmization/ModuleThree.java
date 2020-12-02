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
    }

    public static void main(String[] args) {
//        uniteArrays();
//        buildSequence();
//        selectionSort();
        bubbleSort();
    }
}
