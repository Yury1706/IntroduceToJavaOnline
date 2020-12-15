package ProgrammingWithClasses.anotherClasses;

public class Time {

    int hour;
    int minute;
    int seconds;

    public Time(int hour, int minute, int seconds) {
        if (hour > 0 && hour < 13) {
            this.hour = hour;
        } else this.hour = 0;
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else minute = 0;
        if (minute >= 0 && minute < 60) {
            this.seconds = seconds;
        } else seconds = 0;
    }

    public void setHour(int hour) {
        if (hour > 0 && hour < 13) {
            this.hour = hour;
        } else this.hour = 0;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else this.minute = 0;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else this.seconds = 0;
    }

    @Override
    public String toString() {
        return "Заданное время - " +
                "hour = " + hour +
                ", minute = " + minute +
                ", seconds = " + seconds;
    }
}
