package collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> test = new PriorityQueue<>();

        test.add(14);
        test.add(12);
        test.add(67);
        test.add(35);
        test.add(2);

        while (!test.isEmpty()){
            System.out.println(test.poll());
        }
        //poll z uzyciem petli while wyjmuje wszystkie elementy po kolei do momentu, az nie bedzie pusta Q
        /*
        2
        12
        14
        35
        67
         */

        test.add(74);
        test.add(32);
        test.add(82);
        System.out.println(test.peek());
        //peek pobiera pierwszą wartość (posortowana), ale nie zabierze jej z kolejki
    }
}
