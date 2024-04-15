package date.calendar;

import java.util.Calendar;
import java.util.Date;

public class DateInFutureAndPast {
    public static void main(String[] args) {

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(date);

        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, 16);
        calendar.add(Calendar.HOUR, -3);
        calendar.add(Calendar.MINUTE, -45);

        Date dateInFuture = calendar.getTime();
        System.out.println(dateInFuture);
    }
}
