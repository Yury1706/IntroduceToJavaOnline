package Algorithmization;

public class PartTwo {

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

    public static void main(String[] args) {
        findPositiveValuesOnMainDiagonalOfMatrix(5);
        showMatrixTenByTwenty();
        sortStringsOfMatrix(5, 5);
        sortColumnsOfMatrix(6, 4);
        buildMatrixByZeroAndOne(8, 5);
        findMaxAndChangeNegativeValues(5,9);
    }
}
