package ProgrammingWithClasses;

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

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counte2 = new Counter(5);

        for (int i = 0; i < 10; i++) {
            System.out.println("Значение первого счеткика равно: " + counter1.getValue()
                    + ". Значение второго счеткика равно: " + counte2.getValue());
            counter1.plus();
            counte2.minus();
        }
    }
}
