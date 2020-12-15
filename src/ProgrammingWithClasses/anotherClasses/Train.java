package ProgrammingWithClasses.anotherClasses;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Train {

    private String destination;

    private int numberOfTrain;
    private LocalTime time;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public Train(String destination, int numberOfTrain, String time) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.time = LocalTime.parse(time, formatter);
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberOfTrain=" + numberOfTrain +
                ", time=" + time +
                '}';
    }

    public static void sortTrainsByNumberOfTrain(Train[] trains) {
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

        for (int i = 0; i < inputTrains.length; i++) {
            System.out.println(inputTrains[i]);
        }
    }

    public static void showInfoOfTrain(Train[] trains) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of train, which information would you like to see: ");
        int userNumberOfTrain = scanner.nextInt();
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].numberOfTrain == userNumberOfTrain) {
                System.out.println(trains[i]);
            }
        }
    }

    public static void sortTrainsByDestinationAndTime(Train[] trains) {
        for (int i = 0; i < trains.length - 1; i++) {
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[i].getDestination().compareTo(trains[j].getDestination()) > 0) {
                    Train currentTrain = trains[i];
                    trains[i] = trains[j];
                    trains[j] = currentTrain;
                } else if (trains[i].getDestination().compareTo(trains[j].getDestination()) == 0) {
                    if (trains[i].getTime().compareTo(trains[j].getTime()) > 0) {
                        Train currentTrain = trains[i];
                        trains[i] = trains[j];
                        trains[j] = currentTrain;
                    }
                }
            }
        }
        for (Train train : trains) {
            System.out.println(train);
        }
    }
}
