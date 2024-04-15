package date.calendar;

import java.util.Calendar;
import java.util.Date;

public class calendarChallenge {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.add(Calendar.YEAR, 10);
        calendar.add(Calendar.DAY_OF_MONTH,3);
        calendar.add(Calendar.HOUR,10);
        calendar.add(Calendar.MINUTE,25);
        calendar.add(Calendar.SECOND, 6);

        Date newDate = calendar.getTime();
        System.out.println(newDate);


    }
}
