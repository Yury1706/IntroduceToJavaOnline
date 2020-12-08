package StringsAndBasicsOfTextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class ModuleOne {

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
        char[] arrayOfChars = inputString.toCharArray();
    }

    public static void main(String[] args) {
        transformCamelToSnakeCase();
    }
}
