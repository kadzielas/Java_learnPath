package date.localTime;

import java.time.LocalDateTime;

public class LocalDateTimeChallenge {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTimeFuture = LocalDateTime.of(2026,05,19,14,10,10,50);

        if (localDateTimeFuture.isAfter(localDateTime)){
            System.out.println("Data jest z przyszlosci");
        }
    }
}
