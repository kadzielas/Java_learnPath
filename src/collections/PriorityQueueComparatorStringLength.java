package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String x, String y) {
        return x.length() - y.length();

    }
}

public class PriorityQueueComparatorStringLength {
    public static void main(String[] args) {

        PriorityQueue<String> test = new PriorityQueue<>(new StringLengthComparator());
        test.add("Sebastian");
        test.add("Magda");
        test.add("Adam");
        test.add("Bogdan");
        test.add("Ola");

        while (!test.isEmpty()){
            System.out.println(test.poll());
        }

    }
}
