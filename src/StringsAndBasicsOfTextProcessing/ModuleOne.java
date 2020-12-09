package StringsAndBasicsOfTextProcessing;

import java.util.Scanner;

public class ModuleOne {

    public static void main(String[] args) {
        transformCamelToSnakeCase();
        changeWord();
        findDigits("Hello 56 friend. I am 5 hero from 1945 year");
        findNumbers("Hello 56 friend. I am 5 hero from 1945 year");
        killExtraSpaces("  Hello    56   friend. I    am    5 hero  from    1945    year   ");
    }

    public static void transformCamelToSnakeCase() {
        String[] stringsArray = {"firstValue", "secondValue", "thirdValue", "firstNumberOfValue"};

        for (int i = 0; i < stringsArray.length; i++) {
            char[] charArray = stringsArray[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if (Character.isUpperCase(charArray[j])) {
                    charArray[j] = Character.toLowerCase(charArray[j]);
                    System.out.print('_');
                }
                System.out.print(charArray[j]);
            }
            System.out.println();
        }
    }

    public static void changeWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, где необходимо заменить слово \"word\" на \"letter\"");
        String inputString = scanner.nextLine();
        String outputString = inputString.replaceAll("word", "letter");
        outputString = outputString.replaceAll("Word", "letter");
        System.out.println(outputString);
        System.out.println();
    }

    public static void findDigits(String userInputString) {
        char[] arrayOfChars = userInputString.toCharArray();
        int countDigits = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            if (Character.isDigit(arrayOfChars[i])) {
                countDigits++;
            }
        }
        System.out.println(countDigits);
        System.out.println();
    }

    public static void findNumbers(String userInputString) {
        char[] arrayOfChars = userInputString.toCharArray();
        int countNumbers = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            if (Character.isDigit(arrayOfChars[i]) && arrayOfChars[i + 1] == ' ') {
                countNumbers++;
            }
        }
        System.out.println(countNumbers);
        System.out.println();
    }

    public static void killExtraSpaces(String userInputString) {
        String inputString = userInputString.trim();
        char[] arrayOfChars = inputString.toCharArray();
        String outputString = "";
        for (int i = 0; i < arrayOfChars.length; i++) {
            if (arrayOfChars[i] == ' ' && arrayOfChars[i + 1] == ' ') {
                continue;
            }
            outputString += arrayOfChars[i];
        }
        System.out.println(outputString);
        System.out.println();
    }
}
