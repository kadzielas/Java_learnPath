package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
        System.out.println(date.hashCode());

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss -- dd.MM.yyyy");
        System.out.println(dateFormat.format(date));
    }
}
