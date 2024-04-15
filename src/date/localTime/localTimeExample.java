package date.localTime;

import java.time.LocalTime;

public class localTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("Local time: " + localTime);
        System.out.println("Hour: " + localTime.getHour());
        System.out.println("Minutes: " + localTime.getMinute());
        System.out.println("Seconds: " + localTime.getSecond());

        localTime = localTime.plusHours(2);
        localTime = localTime.plusMinutes(20);

        System.out.println("Future time: " + localTime.getHour() + ":" + localTime.getMinute());
    }
}
