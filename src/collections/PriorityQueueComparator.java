package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

//kolejnosc rosnaca
class AscendingComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer x, Integer y) {
       if (x == y) return 0;
       if (x > y) return 1; //rosnaco
       else {
           return -1;
       }
    }
}

//kolejnosc malejaca
class DescendingComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer x, Integer y) {
        if (x == y) return 0;
        if (x < y) return 1; //malejaco
        else {
            return -1;
        }
    }
}

public class PriorityQueueComparator {
    public static void main(String[] args) {
        PriorityQueue<Integer> test = new PriorityQueue<>(new AscendingComparator());

        test.add(14);
        test.add(12);
        test.add(67);
        test.add(35);
        test.add(2);

        System.out.println("Ascending:");
        while (!test.isEmpty()){
            System.out.println(test.poll());
        }

        PriorityQueue<Integer> test2 = new PriorityQueue<>(new DescendingComparator());

        test2.add(25);
        test2.add(98);
        test2.add(32);
        test2.add(64);
        test2.add(5);

        System.out.println("\nDescending:");
        while (!test2.isEmpty()){
            System.out.println(test2.poll());
        }
    }
}
