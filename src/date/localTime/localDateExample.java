package date.localTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class localDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date: " + localDate);
        System.out.println(localDate.getDayOfMonth() + "." + localDate.getMonthValue() + "." + localDate.getYear());

        localDate = localDate.plusYears(10);
        localDate = localDate.minusDays(2);

        System.out.println(localDate);
    }
}
