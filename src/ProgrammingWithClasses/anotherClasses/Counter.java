package ProgrammingWithClasses.anotherClasses;

public class Counter {
    /*
    Диапазон равен от 0 до 9
     */
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public Counter() {
        this.value = 1;
    }

    public int getValue() {
        return value;
    }

    public void plus() {
        value++;
        if (value == 10) {
            value = 0;
        }
    }

    public void minus() {
        value--;
        if (value == -1) {
            value = 9;
        }
    }
}
