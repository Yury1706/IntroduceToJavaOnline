package BasicsOfOOP.DragonAndJewels.demo;

import BasicsOfOOP.DragonAndJewels.domain.DragonCave;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Идет загрузка сокровищ в пещеру дракона...");
        DragonCave dragonCave = new DragonCave();

        System.out.println("Сокровища загружены, хотите просмотреть все сокровища в пещере? Да/Нет");
        String userAnswer = scanner.nextLine();
        if (userAnswer.equalsIgnoreCase("Да")) {
            dragonCave.showAllJewelsInCave();
        }

        System.out.println("Показать самое дорогое по стоимости сокровище? Да/Нет");
        String userAnswer2 = scanner.nextLine();
        if (userAnswer2.equalsIgnoreCase("Да")) {
            dragonCave.showJewelWithTheBiggestValue();
        }

        System.out.print("Введите сумму, до которой стоит показать сокровища - ");
        int userValue = scanner.nextInt();
        dragonCave.showJewelsWithValueLessThanUserInput(userValue);
    }
}
