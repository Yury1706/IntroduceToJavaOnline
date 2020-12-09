package StringsAndBasicsOfTextProcessing;

import java.util.Arrays;

public class ModuleTwo {

    public static void main(String[] args) {
        System.out.println("Задание №1");
        showMaxValueOfRepeatedSpaces("                It   is very long string     in this sentences,    but i hope you are       not tired");
        System.out.println("Задание №2");
        changeAToAB("abra kadabra");
        System.out.println("Задание №3");
        isThisWordPalindrome("А роза упала на лапу Азора");
        System.out.println("Задание №4");
        wordPuzzle("информатика");
        System.out.println("Задание №5");
        findCharA("Аааа вот и наш пример для самопроверки");
        System.out.println("Задание №6");
        makeStringWithDoubleChars("abcd");
        System.out.println("Задание №7");
        deleteSpacesAndDoubleChars("abc cde def");
        System.out.println("Задание №8");
        showTheBiggestWord("user is always right however this statement is not always right");
        System.out.println("Задание №9");
        countUpperAndLowerCaseLetters("Hi, my name is YURY");
        System.out.println("Задание №10");
        countSentences("Привет! Чего грустишь? Проснись, улыбнись и вперед к людям. Ты еще тут?");
    }

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
        System.out.printf("Максимальное число повторяющихся пробелов в строке \n'" + userInputString + "' \nравно: %d\n", maxValue);
        System.out.println();
    }

    public static void changeAToAB(String userInputString) {
        String outputString = userInputString.replaceAll("a", "ab");
        System.out.println("В строке '" + userInputString + "' заменили все символы 'a' на 'ab', и получили следующую строку: " + outputString);
        System.out.println();
    }

    public static void isThisWordPalindrome(String userWord) {
        String inputString = userWord.toLowerCase().replaceAll(" ", "");

        for (int i = 0; i <= inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                System.out.println("Строка '" + userWord + "' не палиндром");
                return;
            }
        }
        System.out.println("Строка '" + userWord + "' палиндром");
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
        System.out.printf("Вот столько раз встречается символ 'a' в введенной строке '" + userInputString + "' -  %d", count);
        System.out.println();
    }

    public static void makeStringWithDoubleChars(String userInputString) {
        StringBuilder outputString = new StringBuilder();
        for (int i = 0; i < userInputString.length(); i++) {
            outputString.append(userInputString.charAt(i));
            outputString.append(userInputString.charAt(i));
        }
        System.out.println("Из введенной строки '" + userInputString + "' получили новую строку с повтором каждого символа - " + outputString);
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
        System.out.println("Введенная строка '" + userInputString + "'");
        System.out.println("Новая строка без повторных символов: " + outputString);
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
        System.out.println("Самое длинное слово в строке '" + userInputString + "' - " + arrayOfStrings[maxIndex]);
        System.out.println();
    }

    public static void countUpperAndLowerCaseLetters(String userInputString) {
        int countUpperCaseLetters = 0;
        int countLowerCaseLetters = 0;

        for (int i = 0; i < userInputString.length(); i++) {
            if (Character.isLetter(userInputString.charAt(i)) && Character.isUpperCase(userInputString.charAt(i))) {
                countUpperCaseLetters++;
            } else if (Character.isLetter(userInputString.charAt(i)) && Character.isLowerCase(userInputString.charAt(i))) {
                countLowerCaseLetters++;
            }
        }
        System.out.printf("Количество прописных букв в введенной строке '" + userInputString + "' равно: %d", countUpperCaseLetters);
        System.out.printf("\nКоличество строчных букв в введенной строке '" + userInputString + "'равно: %d", countLowerCaseLetters);
        System.out.println();
    }

    public static void countSentences(String userInputString) {
        int count = 0;
        for (int i = 0; i < userInputString.length(); i++) {
            if (userInputString.charAt(i) == '.' || userInputString.charAt(i) == '!' || userInputString.charAt(i) == '?') {
                count++;
            }
        }
        System.out.printf("Количество предложений в введенной строке '" + userInputString + "' равно: %d", count);
    }
}
