package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList basicList = new ArrayList<>();
        basicList.add(new String("test"));
        basicList.add("info");

        String strEl = (String) basicList.get(0);
        System.out.println(strEl);

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Adam");
        arrStr.add("Magda");
        arrStr.add("Brutus");
        arrStr.add("Aleksandra");

        System.out.println("\n standard:");
        for (String s : arrStr){
            System.out.println(s);
        }

        System.out.println("\n after set and add new object:");
        arrStr.add(0, "Zuza");
        arrStr.set(2, "BHULK");

        for (String s : arrStr){
            System.out.println(s);
        }

        System.out.println("\n after sorting:");
        Collections.sort(arrStr);

        for (String s : arrStr){
            System.out.println(s);
        }

        System.out.println("\n after removing:");
        arrStr.remove(0);

        for (String s : arrStr){
            System.out.println(s);
        }



    }
}
