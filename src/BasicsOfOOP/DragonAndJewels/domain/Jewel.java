package BasicsOfOOP.DragonAndJewels.domain;

public class Jewel {

    private int id;
    private int value;

    public Jewel(int id, int value) {
        this.id = id;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Jewel{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }
}
