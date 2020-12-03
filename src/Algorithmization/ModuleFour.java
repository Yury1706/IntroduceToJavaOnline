package Algorithmization;

public class ModuleFour {

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

    public static void showResultsOfNOKAndNOD(int firstValue, int secondValue) {
        System.out.println("Наибольший общий делитель для " + firstValue + " и " + secondValue + " равен: " + findNOD(firstValue, secondValue));
        System.out.println("Наименьшее общее кратное для " + firstValue + " и " + secondValue + " равно: " + findNOK(firstValue, secondValue));
    }

    public static void findNODForFourValues(int... userValues) {
        int[] valuesOfUser = new int[userValues.length];
        for (int i = 0; i < valuesOfUser.length; i++) {
            valuesOfUser[i] = userValues[i];
        }
        if (valuesOfUser.length >= 2) {
            int result = findNOD(valuesOfUser[0], valuesOfUser[1]);
            for (int i = 2; i < valuesOfUser.length; i++) {
                result = findNOD(result, valuesOfUser[i]);
            }
            System.out.println(result);
        } else {
            System.out.println("Нужно больше значений. По условию должно быть 4 числа...");
        }
    }

    public static void main(String[] args) {
//        showResultsOfNOKAndNOD(12, 30);
        findNODForFourValues(78, 294, 570, 36);
    }
}
