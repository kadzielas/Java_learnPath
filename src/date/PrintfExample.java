package date;

import java.util.Date;

public class PrintfExample {
    public static void main(String[] args) {
        System.out.printf("Hello %s %d %f %b %n %tc", "World", 12, 5.6f, true, new Date());
        System.out.printf("%n %n Hello %s %2$tY.%2$tm.%2$td", "World", new Date());

        String str = String.format("%n %1$tT", new Date());
        System.out.println(str);

        str = String.format("%n %1$tH-%1$tM-%1$tS", new Date());
        System.out.println(str);
    }
}
