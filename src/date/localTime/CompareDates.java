package date.localTime;

import java.time.LocalDate;

public class CompareDates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, 10,19);
        LocalDate date2 = LocalDate.now();

        if (date1.isAfter(date2)){
            System.out.println("Date1 jest przed Date2");
        }
        if (date1.isBefore(date2)){
            System.out.println("Date1 NIE jest przed Date2");
        }
        if (date1.isEqual(date2)){
            System.out.println("Daty są takie same");
        }

    }
}
