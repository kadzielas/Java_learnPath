package collections;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetChallenge {
    public static void main(String[] args) {

        int low = 0;
        int high = 100;
        Random r = new Random();

        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < 30; i++) {
            int result = r.nextInt(high-low) + low;
            numbers.add(result);
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println("Iterator: " + iterator.next());
        }


    }
}
