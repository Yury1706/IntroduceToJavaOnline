package ProgrammingWithClasses;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Train {

    String destination;
    int numberOfTrain;
    LocalTime time;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public Train(String destination, int numberOfTrain, String time) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.time = LocalTime.parse(time, formatter);
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberOfTrain=" + numberOfTrain +
                ", time=" + time +
                '}';
    }

    private static Train[] sortTrainsByNumberOfTrain(Train[] trains) {
        Train[] inputTrains = trains;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[j].numberOfTrain < trains[j - 1].numberOfTrain) {
                    Train currentTrain = trains[j];
                    trains[j] = trains[j - 1];
                    trains[j - 1] = currentTrain;
                }
            }
        }
        return inputTrains;
    }

    private static void showInfoOfTrain(Train[] trains) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of train, which information would you like to see: ");
        int userNumberOfTrain = scanner.nextInt();
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].numberOfTrain == userNumberOfTrain) {
                System.out.println(trains[i]);
            }
        }
    }

    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("Brest", 1458, "10:00");
        trains[1] = new Train("Grodno", 1500, "18:00");
        trains[2] = new Train("Gomel", 1694, "09:00");
        trains[3] = new Train("Mogilev", 1351, "20:00");
        trains[4] = new Train("Brest", 1299, "12:00");

        Train[] sortedTrainsByNumberOfTrains = sortTrainsByNumberOfTrain(trains);
        for (int i = 0; i < sortedTrainsByNumberOfTrains.length; i++) {
            System.out.println(sortedTrainsByNumberOfTrains[i]);
        }

        showInfoOfTrain(trains);
    }
}
