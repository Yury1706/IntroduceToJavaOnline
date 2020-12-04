package Algorithmization;

import java.util.Scanner;

public class ModuleTwo {

    public static void main(String[] args) {
        showOddColumnWhereFirstValueIsMoreThanLast(5, 9);
        showDiagonalValues(5);
        showStringAndColumnOfTheMatrix(5, 6, 2, 3);
        showSquareMatrixFirstExercise(6);
        showSquareMatrixSecondExercise(10);
        showSquareMatrixThirdExercise(8);
        showSquareMatrixAndCountPositiveValues(4);
        changeColumn(5, 7);
        showSumAndMaxSumOfColumns(4,5);
        findPositiveValuesOnMainDiagonalOfMatrix(5);
        showMatrixTenByTwenty();
        sortStringsOfMatrix(5, 5);
        sortColumnsOfMatrix(6, 4);
        buildMatrixByZeroAndOne(8, 5);
        findMaxAndChangeNegativeValues(5,9);
    }

    public static void showOddColumnWhereFirstValueIsMoreThanLast(int numOfStrings, int numOfColumns) {
        int[][] arrayOfValues = new int[numOfStrings][numOfColumns];

        for (int i = 0; i < numOfStrings; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                arrayOfValues[i][j] = (int) (Math.random() * 61 - 30);
            }
        }

        System.out.println("Первоначально матрица выглядит так: ");
        for (int[] array : arrayOfValues) {
            for (int value : array) {
                System.out.printf("|%3d|", value);
            }
            System.out.println();
        }

        System.out.println("Нечетные столбцы в которых первый элемент больше последнего: ");
        for (int i = 0; i < numOfStrings; i++) {
            for (int j = 0; j < numOfColumns; j += 2) {
                if (arrayOfValues[0][j] > arrayOfValues[numOfStrings - 1][j]) {
                    System.out.printf("|%3d|", arrayOfValues[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void showDiagonalValues(int numOfStringsAndColumns) {
        int[][] arrayOfValues = new int[numOfStringsAndColumns][numOfStringsAndColumns];

        for (int i = 0; i < numOfStringsAndColumns; i++) {
            for (int j = 0; j < numOfStringsAndColumns; j++) {
                arrayOfValues[i][j] = (int) (Math.random() * 51);
            }
        }

        System.out.println("Первоначально матрица выглядит так: ");
        for (int[] array : arrayOfValues) {
            for (int value : array) {
                System.out.printf("|%2d|", value);
            }
            System.out.println();
        }

        System.out.println("Элементы, которые стоят по диагонале в матрице:");
        for (int i = 0; i < numOfStringsAndColumns; i++) {
            System.out.print(arrayOfValues[i][i] + " ");
        }
        System.out.println();
    }

    public static void showStringAndColumnOfTheMatrix(int numOfStrings, int numOfColumns,
                                                      int kString, int pColumn) {
        int[][] arrayOfValues = new int[numOfStrings][numOfColumns];

        for (int i = 0; i < numOfStrings; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                arrayOfValues[i][j] = (int) (Math.random() * 21 - 10);
            }
        }

        System.out.println("Первоначально матрица выглядит так: ");
        for (int[] array : arrayOfValues) {
            for (int value : array) {
                System.out.printf("|%3d|", value);
            }
            System.out.println();
        }

        System.out.println("Строка из матрицы по значению пользователя: ");
        for (int i = 0; i < numOfColumns; i++) {
            System.out.print(arrayOfValues[kString - 1][i] + " ");
        }

        System.out.println("\nСтолбец из матрицы по значению пользователя: ");
        for (int i = 0; i < numOfStrings; i++) {
            System.out.println(String.format("|%3d|", arrayOfValues[i][pColumn - 1]));
        }
        System.out.println();
    }

    public static void showSquareMatrixFirstExercise(int sizeOfMatrix) {
        int[][] squareMatrix = new int[sizeOfMatrix][sizeOfMatrix];

        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                if (i % 2 == 0) {
                    squareMatrix[i][j] = j + 1;
                    System.out.printf("|%2d|", squareMatrix[i][j]);
                } else {
                    squareMatrix[i][j] = sizeOfMatrix - j;
                    System.out.printf("|%2d|", squareMatrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void showSquareMatrixSecondExercise(int sizeOfMatrix) {
        int[][] squareMatrix = new int[sizeOfMatrix][sizeOfMatrix];

        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                if (j < sizeOfMatrix - i) {
                    squareMatrix[i][j] = i + 1;
                    System.out.printf("|%2d|", squareMatrix[i][j]);
                } else {
                    squareMatrix[i][j] = 0;
                    System.out.printf("|%2d|", squareMatrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void showSquareMatrixThirdExercise(int sizeOfMatrix) {
        int[][] squareMatrix = new int[sizeOfMatrix][sizeOfMatrix];

        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                if (i < sizeOfMatrix / 2) {
                    if (j >= i && j < sizeOfMatrix - i) {
                        squareMatrix[i][j] = 1;
                        System.out.printf("|%1d|", squareMatrix[i][j]);
                    } else {
                        squareMatrix[i][j] = 0;
                        System.out.printf("|%1d|", squareMatrix[i][j]);
                    }
                } else {
                    if (j >= sizeOfMatrix - i - 1 && j <= i) {
                        squareMatrix[i][j] = 1;
                        System.out.printf("|%1d|", squareMatrix[i][j]);
                    } else {
                        squareMatrix[i][j] = 0;
                        System.out.printf("|%1d|", squareMatrix[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }

    public static void showSquareMatrixAndCountPositiveValues(int sizeOfMatrix) {
        double[][] squareMatrix = new double[sizeOfMatrix][sizeOfMatrix];
        int counter = 0;

        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                squareMatrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / sizeOfMatrix);
                System.out.printf("|%5.2f|", squareMatrix[i][j]);
                if (squareMatrix[i][j] > 0) {
                    counter++;
                }
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов в матрице равно: " + counter);
        System.out.println();
    }

    public static void changeColumn(int numOfStrings, int numOfColumns) {
        int[][] arrayOfValues = new int[numOfStrings][numOfColumns];

        for (int i = 0; i < numOfStrings; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                arrayOfValues[i][j] = (int) (Math.random() * 51);
            }
        }

        System.out.println("Первоначально матрица выглядит так: ");
        for (int[] array : arrayOfValues) {
            for (int value : array) {
                System.out.printf("|%3d|", value);
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номера столбцов для замены.");
        System.out.print("Номер первого столбца: ");
        int numOfFirstColumn = scanner.nextInt();
        System.out.print("Номер второго столбца: ");
        int numOfSecondColumn = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < numOfStrings; i++) {
            int temp = arrayOfValues[i][numOfFirstColumn - 1];
            arrayOfValues[i][numOfFirstColumn - 1] = arrayOfValues[i][numOfSecondColumn - 1];
            arrayOfValues[i][numOfSecondColumn - 1] = temp;
        }

        System.out.println("Теперь матрица выглядит так: ");
        for (int[] array : arrayOfValues) {
            for (int value : array) {
                System.out.printf("|%3d|", value);
            }
            System.out.println();
        }
    }

    public static void showSumAndMaxSumOfColumns(int numOfStrings, int numOfColumns) {
        int[][] arrayOfValues = new int[numOfStrings][numOfColumns];

        for (int i = 0; i < numOfStrings; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                arrayOfValues[i][j] = (int) (Math.random() * 50 + 1);
            }
        }

        System.out.println("Матрица выглядит так: ");
        for (int[] array : arrayOfValues) {
            for (int value : array) {
                System.out.printf("|%3d|", value);
            }
            System.out.println();
        }

        int maxSum = 0;
        System.out.println("Суммы значений по столбцам:");
        for (int i = 0; i < numOfColumns; i++) {
            int sum = 0;
            for (int j = 0; j < numOfStrings; j++) {
                sum += arrayOfValues[j][i];
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
            System.out.printf("|%3d|", sum);
        }
        System.out.print("\nМаксимальное значение сумм равно: " + maxSum);
        System.out.println();
    }

    public static void findPositiveValuesOnMainDiagonalOfMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 101 - 50);
            }
        }

        System.out.println("Первоначально матрица выглядит так: ");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.printf("|%4d|", value);
            }
            System.out.println();
        }

        System.out.print("Положительные элементы главной диагонали квадратной матрицы: ");
        for (int i = 0; i < size; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }
        System.out.println();
    }

    public static void showMatrixTenByTwenty() {
        int[][] matrix = new int[10][20];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }

        System.out.println("Первоначально матрица выглядит так: ");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.printf("|%3d|", value);
            }
            System.out.println();
        }

        System.out.print("Номера строк, в которых цифра 5 встречается больше 3 раз: ");
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                    if (count == 3) {
                        System.out.print(i + 1 + " ");
                        break;
                    }
                }
            }
        }
        System.out.println();
    }

    public static void sortStringsOfMatrix(int stringSize, int columnSize) {
        int[][] matrix = new int[stringSize][columnSize];

        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                matrix[i][j] = (int) (Math.random() * 101 - 50);
            }
        }

        System.out.println("Первоначально матрица выглядит так: ");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.printf("|%4d|", value);
            }
            System.out.println();
        }

        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < columnSize - 1; j++) {
                for (int k = j + 1; k < columnSize; k++) {
                    if (matrix[i][k] < matrix[i][j]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][j];
                        matrix[i][j] = temp;
                    }
                }
            }
        }

        System.out.println("Отсортированная по строкам по возрастанию матрица выглядит так: ");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.printf("|%4d|", value);
            }
            System.out.println();
        }

        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < columnSize - 1; j++) {
                int maxIndex = j;
                for (int k = j + 1; k < columnSize; k++) {
                    if (matrix[i][k] > matrix[i][j]) {
                        maxIndex = k;
                    }
                }
                int temp = matrix[i][maxIndex];
                matrix[i][maxIndex] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        System.out.println("Отсортированная по строкам по убыванию матрица выглядит так: ");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.printf("|%4d|", value);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void sortColumnsOfMatrix(int stringSize, int columnSize) {
        int[][] matrix = new int[stringSize][columnSize];

        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                matrix[i][j] = (int) (Math.random() * 101 - 50);
            }
        }

        System.out.println("Первоначально матрица выглядит так: ");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.printf("|%4d|", value);
            }
            System.out.println();
        }

        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < stringSize - 1; j++) {
                for (int k = j + 1; k < stringSize; k++) {
                    if (matrix[k][i] < matrix[j][i]) {
                        int temp = matrix[k][i];
                        matrix[k][i] = matrix[j][i];
                        matrix[j][i] = temp;
                    }
                }
            }
        }

        System.out.println("Отсортированная по столбцам по возрастанию матрица выглядит так: ");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.printf("|%4d|", value);
            }
            System.out.println();
        }

        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < stringSize - 1; j++) {
                for (int k = j + 1; k < stringSize; k++) {
                    if (matrix[k][i] > matrix[j][i]) {
                        int temp = matrix[k][i];
                        matrix[k][i] = matrix[j][i];
                        matrix[j][i] = temp;
                    }
                }
            }
        }

        System.out.println("Отсортированная по столбцам по убыванию матрица выглядит так: ");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.printf("|%4d|", value);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void buildMatrixByZeroAndOne(int stringSize, int columnSize) {
        int[][] matrix = new int[stringSize][columnSize];

        for (int i = 0; i < columnSize; i++) {
            int countOne = 0;
            int countZero = 0;
            for (int j = 0; j < stringSize; j++) {
                matrix[j][i] = (int) (Math.random() * 2);
                if (matrix[j][i] == 0) {
                    countZero++;
                    if (countZero >= stringSize - i - 1) {
                        matrix[j][i] = 1;
                    }
                }
                if (matrix[j][i] == 1) {
                    countOne++;
                    if (countOne > i + 1) {
                        matrix[j][i] = 0;
                        countZero++;
                    }
                }
            }
        }

        System.out.println("Матрица с \"1\" и \"0\", где  выглядит так:");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.printf("|%2d|", value);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void findMaxAndChangeNegativeValues(int stringSize, int columnSize) {
        int[][] matrix = new int[stringSize][columnSize];

        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                matrix[i][j] = (int) (Math.random() * 51);
            }
        }

        System.out.println("Первоначально матрица выглядит так: ");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.printf("|%3d|", value);
            }
            System.out.println();
        }

        int maxValue = matrix[0][0];
        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }

        for (int i = 0; i < stringSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = maxValue;
                }
            }
        }
        System.out.println("После замены нечетных элементов на больший элемент в матрице, " +
                "матрица выглядит так: ");
        for (int[] array : matrix) {
            for (int value : array) {
                System.out.printf("|%3d|", value);
            }
            System.out.println();
        }
        System.out.println();
    }
}
