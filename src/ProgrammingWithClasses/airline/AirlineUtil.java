package ProgrammingWithClasses.airline;

import java.time.LocalTime;

public class AirlineUtil {

    Airline[] airlines;

    public AirlineUtil() {
    }

    public AirlineUtil(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public void searchFlightsByDestination(String destination) {
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().equals(destination)) {
                System.out.println(airlines[i]);
            }
        }
        System.out.println();
    }

    public void searchFlightsByDayOfWeek(int numberOfDay) {
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDayOfWeek().getValue() == numberOfDay) {
                System.out.println(airlines[i]);
            }
        }
        System.out.println();
    }

    public void searchFlightsByDayAndTime(int numberOfDay, String time) {
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDayOfWeek().getValue() == numberOfDay) {
                if (airlines[i].getTime().isAfter(LocalTime.parse(time))) {
                    System.out.println(airlines[i]);
                }
            }
        }
        System.out.println();
    }
}
