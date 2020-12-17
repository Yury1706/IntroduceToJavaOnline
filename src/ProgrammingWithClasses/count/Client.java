package ProgrammingWithClasses.count;

import java.util.Arrays;

public class Client {

    private int id;
    private String nameOfClient;
    private Count[] counts;
    private double totalValue;

    public Client() {
    }

    public Client(int id, String nameOfClient, Count[] counts) {
        this.id = id;
        this.nameOfClient = nameOfClient;
        this.counts = counts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfClient() {
        return nameOfClient;
    }

    public void setNameOfClient(String nameOfClient) {
        this.nameOfClient = nameOfClient;
    }

    public Count[] getCounts() {
        return counts;
    }

    public void setCounts(Count[] counts) {
        this.counts = counts;
    }

    public double getTotalValue() {
        for (int i = 0; i < counts.length; i++) {
            totalValue += counts[i].getValueOfCount();
        }
        return totalValue;
    }

    public void addCount(Count count) {
        Count[] currentCount;
        try {
            currentCount = new Count[counts.length + 1];
            for (int i = 0; i < counts.length; i++) {
                currentCount[i] = counts[i];
            }
        } catch (NullPointerException exc) {
            currentCount = new Count[1];
        }
        currentCount[currentCount.length - 1] = count;
        counts = currentCount;
    }

    public void blockCount(String numberOfCount) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i].getNumberOfCount().equals(numberOfCount) && counts[i].isBlocked() == false) {
                counts[i].setBlocked(true);
            }
        }
    }

    public void unblockCount(String numberOfCount) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i].getNumberOfCount().equals(numberOfCount) && counts[i].isBlocked() == true) {
                counts[i].setBlocked(false);
            }
        }
    }

    public void showAllCounts() {
        for (Count count : counts) {
            System.out.println(count);
        }
    }

    public void sortAndShowCounts() {
        for (int i = 0; i < counts.length; i++) {
            for (int j = counts.length - 1; j > i; j--) {
                if (counts[j].getValueOfCount() > counts[j - 1].getValueOfCount()) {
                    Count temp = counts[j];
                    counts[j] = counts[j - 1];
                    counts[j - 1] = temp;
                }
            }
        }
        for (Count count : counts) {
            System.out.println(count);
        }
    }

    public void searchCount(String numberOfCount) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i].getNumberOfCount().equals(numberOfCount)) {
                System.out.println("Информация по счету из поиска: " + counts[i]);
            }
        }
    }

    public void getTotalValueOfCounts() {
        for (int i = 0; i < counts.length; i++) {
            totalValue += counts[i].getValueOfCount();
        }
        System.out.println("Сумма по всем счетам равна: " + totalValue);
    }

    public void getTotalValueOfPositiveCounts() {
        double totalValueOfPositiveCounts = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i].getValueOfCount() > 0) {
                totalValueOfPositiveCounts += counts[i].getValueOfCount();
            }
        }
        System.out.println("Сумма по всем счетам с положительным балансом равна: " + totalValueOfPositiveCounts);
    }

    public void getTotalValueOfNegativeCounts() {
        double totalValueOfNegativeCounts = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i].getValueOfCount() < 0) {
                totalValueOfNegativeCounts += counts[i].getValueOfCount();
            }
        }
        System.out.println("Сумма по всем счетам с отрицательным балансом равна: " + totalValueOfNegativeCounts);
    }

    @Override
    public String toString() {
        return "Client " + nameOfClient + " {" +
                "id=" + id +
                ", counts=" + Arrays.toString(counts) +
                ", totalValue=" + getTotalValue() +
                '}';
    }
}
