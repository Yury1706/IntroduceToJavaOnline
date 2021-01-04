package BasicsOfOOP.DragonAndJewels.domain;

public class DragonCave {

    private Jewel[] jewels = new Jewel[100];

    public DragonCave() {
        for (int i = 0; i < jewels.length; i++) {
            jewels[i] = new Jewel(i + 1, (int) (Math.random() * 1000 + 1));
        }
    }

    public void showAllJewelsInCave() {
        for (int i = 0; i < jewels.length; i++) {
            System.out.println(jewels[i]);
        }
    }

    public void showJewelWithTheBiggestValue() {
        double maxValue = 0;
        int maxIndex = 0;
        for (int i = 0; i < jewels.length; i++) {
            if (jewels[i].getValue() > maxValue) {
                maxValue = jewels[i].getValue();
                maxIndex = i;
            }
        }
        System.out.println(jewels[maxIndex]);
    }

    public void showJewelsWithValueLessThanUserInput(int userInput) {
        for (int i = 0; i < jewels.length; i++) {
            if (jewels[i].getValue() <= userInput) {
                System.out.println(jewels[i]);
            }
        }
    }
}
