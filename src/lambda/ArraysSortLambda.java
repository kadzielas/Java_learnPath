package lambda;

import java.util.Arrays;

public class ArraysSortLambda {
    public static void main(String[] args) {

        String arrStr[] = {"BMW", "Mercedes", "Audi", "Skoda", "Seat", "Dodge"};
        Arrays.sort(arrStr, (a, b) -> {return a.length() - b.length();});

        for(String s : arrStr){
            System.out.println(s);
        }

    }
}
