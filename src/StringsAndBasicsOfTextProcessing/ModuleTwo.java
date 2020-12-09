package StringsAndBasicsOfTextProcessing;

import java.util.Arrays;

public class ModuleTwo {

    public static void showMaxValueOfRepeatedSpaces(String userInputString) {
        int count = 0;
        int maxValue = 0;
        for (int i = 0; i < userInputString.length(); i++) {
            if (userInputString.charAt(i) == ' ') {
                count++;
                if (i == userInputString.length() - 1) {
                    if (count > maxValue) {
                        maxValue = count;
                    }
                    break;
                }
                if (userInputString.charAt(i + 1) != ' ') {
                    if (count > maxValue) {
                        maxValue = count;
                    }
                    count = 0;
                }
            }
        }
        System.out.println(maxValue);
        System.out.println();
    }

    public static void changeAToAB(String userInputString) {
        String outputString = userInputString.replaceAll("a", "ab");
        System.out.println(outputString);
    }

    public static void isThisWordPalindrome(String userWord) {
        String inputString = userWord.toLowerCase().replaceAll(" ", "");

        if (inputString.length() % 2 != 0) {             // Для нечетного количества букв в слове
            for (int i = 0; i <= inputString.length() / 2; i++) {
                if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                    System.out.println("Это не палиндром");
                    return;
                }
            }
            System.out.println("Это палиндром");
        } else {                                         // Для четного количества букв в слове
            for (int i = 0; i < inputString.length() / 2; i++) {
                if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                    System.out.println("Это не палиндром");
                    return;
                }
            }
            System.out.println("Это палиндром");
        }
    }

    public static void wordPuzzle(String userInputString) {
        StringBuilder outputString = new StringBuilder();
        String cake = "торт";
        int count = 0;

        for (int i = 0; i < userInputString.length(); i++) {
            if (userInputString.charAt(i) == cake.charAt(count)) {
                String str = userInputString.substring(i, i + 1);
                outputString.append(str);
                count++;
                i = -1;
                if (count == cake.length()) {
                    break;
                }
            }
        }
        System.out.println(outputString);
        System.out.println();
    }

    public static void findCharA(String userInputString) {
        StringBuilder input = new StringBuilder(userInputString.toLowerCase());     //toLowerCase() - для того чтобы учитывал и заглавные
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'а' || input.charAt(i) == 'a') {                 // второе 'a' на английском, для поиска английского значения
                count++;
            }
        }
        System.out.printf("Вот столько раз встречается символ 'a' в введенной строке %d", count);
        System.out.println();
    }

    public static void makeStringWithDoubleChars(String userInputString) {
        StringBuilder outputString = new StringBuilder();
        for (int i = 0; i < userInputString.length(); i++) {
            outputString.append(userInputString.charAt(i));
            outputString.append(userInputString.charAt(i));
        }
        System.out.println(outputString);
        System.out.println();
    }

    public static void deleteSpacesAndDoubleChars(String userInputString) {
        String inputWithoutSpaces = userInputString.trim().replaceAll(" ", "");
        String outputString = "";
        for (int i = 0; i < inputWithoutSpaces.length(); i++) {
            if (outputString.contains(Character.toString(inputWithoutSpaces.charAt(i)))) {
                continue;
            }
            outputString = outputString.concat(Character.toString(inputWithoutSpaces.charAt(i)));
        }
        System.out.println(outputString);
        System.out.println();
    }

    public static void showTheBiggestWord(String userInputString) {
        String[] arrayOfStrings = userInputString.split(" ");
        int maxIndex = 0;
        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i].length() > arrayOfStrings[maxIndex].length()) {
                maxIndex = i;
            }
        }
        System.out.println("Самое длинное слово в строке - " + arrayOfStrings[maxIndex]);
    }

    public static void main(String[] args) {
//        showMaxValueOfRepeatedSpaces("                It   is very long string     in this sentences,    but i hope you are       not tired");
//        changeAToAB("abra kadabra");
//        isThisWordPalindrome("А роза упала на лапу Азора");
//        wordPuzzle("информатика");
//        findCharA("Аааа вот и наш пример для самопроверки");
//        makeStringWithDoubleChars("abcd");
//        deleteSpacesAndDoubleChars("abc cde def");
        showTheBiggestWord("user is always right however this statement is not always right");
    }
}
