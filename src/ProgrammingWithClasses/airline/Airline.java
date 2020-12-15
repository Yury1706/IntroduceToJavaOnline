package ProgrammingWithClasses.airline;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airline {

    // класс AirlineUtil агрегирует массив данного типа

    private String destination;
    private int numberOfFlight;
    private String typeOfPlain;
    private LocalTime time;
    private DayOfWeek dayOfWeek;

    public Airline() {
    }

    public Airline(String destination, int numberOfFlight,
                   String typeOfPlain, String time, int numberOfDay) {
        this.destination = destination;
        this.numberOfFlight = numberOfFlight;
        this.typeOfPlain = typeOfPlain;
        this.time = LocalTime.parse(time);
        this.dayOfWeek = DayOfWeek.of(numberOfDay);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfFlight() {
        return numberOfFlight;
    }

    public void setNumberOfFlight(int numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }

    public String getTypeOfPlain() {
        return typeOfPlain;
    }

    public void setTypeOfPlain(String typeOfPlain) {
        this.typeOfPlain = typeOfPlain;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = LocalTime.parse(time);
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = DayOfWeek.of(dayOfWeek);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", numberOfFlight=" + numberOfFlight +
                ", typeOfPlain='" + typeOfPlain + '\'' +
                ", time=" + time +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}
