package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormatChallenge {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        System.out.println(dateFormat.format(date));
    }
}
