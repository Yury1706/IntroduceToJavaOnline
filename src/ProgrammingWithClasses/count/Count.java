package ProgrammingWithClasses.count;

public class Count {

    private String nameOfBank;
    private String numberOfCount;
    private double valueOfCount;
    private boolean isBlocked;

    public Count() {
    }

    public Count(String nameOfBank, String numberOfCount, double valueOfCount, boolean isBlocked) {
        this.nameOfBank = nameOfBank;
        this.numberOfCount = numberOfCount;
        this.valueOfCount = valueOfCount;
        this.isBlocked = isBlocked;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public String getNumberOfCount() {
        return numberOfCount;
    }

    public void setNumberOfCount(String numberOfCount) {
        this.numberOfCount = numberOfCount;
    }

    public double getValueOfCount() {
        return valueOfCount;
    }

    public void setValueOfCount(double valueOfCount) {
        this.valueOfCount = valueOfCount;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public String toString() {
        return "Count{" +
                "nameOfBank='" + nameOfBank + '\'' +
                ", numberOfCount='" + numberOfCount + '\'' +
                ", valueOfCount=" + valueOfCount +
                ", isBlocked=" + isBlocked +
                '}';
    }
}
