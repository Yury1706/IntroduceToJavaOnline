package BasicsOfOOP.Calendar;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

    List<Holiday> holidayList = new ArrayList<>();

    public class Holiday {
        String event;
        int day;
        int month;

        public Holiday(String event, int day, int month) {
            this.event = event;
            this.day = day;
            this.month = month;
            holidayList.add(this);
        }

        @Override
        public String toString() {
            return "Holiday{" +
                    "event='" + event + '\'' +
                    ", day=" + day +
                    ", month=" + month +
                    '}';
        }
    }

    public void showHolidays() {
        holidayList.forEach(System.out::println);
    }
}
