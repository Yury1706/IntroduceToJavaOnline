package StringsAndBasicsOfTextProcessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModuleThree {

    public static String userString = "Регулярные выражения — тема, которую программисты, даже опытные, зачастую откладывают на потом. " +
            "Однако большинству Java-разработчиков рано или поздно придётся столкнуться с обработкой текстовой информации. " +
            "Ну что же может начнем?" +
            "А может пока не до этого?" +
            "\nЧаще всего — с операциями поиска в тексте и редактированием. " +
            "Без регулярных выражений продуктивный и компактный программный код, связанный с обработкой текстов, попросту немыслим. " +
            "Так что хватит откладывать, разберёмся с «регулярками» прямо сейчас! " +
            "Это не такая уж и сложная задача, не правда ли? " +
            "Но ее стоит бояться." +
            "\nНа самом деле регулярное выражение (RegEx) – это шаблон для поиска строки в тексте. " +
            "В Java исходным представлением этого шаблона всегда является строка, то есть объект класса String. " +
            "Однако не любая строка может быть скомпилирована в регулярное выражение, а только та, которая соответствует правилам написания регулярного выражения – синтаксису, определенному в спецификации языка.";

    public static String[] sortParagraphs(String userInputString) {

        System.out.println("Задание №1");
        Pattern pattern = Pattern.compile("\n");
        Pattern pattern1 = Pattern.compile(".+?[\\.|\\?|\\!]");
        String[] paragraphs = pattern.split(userInputString);           // Разбиваем на массив абзацев
        int minValueOfSentences = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            Matcher matcher = pattern1.matcher(paragraphs[i]);
            int countSentences = 0;
            while (matcher.find()) {
                countSentences++;
            }
            minValueOfSentences = countSentences;
            int minIndex = i;
            for (int j = i + 1; j < paragraphs.length; j++) {
                Matcher matcher2 = pattern1.matcher(paragraphs[j]);
                countSentences = 0;
                while (matcher2.find()) {
                    countSentences++;
                }
                if (countSentences < minValueOfSentences) {
                    String temp = paragraphs[j];
                    paragraphs[j] = paragraphs[minIndex];
                    paragraphs[minIndex] = temp;
                }
            }
        }
        for (String str : paragraphs) {
            System.out.println(str);
        }
        System.out.println();
        return paragraphs;
    }

    public static void sortWordInSentences(String[] userInputString) {
        System.out.println("Задание №1-2");

        Pattern pattern = Pattern.compile("[\\.|\\?|\\!]");
        Pattern pattern1 = Pattern.compile("[a-zа-яA-ZА-ЯёЁ0-9]+\\b");

        for (int i = 0; i < userInputString.length; i++) {
            String[] sentences = pattern.split(userInputString[i]);                   //разбиваем каждый абзац на предложения
            for (int j = 0; j < sentences.length; j++) {
                Matcher matcher = pattern1.matcher(sentences[j]);
                int countNumberOfWords = 0;
                while (matcher.find()) {
                    countNumberOfWords++;                                              //узнаем количество слов
                }
                String[] words = new String[countNumberOfWords];                       //разбиваем предложения на слова
                Matcher matcher2 = pattern1.matcher(sentences[j]);
                int index = 0;
                while (matcher2.find()) {                                              //закидываем в массив слова
                    words[index] = matcher2.group();
                    index++;
                }

                for (int k = 0; k < words.length; k++) {                             //проходим по каждому слову
                    int minIndexOfWord = k;
                    for (int l = k + 1; l < words.length; l++) {
                        if (words[l].length() < words[minIndexOfWord].length()) {
                            minIndexOfWord = l;                                    //находим наименьшее
                        }
                    }
                    String temp = words[minIndexOfWord];
                    words[minIndexOfWord] = words[k];
                    words[k] = temp;
                    System.out.print(words[k] + " ");                           //печатаем наименьшее
                }
                System.out.println();
            }
        }
    }

    public static void sortLexemes(String[] string) {
        System.out.println("Задание №1-3");

        char ch = 'о';
        Pattern pattern = Pattern.compile("[\\.|\\?|\\!]");
        Pattern pattern1 = Pattern.compile("([a-zа-яA-ZА-ЯёЁ]+)?[Оо].+?\\b");
        Pattern pattern2 = Pattern.compile("[Character.toString(ch).toLowerCase() | Character.toString(ch).toUpperCase()]");


        for (int i = 0; i < string.length; i++) {
            String[] sentences = pattern.split(string[i]);                   //разбиваем каждый абзац на предложения

            for (int j = 0; j < sentences.length; j++) {
                Matcher matcher = pattern1.matcher(sentences[j]);
                int countNumberOfWords = 0;
                while (matcher.find()) {
                    countNumberOfWords++;                                              //узнаем количество слов
                }
                String[] words = new String[countNumberOfWords];                       //разбиваем предложения на слова
                Matcher matcher2 = pattern1.matcher(sentences[j]);
                int index = 0;
                while (matcher2.find()) {                                              //закидываем в массив слова
                    words[index] = matcher2.group();
                    index++;
                }
                for (int k = 0; k < words.length; k++) {                                //перебор по словам
                    int hits = 0;
                    for (int l = 0; l < words[k].length(); l++) {                       //перебор по символам в слове
                        if (words[k].charAt(l) == ch) {
                            hits++;
                        }
                    }
                    int maxValue = hits;
                    int maxIndex = k;

                    for (int l = k + 1; l < words.length; l++) {                        //сравнение со следующим словом
                        hits = 0;
                        for (int m = 0; m < words[l].length(); m++) {
                            if (words[l].charAt(m) == ch) {
                                hits++;
                            }
                        }
                        if (hits > maxValue) {
                            maxIndex = l;
                        }
                    }
                    String temp = words[maxIndex];
                    words[maxIndex] = words[k];
                    words[k] = temp;
                }
                for (int k = 0; k < words.length; k++) {
                    System.out.print(words[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        String[] string = sortParagraphs(userString);
//        sortWordInSentences(string);
        sortLexemes(string);
    }
}
